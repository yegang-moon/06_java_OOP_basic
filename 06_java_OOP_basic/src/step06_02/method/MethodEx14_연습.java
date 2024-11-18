 package step06_02.method;

import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class Theater {
	
	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];
	int bookCnt = 0;				
	int money = 0;					
	
	// 메뉴를 출력한다.
	void printMenu() {
		
		System.out.println("\n=== 메가박스 ===");
		System.out.println("1. 좌석 확인");
		System.out.println("2. 좌석 예약");
		System.out.println("3. 매출액 확인");
		System.out.println("4. 종료");
		
	}
	
	// 좌석을 출력한다.
	void printSeat() {
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 0) {
				System.out.print(" [X] ");
			}
			else {
				System.out.print(" [O] ");
			}
		}
		System.out.println();
		
	}
	
	
	// 좌석을 선택한다.
	void choiceSeat() {
		
		printSeat();
		
		System.out.print("좌선번호를 선택하세요[1 ~ 10] : ");
		int idx = scan.nextInt() - 1;
		
		if (seat[idx] == 0) {
			seat[idx] = 1;
			bookCnt++;
			System.out.println("예매를 완료하였습니다.");
		}
		else {
			System.out.println("이미 예매가 끝난 좌석입니다.");
		}
		
	}
	
	// 판매액을 출력한다.
	void printSales() {
		money = bookCnt * 12000;
		System.out.println("총 매출 금액 = " + money + "원");
	}
	
	
	void run() {
		
		while (true) {
			
			printMenu();
			
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				printSeat();
			}
			else if (choice == 2) {
				choiceSeat();
			}
			else if (choice == 3) {
				printSales();
			}
			else if (choice == 4) {
				System.out.println("어플리케이션 종료");
				break;
			}
			
		}
		
	}
	
}

public class MethodEx14_연습 {

	public static void main(String[] args) {

		Theater object = new Theater();
		object.run();
		
	}

}
