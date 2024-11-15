package step06_02.method;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 		- 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있다.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 )
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	
	// 입력값도 없고 결과값도 없는 경우
	void type00() {
		
		System.out.println("===============");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 개인정보조회");
		System.out.println("4. 종료");
		System.out.println("===============\n");
		
		//return;
	}
	// 입력값은 있고 결과값은 없는 경우
	void type10(String fileName) { // 파라메타 (parameter), 아규먼트 (arguments),  매개변수
		
		// 파라메타의 범위 (scope)는 메서드 내부
		
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	// 입력값은 없고 결과값은 있는 경우
	
	double type01() {
		return 3.141592;
	}
	
	// 입력값과 결과값이 모두 있는 경우
	
	int type11(String birth) {
		
		String temp = birth.substring(0 ,4);
		
		int age = 2024 - Integer.parseInt(temp) + 1;
		
		
		
		return age;
	}
	
	
}



public class MethodEx02 {

	public static void main(String[] args) {
		
		MethodType object = new MethodType();
		
		// 입력값도 없고 결과값도 없는 경우
		object.type00();
		System.out.println();
		
		//예시
		//fr.close();
		//br.close();
		//scan.close();
		
		
		
		// 입력값은 있고 결과값은 없는 경우
		object.type10("order.txt");
		object.type10("product.txt");
		object.type10("user.txt");
		object.type10("cart.txt");
		object.type10("authentication.txt");
		
		
		// 오류 ( 파라메타의 타입이 일치해야만 한다.) 
		
		// object.type10(100);
		// object.type10(3.3);
		
		// 오류 ( 파라메타의 개수가 일치해야만 한다.) 
		//object.type10("order.txt", "product.txt");
		//object.type10("order.txt", "product.txt" , "user.txt");
		
		
		//예시
		//fw.write("파일연습\n");
		//System.out.println("테스트");
		
		
		// 입력값은 없고 결과값은 있는 경우
		double pi = object.type01();
		System.out.println("pi : " + pi);
		System.out.println("pi : " + object.type01());
		
		System.out.println();
		
		// 예시
		// int length = "abcdefg".length();
		
		// 입력값과 결과값이 모두 있는 경우
		int result = object.type11("19900101");
		System.out.println("나이 : " + result + "살");
		
		
		System.out.println("나이 : " + object.type11("20000101") + "살");
		object.type11("20000101");
		
		if (object.type11("20100101") == 15) {
			System.out.println("15살 입니다.");
		}
		
		// 예시 
		// String test = "abcde";
		// char ch = test.charAt(0);
		// int idx = test.indexOf("c");
		// String substr = test.substring(0, 2);
		// String[] splarr = test.split("c");
	}

}


