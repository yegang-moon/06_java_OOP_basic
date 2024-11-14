package step06_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수


  
class Ex03_practice1{
	int[] arr = {87, 100, 11, 72, 92};
}
	




public class ClassEx03_연습1 {

	public static void main(String[] args) {
		
		
		Ex03_practice1 object = new Ex03_practice1();
		
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int result = 0;
		for (int i = 0; i < object.arr.length; i++) {
			result += object.arr[i];
		}
		System.out.println(result);
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		result = 0;
		for (int i = 0; i < object.arr.length; i++) {
			if (object.arr[i] % 4 == 0) {
				result += object.arr[i];
			}
		}
		System.out.println(result);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int count4 = 0;
		for (int i = 0; i < object.arr.length; i++) {
			if (object.arr[i] % 4 == 0) {
				count4++;
			}
		}
		System.out.println(count4);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int evenNum = 0;
		for (int i = 0; i < object.arr.length; i++) {
			if (object.arr[i] % 2 == 0) {
				evenNum++;
			}
		}
		System.out.println(evenNum);

	}

}
