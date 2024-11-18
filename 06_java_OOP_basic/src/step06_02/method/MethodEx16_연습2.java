package step06_02.method;

import java.util.Random;
import java.util.Scanner;

class MemoryGame_1 {
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int correctCnt = 0;
	
	void shuffle() {
		
	}
	void printCard() {
		
	}
	void choiceCard() {
		
	}
	void run() {
		
		shuffle();
		
		while (true) {
			printCard();
			
			if (correctCnt == 5) {
				System.out.println("게임종료");
				break;
				
			}
			choiceCard();
		}
	}
}


public class MethodEx16_연습2 {
	public static void main(String[] args) {
		
		MemoryGame_1 object = new MemoryGame_1();
		object.run();
	}
}
