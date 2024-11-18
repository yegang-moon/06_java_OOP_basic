package step06_02.method;

import java.util.Scanner;

class NumberGame_1 {
	
	Scanner scan = new Scanner(System.in);
	int[] move = {0, 0, 0, 0, 777, 0, 0, 0, 0, 0};
	int playerLocation = 4;
	
	void printPlay() {
		
		for (int i = 0; i < move.length; i++) {
			if (move[i] == 0) 	System.out.print("[ ]");
			else				System.out.print("옷");
		}
		System.out.println();
	}
	
	void printMenu() {
		System.out.println("1. 좌로이동");
		System.out.println("2. 우로이동");
		System.out.println("3. 종료하기");
	}
	
	void moveLeft() {
		
		if (playerLocation > 0) {
			move[playerLocation] = 0;
			move[playerLocation - 1] = 777;
			playerLocation--;
		}
		else {
			System.out.println("더이상 움직일 수 없습니다.");
		}
	}
	void moveRight() {
		if (playerLocation < move.length - 1) {
			move[playerLocation] = 0;
			move[playerLocation + 1] = 777;
			playerLocation++;
		}
		else {
			System.out.println("더이상 움직일 수 없습니다.");
		}
	}
	
	
	
	void run() {
		while (true) {
			printPlay();
			printMenu();
			System.out.println(": ");
			int choice = scan.nextInt();
			if (choice == 1) {
				moveLeft();
			}
			else if (choice == 2) {
				moveRight();
			}
			else if (choice == 3) {
				System.out.println("게임종료");
				break;
			}
		}
	}
}



public class MethodEx15_연습2 {

	public static void main(String[] args) {
		NumberGame_1 object = new NumberGame_1();
		object.run();
	}

}
