package step06_01.classObject;

/*
  
	# this
 
 	- this는 Java에서 객체 자신을 참조하기 위해 사용되는 키워드
	- this는 현재 객체의 참조를 나타낸다.
	- 클래스 내부에서 필드나 메서드를 호출할 때 사용된다.
	- 생성자나 메서드 내에서 필드와 파라메타를 구분하는데 유용하다.
 
 */

class Unit{
	
	int shield = 60;
	int hp = 100;
	
	void printData() {
		System.out.println("this : " + this);
		System.out.println("shield : " + this.shield); // this는 생략이 가능하다.
		System.out.println("hp : " + hp);
		System.out.println();
		
	}
	
	
	void upgrade() {
		shield += 1000;
		printData();
		//this.printData(); // this 는 생략이 가능하다
	}
	
	
	void heal (int hp) {
		this.hp += hp; // 전송된 데이터를 필드에 대입
	}
	
	
}


public class ClassEx15 {

	public static void main(String[] args) {
		
		
		Unit unit1 = new Unit();
		System.out.println("unit1 : " + unit1);
		unit1.shield = 0;
		unit1.printData();
		
		Unit unit2 = new Unit();
		System.out.println("unit2 : " + unit2);
		unit2.shield = 0;
		unit2.hp = 1;
		unit2.heal(30);
		unit2.heal(30);
		
		unit2.printData();
		
		Unit unit3 = new Unit();
		System.out.println("unit3 : " + unit3);
		//unit3.printData();
		unit3.upgrade();
		
		
		
	}
	
}
