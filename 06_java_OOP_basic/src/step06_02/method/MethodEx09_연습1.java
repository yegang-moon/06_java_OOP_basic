
package step06_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class Ex09 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			int r = ran.nextInt(100) + 1;
			scores[i] = r;
		}
		System.out.println(Arrays.toString(scores));
	}
	
	//문제 2)
	void printSumAndAverage(int[] scores) {
		int total = 0;
		double avg = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		avg = (double)total / scores.length;
		System.out.println("총점 : " + total + " 평균 : " + avg);
	}
	
	//문제 3)
	void printWinner(int[] scores) {
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				count++;
			}
		}
		System.out.println("합격생 수 : " + count);
	}
	
	//문제 4)
	void printScore1(int[] scores) {
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		
		System.out.println(idx + "번 학생 점수 : " + scores[idx]);
	}
	
	//문제 5)
	void printScore2(int[] scores) {
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		for (int i = 0; i < scores.length; i++) {
			if (score == scores[i]) {
				System.out.println(score + "성적은 " + i + "번째 위치");
			}
		}
	}
	
	//문제 6)
	void printScore3(int[] hakbuns, int[] scores) {
		System.out.println("학번 목록 : " + Arrays.toString(hakbuns));
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		boolean isFind = false;
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbun == hakbuns[i]) {
				System.out.println(hakbun + "학생의 성적 : " + scores[i]);
				isFind = true;
			}
			if (isFind == false) {
				System.out.println("없는 학번입니다.");
			}
		}
	}
	
	//문제 7)
	void printNumberOne(int[] hakbuns, int[] scores) {
		int maxScores = 0;
		int maxIdx = 0;
		for (int i = 0; i < hakbuns.length; i++) {
			if (maxScores < scores[i]) {
				maxScores = scores[i];
				maxIdx = i;
			}
		}
		System.out.println("일등은 : " + hakbuns[maxIdx] + "학생" + maxScores + "점");
	}
	
}



public class MethodEx09_연습1 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		Ex09 object = new Ex09();
		object.setRandomValuesinArray(scores);

		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		object.printSumAndAverage(scores);
		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		object.printWinner(scores);
		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		object.printScore1(scores);
		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		object.printScore2(scores);
		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		object.printScore3(hakbuns, scores);
		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		object.printNumberOne(hakbuns, scores);
	}

}
