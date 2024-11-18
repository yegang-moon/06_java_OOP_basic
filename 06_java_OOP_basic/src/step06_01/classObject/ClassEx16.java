package step06_01.classObject;
/*
   
	# Static
 	
 	- static은 클래스 레벨에서 공유되는 멤버를 의미한다.
	
	- 일반적인 멤버(필드나 메서드)는 객체를 생성해야 접근할 수 있지만, 
	  static으로 선언된 멤버는 객체를 생성하지 않고도 클래스 이름으로 접근할 수 있다.
	
	- 클래스 전체에서 공유되는 멤버라서 객체마다 별도로 저장되는 것이 아니라, 모든 객체가 동일한 값을 공유한다.
	
	- static 필드 (정적 변수)
	  static 필드는 클래스가 메모리에 로드될 때 자동으로 생성되며, 모든 객체가 해당 필드를 공유한다/ 
	  객체마다 별도로 저장되는 것이 아니라, 클래스 자체에 존재하기 때문에 어느 객체에서나 동일한 값을 참조할 수 있다.
 
	- static 메서드 (정적 메서드)
	  static 메서드는 클래스의 인스턴스(객체)를 생성하지 않고도 호출할 수 있는 메서드이다. 
	  따라서 인스턴스 변수(즉, 객체마다 다른 값을 가질 수 있는 변수)에는 접근할 수 없고, static 필드나 클래스 레벨의 멤버들만 사용할 수 있다.
 
   - 주로 공통 데이터 , 유틸리티 함수, 상수를 정의할 때 사용한다.
 
 */

class Character {
	
	
	int hp = 100;
	static int moveSpeed = 10;
	
	void printData() {
		
		System.out.println("hp : " + hp);
		System.out.println("moveSpeed : " + moveSpeed);
		System.out.println();
	}
	
	static void speedUP() {
		moveSpeed += 1000;
	}
}

public class ClassEx16 {

	public static void main(String[] args) {
		
		Character c1 = new Character();
		c1.hp = 0;
		// 클래스명.static변수명으로 사용
		Character.moveSpeed = 777;//c1.moveSpeed = 777;
		// 클래스명.static메서드명으로 접근
		Character.speedUP();
		
		c1.printData();
		Character c2 = new Character();
		c2.hp = 50;
	
		c2.printData();
		Character c3 = new Character();
		c3.printData();
		
		
		
		
		
		
		
		// static 사용예시
		System.out.println();
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3));
		
		try {
			Thread.sleep(3000);
			System.out.println("끝");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
