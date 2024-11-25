package step06_01.classObject;

/*

	# 제네릭(Generic)
	
	- 클래스 내부에서 사용하는 데이터의 타입(Type)을 
	  클래스의 인스턴스를 생성할 때 결정하는 것을 의미한다.
	  
	- 객체의 타입을 컴파일 시점에 체크하기 때문에 
	  타입 안정성을 높이고 형 변환의 번거로움을 줄일 수 있다.

*/
class Employee{}
class Manager{}
class Boss{}

class Before {
	Employee[] employees = new Employee[3];
	Manager[] managers = new Manager[3];
	Boss[] bosses = new Boss[3];
	
	int emIdx = 0;
	int maIdx = 0;
	int boIdx = 0;
	
	void add(Employee employee) {
		employees[emIdx] = employee;
		emIdx++;
	}
	void add(Manager manager) {
		managers[maIdx] = manager;
		maIdx++;
	}
	void add(Boss boss) {
		bosses[boIdx] = boss;
		boIdx++;
	}
	
	Employee getEmployee(int idx) {
		return employees[idx];
	}
	Manager getManager (int idx) {
		return managers[idx];
		
	}
	Boss getBoss (int idx) {
		return bosses[idx];
	}
	
}

// after 

class GenericEx<T> { // T : type
	
	Object[] objects = new Object[3];
	int idx = 0;
	
	void add (T data) {
		objects[idx] = data;		// 업캐스팅
		idx++;
	}
	
	T get (int idx) {
		return (T)objects[idx]; // 다운캐스팅
	}
	
}
public class ClassEx18 {

	public static void main(String[] args) {
		
		GenericEx<Employee> employees = new GenericEx<Employee>();
		GenericEx<Manager> managers = new GenericEx<Manager>();
		GenericEx<Boss> bosses = new GenericEx<Boss>();
		
		
		employees.add(new Employee());
		//employees.add(new Manager());
		//employees.add(new Boss());
		
		//managers.add(new Employee());
		managers.add(new Manager());
		//managers.add(new Boss());
		
		//bosses.add(new Employee());
		//bosses.add(new Manager());
		bosses.add(new Boss());
		
		
		System.out.println(employees.get(0));
		System.out.println(managers.get(0));
		System.out.println(bosses.get(0));
	}

}
