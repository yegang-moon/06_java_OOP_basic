package step06_02.method;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

// 생성자를 이용한 필드 초기화

class Product {
	
	String productId;
	String productNm;
	int price;
	
	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
	
	
	Product(String productId, String productNm, int price) {
		this.productId = productId;
		this.productNm = productNm;
		this.price = price;
	}
	void setData (String productId, String productNm, int price) {
		this.productId = productId;
		this.productNm = productNm;
		this.price = price;
	}
	void printData () {
		System.out.println("productId : " + productId);
		System.out.println("productNm : " + productNm);
		System.out.println("price : " + price);
		System.out.println();
	}
}






public class MethodEx19_02 {

	public static void main(String[] args) {
		  
		// (before)
		/*
		Product before1 = new Product();
		before1.productId = "0x001";
		before1.productNm = "맨투맨";
		before1.price = 50000;
		before1.printData();
		// (before)
		Product before2 = new Product();
		before2.setData("0x001", "맨투맨", 50000);
		before2.printData();
		*/
		
		// (after) 생성자를 이용한 필드 초기화
		
		Product product1 = new Product("0x001", "맨투맨", 50000);
		product1.printData();
		Product product2 = new Product("0x002", "청바지", 40000);
		product2.printData();
		// 생성자 사용예시
		
		
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		DecimalFormat df = new DecimalFormat("#.##0");
		
	}

}
