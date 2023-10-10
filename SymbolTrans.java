package test;

import java.util.HashMap;
import java.util.Scanner;

public class SymbolTrans {

	public static HashMap<String, String[]> map = new HashMap<String, String[]>();

	static String[] plus = { "더하기", "플러스" };
	static String[] minus = { "빼기", "마이너스", "다시" };
	static String[] multi = { "곱하기", "애스태리커" };
	static String[] divide = { "나누기", "분의" };

	static {
		map.put("+", plus);
		map.put("-", minus);
		map.put("*", multi);
		map.put("/", divide);
	}

	// 특수기호 전사 함수
	public static String specialSymbolTrans(String text) {
		String[] transLation = map.get(text);
		
		for (int i = 0; i < transLation.length; i++) {
			System.out.println(transLation[i]);
		}
		return transLation.toString();
	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);

		String scanResult = scanner.nextLine();

		specialSymbolTrans(scanResult);

		scanner.close();
	}
}
