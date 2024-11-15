package step06_02.method;

import java.util.Scanner;

class Ex05{

	void test1() {
		
		int total = 0;
		for (int i = 0; i < 5; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int maxNum = 0;
		for (int i = 0; i < 3; i++) {
			arr[i] = scan.nextInt();
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println(maxNum);
		scan.close();
	}
	
}


public class MethodEx05_연습1 {

	public static void main(String[] args) {

		
			Ex05 object = new Ex05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			object.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			object.test2();
	


	}

}
