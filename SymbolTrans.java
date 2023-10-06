package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SymbolTrans {

	public static HashMap<String, Object> map = new HashMap<>();
	
	//map 변수를 static 블록에서 초기화 
	static {
		map.put("+", Arrays.asList("더하기","플러스"));
		map.put("-", Arrays.asList("빼기","마이너스","다시"));
		map.put("*", Arrays.asList("곱하기","애스태리커"));
		map.put("/", Arrays.asList("나누기","분의")); //"슬래시","작대기" 
	}

	
	// 특수기호 전사 함수
	public static String specialSymbolTrans(String text) {
		Object transLation = map.get(text);
		return transLation.toString();
	}

	
	public static void main(String args[]) { 

		Scanner scanner = new Scanner(System.in); 
		System.out.println(scanner);
		
		String scanResult = scanner.nextLine();
		String result = specialSymbolTrans(scanResult);
		
		//for문으로 result list 길이만큼 돌아서 값을 하나씩 따로 빼기
		System.out.println(result);

		scanner.close(); 
	}
}
