package step06_02.method;

/*
 * 
 * # 메서드 오버로딩(overloading) , 메서드 중복정의
 * 
 *  1) 매개변수의 개수와 2) 매개변수의 데이터 타입이 달라도
 *  같은 이름으로 만들어진 여러개의 메서드를 정의하고 사용할 수 있는 기법  [ 메서드 오버라이딩과 헷갈림 주의 ]
 *  
 */


class MethodOverloadingEx{
	
	int add(int x, int y) {
		return x + y;
	}
	int add (int x, int y, int z) {
		return x + y + z;
	}
	double add (double x, double y) {
		return x + y;
	}
	int add (int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
}


public class MethodEx04 {

	public static void main(String[] args) {
		MethodOverloadingEx object = new MethodOverloadingEx();
		
		int result1 = object.add(100 , 10);
		int result2 = object.add(100 , 10 , 1);
		double result3 = object.add(3.14 , 7.14);
		
		int[] temp = {1,2,3,4,5};
		int result4 = object.add(temp);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		
		//사용예시
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('c');
		System.out.println(true);
		System.out.println("글자");
		
		
		
		String test = "abcdefg";
		test.substring(3);
		test.substring(0, 3);
	}

}
