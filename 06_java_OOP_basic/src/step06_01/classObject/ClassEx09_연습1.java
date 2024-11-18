package step06_01.classObject;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */


class Ex09 {
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}


public class ClassEx09_연습1 {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex09 object = new Ex09();
		
		int size = object.front.length;
		
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(size);
			int temp = object.front[0];
			object.front[0] = object.front[r];
			object.front[r] = temp;
		}
		while (true) {
			
			for (int i = 0; i < size; i++) {
				if 		(object.front[i] == 1) System.out.print("○\t");
				else if (object.front[i] == 2) System.out.print("□\t");
				else if (object.front[i] == 3) System.out.print("△\t");
				else if (object.front[i] == 4) System.out.print("♤\t");
				else if (object.front[i] == 5) System.out.print("◇\t");
			}
			System.out.println();
			
			for (int i = 0; i < size; i++) {
				if 		(object.back[i] == 1) System.out.print("○\t");
				else if (object.back[i] == 2) System.out.print("□\t");
				else if (object.back[i] == 3) System.out.print("△\t");
				else if (object.back[i] == 4) System.out.print("♤\t");
				else if (object.back[i] == 5) System.out.print("◇\t");
				else						System.out.print("■\t");
			}
			System.out.println();
			
			if (object.answerCnt == 5) {
				break;
			}
			System.out.print("인덱스1 입력 : ");
			int idx1 = scan.nextInt();
			
			System.out.print("인덱스2 입력 : ");
			int idx2 = scan.nextInt();
			
			if (object.front[idx1] == object.front[idx2]) {
				object.back[idx1] = object.front[idx1];
				object.back[idx2] = object.front[idx2];
				object.answerCnt++;
			}
		}
		scan.close();

	}

}
