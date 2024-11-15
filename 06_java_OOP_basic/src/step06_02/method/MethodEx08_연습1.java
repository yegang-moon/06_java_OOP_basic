package step06_02.method;


class Ex08 {
	
	void printSum(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("total : " + total);
	}
	void printSumMultiple4(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				total += arr[i];
			}
		}
		System.out.println("4 의 배수의 합 : " + total);
	}
	void printCountMultiple4(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				count++;
			}
		}
		System.out.println("count : " + count);
		
	}
}


public class MethodEx08_연습1 {

	public static void main(String[] args) {
		
		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) arr요소의 전체 합을 출력하는 메서드
		// 정답 1) 362
		Ex08 object = new Ex08();
		object.printSum(arr);

		// 문제 2) 4의 배수의 합을 출력하는 메서드
		// 정답 2) 264
		object.printSumMultiple4(arr);

		// 문제 3) 4의 배수의 개수를 출력하는 메서드
		// 정답 3) 3
		object.printCountMultiple4(arr);
		

	}

}
