package step06_01.classObject;

/*
 
 	# 싱글턴 디자인 패턴 (Singleton Design Pattern) 
 
	  - 객체를 1번만 생성하고 싶을 때 사용하는 기법
	  
	  - 싱글턴 패턴을 구현하는 방법
	  
	    1) private 기본 생성자를 만든다.
	    2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
		3) instance를 반환할 getter를 만들어준다.	  
  
*/
class SingleTonTest {
	//1) private 기본 생성자를 만든다.
	private SingleTonTest(){}
	
	//2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
	private static SingleTonTest instance = new SingleTonTest();
	
	//3) instance를 반환할 getter를 만들어준다
	public static SingleTonTest getInstance() {
		return instance;
	}
	
	// 테스트 필드
	String testVar = "테스트 변수";
	// 테스트 메서드
	void testMethod() {
		System.out.println("테스트 메서드");
	}
}

class NormalClass {}

public class ClassEx17 {

	public static void main(String[] args) {
		System.out.println(new NormalClass()); // 다른 주소 (객체)
		System.out.println(new NormalClass()); // 다른 주소 (객체)
		System.out.println(new NormalClass()); // 다른 주소 (객체)
		System.out.println();
		
		//System.out.println(new SingleTonTest()); // X, 1번 적용
		//System.out.println(new SingleTonTest()); // X, 1번 적용
		//System.out.println(new SingleTonTest()); // X, 1번 적용
		
		System.out.println(SingleTonTest.getInstance()); // 같은 주소 , (객체)new SingleTonTest(); , 3번 적용
		System.out.println(SingleTonTest.getInstance()); // 같은 주소 , (객체)new SingleTonTest(); , 3번 적용
		System.out.println(SingleTonTest.getInstance()); // 같은 주소 , (객체)new SingleTonTest(); , 3번 적용
		System.out.println();
		// 싱글턴클래스.instance.필드명
		System.out.println(SingleTonTest.getInstance().testVar);
		
		// 싱글턴클래스.instance.메서드명()
		SingleTonTest.getInstance().testMethod();
	}

}
