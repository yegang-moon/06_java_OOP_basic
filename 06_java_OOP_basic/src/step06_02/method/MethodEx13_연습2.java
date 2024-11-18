package step06_02.method;

import java.util.Arrays;
import java.util.Random;

class ScoreMng_1{
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 5};
	int[] hgd = new int[5];
	
	int answerCnt = 0;
	int score = 0;
	
	void makeAnswer() {
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5) + 1;
		}
	}
	
	void showAnswer() {
		System.out.print("omr = ");
		System.out.println(Arrays.toString(omr));
		
		System.out.print("rNum = ");
		System.out.println(Arrays.toString(hgd));
	}
	
	void checkAnswer() {
		answerCnt = 0;
		System.out.print("정오표 = [");
		
		for (int i = 0; i < omr.length; i++) {
			if (omr[i] == hgd[i]) {
				System.out.print("O ");
				answerCnt++;
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println("]");
		
		score = 20 * answerCnt;
		System.out.println("점수 = " + score + "점");
	}
	
	
	void run() {
		makeAnswer();
		showAnswer();
		checkAnswer();
	}
	
}




public class MethodEx13_연습2 {
	
	public static void main(String[] args) {

		ScoreMng_1 object = new ScoreMng_1();
		
		object.run();
		
	}
}
