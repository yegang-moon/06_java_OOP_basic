package step06_02.method;

import java.util.ArrayList;

/*
 
	# toString 메서드
	
	- 객체에 관한 정보를 문자열로 표현하는 메서드
	- 모든 클래스의 부모 클래스인 java.lang.Object 클래스에 정의되어 있다. 
	- 자바의 모든 객체는 기본적으로 toString() 메서드를 상속받는다.
	
*/
// @ToString < 나중에 spring boot 에서 사용하는 방식
class Order {
	
	private long orderId;
	private long productId;
	private String userId;
	private String productNm;
	private String deliveryMethod;
	private String deliveryAddress;
	private String deliveryMessage;
	
	public long getOrderId() {
		return orderId;
	}
	public long getProductId() {
		return productId;
	}
	public String getUserId() {
		return userId;
	}
	public String getProductNm() {
		return productNm;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public String getDeliveryMessage() {
		return deliveryMessage;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public void setDeliveryMessage(String deliveryMessage) {
		this.deliveryMessage = deliveryMessage;
	}
	
// toString 생성 단축키
// 좌측 상단 Source > Generate toString > Generate
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId + ", userId=" + userId + ", productNm="
				+ productNm + ", deliveryMethod=" + deliveryMethod + ", deliveryAddress=" + deliveryAddress
				+ ", deliveryMessage=" + deliveryMessage + "]";
	}
	
	
}
	

public class MethodEx20 {

	public static void main(String[] args) {

		Order order1 = new Order();
		order1.setOrderId(1);
		order1.setProductId(1111);
		order1.setUserId("user1");
		order1.setProductNm("스프링문법");
		order1.setDeliveryAddress("테헤란로");
		order1.setDeliveryMethod("택배수령");
		order1.setDeliveryMessage("경비실 앞에 맡겨주세요.");
		System.out.println(order1); // toString 메서드 호출, 주소로서의 기능은 유효 vs 상실 : 유효
		
		//System.out.println(order1.getProductNm());
		//System.out.println(order1.getUserId());
		//System.out.println(order1.getDeliveryAddress());
		System.out.println();
		
		
		Order order2 = new Order();
		order2.setOrderId(2);
		order2.setProductId(222);
		order2.setUserId("user2");
		order2.setProductNm("JSP문법");
		order2.setDeliveryAddress("삼성동");
		order2.setDeliveryMethod("편의점");
		order2.setDeliveryMessage("배송전 연락주세요.");
		System.out.println(order2); // toString 메서드 호출, 주소로서의 기능은 유효 vs 상실 : 유효
		
		
		ArrayList<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < 10; i++) {
			Order temp = new Order();
			temp.setOrderId(i);
			temp.setProductId(i * 1000);
			temp.setUserId("유저" +  i);
			temp.setProductNm("JSP문법");
			temp.setDeliveryAddress("삼성동");
			temp.setDeliveryMethod("편의점");
			temp.setDeliveryMessage("배송전 연락주세요.");
			orderList.add(temp);
		}
		System.out.println(orderList);
		
		for (Order order : orderList) {
			System.out.println(order);
		}
	}

}
