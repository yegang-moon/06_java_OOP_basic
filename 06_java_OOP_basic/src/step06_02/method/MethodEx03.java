package step06_02.method;

/*
 * 
 * # return
 *   
 * 	1) 데이터를 반환한다. return 데이터는 오직 1개이다. 
 *  2) 메서드를 종료한다.
 *  
 * */
class Member {// 클래스의 이름은 대문자로 시작한다.

	// 필드(field) ,멤버변수 , 멤버 , 속성(properties)
	String id;
	String password;
	String name;

	class ReturnEx {

		void setScore(int score1) {
			score1 = 100;
		}

		int setScore2(int score2) {
			score2 = 100;
			return score2;
		}

		int testReturn() {

			System.out.println("리턴 전 명령어 1");
			System.out.println("리턴 전 명령어 2");
			System.out.println("리턴 전 명령어 3");

			// return 1,2,3,4,5; // 리턴데이터는 1개만 가능하므로 exception 발생
			return 0;
			// return 이 실행되는 순간 메서드가 종료되므로 exception 발생
			//System.out.println("리턴 후 명령어 1");
			//System.out.println("리턴 후 명령어 2");
			//System.out.println("리턴 후 명령어 3");

		}

		// 생각해보기
		int[] test1() {
			int[] arr = { 1, 2, 3, 4, 5 };
			return arr;
		}

		Member test2() {

			Member member = new Member();
			member.id = "admin";
			member.password = "admin";
			member.name = "관리자";
			return member;
		}

		String test3() {
			int n = 1;
			if (n % 2 == 0) {
				return "짝수";
			} else {
				return "홀수";
			}
		}

		String test4() {

			int n = 1;
			if (n % 2 == 0) {
				return "짝수";
			}
			return "홀수";
		}

	}

	public class MethodEx03 {

		public static void main(String[] args) {

			//ReturnEx object = new ReturnEx() {

			//int score1 = 777;
			// System.out.println("메서드 호출전 : " + score1); // 777
			//object.setScore(score1);
			//System.out.println("메서드 호출후 : " + score1); // 777
			//System.out.println("\n====================\n");

			//int score2 = 777;
			//System.out.println("메서드 호출전 : " + score2); // 777
			//object.setScore2(score2);
			//System.out.println("메서드 호출후 : " + score2); // 777

			//score2 = object.setScore2(score2);
			//System.out.println("메서드 호출후 : " + score2); // 777

		
		
			//}
		//}
//}
}
			}
	}


