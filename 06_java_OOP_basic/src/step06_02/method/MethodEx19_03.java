package step06_02.method;

/*

	# 생성자 오버로딩
	
	 - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
	 
	 - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
	   파라메타의 개수나 타입을 다르게 정의 하면 된다.

*/

class Product2 {
	
	String productId;
	String productNm;
	int price;
	
	// 기본 생성자
	Product2() {
		this.productId = "없음";
		this.productNm = "없음";
		this.price = -1;
	}
	
	// 생성자 오버로딩(중복정의)
	Product2(String productId) {
		this.productId = productId;
		this.productNm = "없음";
		this.price = -1;
	}
	
	// 생성자 오버로딩(중복정의)
	Product2(String productId , String productNm) {
		this.productId = productId;
		this.productNm = productNm;
		this.price = -1;
	}
	
	// 생성자 오버로딩(중복정의)
	Product2(String productId , String productNm , int price) {
		this.productId = productId;
		this.productNm = productNm;
		this.price = price;
	}
	
	void printData() {
		System.out.println("productId : " +  productId);
		System.out.println("productNm : " +  productNm);
		System.out.println("price : " +  price);
		System.out.println();
	}
	
	
}
	
public class MethodEx19_03 {

	public static void main(String[] args) {

		Product2 product1 = new Product2();
		product1.printData();
		
		Product2 product2 = new Product2("0x003");
		product2.printData();
		
		Product2 product3 = new Product2("0x002" , "청바지");
		product3.printData();
		
		Product2 product4 = new Product2("0x001" , "맨투맨" , 50000);
		product4.printData();
		
	}

}
