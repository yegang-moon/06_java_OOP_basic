package step06_01.classObject;

import java.util.Random;
import java.util.Scanner;

class Ex04_practice1 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}



public class ClassEx04_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex04_practice1 object = new Ex04_practice1();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < object.hakbuns.length; i++) {
			object.scores[i] = ran.nextInt(100) + 1;
			System.out.print(object.scores[i] + " ");
		}
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int total = 0;
		int avg = 0;
		for (int i = 0; i < object.hakbuns.length; i++) {
			total += object.scores[i];
		}
		avg = total / object.hakbuns.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int count = 0;
		for (int i = 0; i < object.hakbuns.length; i++) {
			if (object.scores[i] > 60) {
				count++;
			}
		}
		System.out.println(count);
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		for (int i = 0; i < object.hakbuns.length; i++) {
			if (object.scores[i] == object.scores[idx]) {
				idx = i;
			}
		}
		System.out.println("성적 : " + object.scores[idx]);
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		idx = 0;
		for (int i = 0; i < object.hakbuns.length; i++) {
			if (score == object.scores[i]) {
				idx = i;
			}
		}
		System.out.println("인덱스 : " + idx);
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		for (int i = 0; i < object.hakbuns.length; i++) {
			if (hakbun == object.hakbuns[i]) {
				System.out.println(object.scores[i]);
			}
		}
	
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.print("학번 입력 : ");
		hakbun = scan.nextInt();
		int check = -1;
		
		for (int i = 0; i < object.hakbuns.length; i++) {
			if (hakbun == object.hakbuns[i]) {
				check = i;
			}
		}
		if (check == -1) {
			System.out.println("해당학번은 존재하지 않습니다.");
		}
		else {
			System.out.println(object.scores[check]);
		}
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int maxIdx = 0;
		int maxScore = 0;
		for (int i = 0; i < object.hakbuns.length; i++) {
			if (maxScore < object.scores[i]) {
				maxScore = object.scores[i];
				maxIdx = i;
			}
		}
		System.out.println(object.hakbuns[maxIdx] + "번 " + maxScore + "점" );
	}

}
