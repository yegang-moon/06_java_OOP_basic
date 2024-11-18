package step06_02.method;

import java.util.Scanner;

class Theater_1 {
	Scanner scan = new Scanner(System.in);
	
	int[] seat = new int[10];
	int bookCnt = 0;
	int money = 0;
	
	
	void printMenu() {
		System.out.println("\n===메가박스 ===\n");
		System.out.println("1. 좌석확인");
		System.out.println("2. 좌석예약");
		System.out.println("3. 매출액 확인");
		System.out.println("4. 종료");
		
		
	}
	
	
	void printSeat(){
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 0) {
				System.out.print("[O]");
			}
			else {
				System.out.print("[X]");
			}
		}
		System.out.println();
	}
	
	void choiceSeat() {
		
		printSeat();
		
		System.out.print("좌석번호를 선택하세요[1 ~ 10] : ");
		int idx = scan.nextInt();
		
		if (seat[idx] == 0) {
			seat[idx] = 1;
			bookCnt++;
			System.out.println("예매를 완료하였습니다.");
		}
		else {
			System.out.println("이미 예매가 끝난 좌석입니다.");
		}
	}
	void printSales() {
		money = bookCnt * 12000;
		System.out.println("총 매출 금액 = " + money + "원");
	}
	void run(){
		
		while (true) {
			
			printMenu();
			
			System.out.print("메뉴선택 : ");
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

public class MethodEx14_연습2 {
	public static void main(String[] args) {
		Theater_1 object = new Theater_1();
		object.run();
	}
}
