package step06_02.method;



class Ex11{
	
	int test1(int[] arr) { 
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i];
		}
		return tot; }
	int test2(int[] arr) { 
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 ==0) {
				tot += arr[i];
			}
		}
		return tot; }
	int test3(int[] arr) { 
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		return cnt; }
	int test4(int[] arr) { 
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 ==0) {
				cnt++;
			}
		}
		
		return cnt; }

}




public class MethodEx11_연습1 {

	public static void main(String[] args) {

	
			Ex11 object = new Ex11();
			
			int[] arr = {87, 100, 11, 72, 92};
	
			// 문제 1) arr의 요소들의 전체 합 리턴
			// 정답 1) 362
			int tot = object.test1(arr);
			System.out.println("tot = " + tot);
			
			
			// 문제 2) arr의 요소들의 4의 배수의 합 리턴
			// 정답 2) 264
			tot = object.test2(arr);
			System.out.println("tot = " + tot);
			
			
			// 문제 3) arr의 요소들의 4의 배수의 개수 리턴
			// 정답 3) 3
			int cnt = object.test3(arr);
			System.out.println("cnt = " + cnt);
			
			
			// 문제 4) arr의 요소들의 짝수의 개수 리턴
			// 정답 4) 3
			cnt = object.test4(arr);
			System.out.println("cnt = " + cnt);
			

	}

}
