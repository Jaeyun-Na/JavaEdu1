package polymorlphism;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "율곡이이");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
				
		customerList.add(customerLee);															//arrayList의 add 속성을 사용해 객체 배열에 고객 추가
		customerList.add(customerKim);
		customerList.add(customerShin);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("====== 고객 정보 출력 ======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 10000;
		for(Customer customer : customerList) {													//다형성 구현
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하였습니다.");
			System.out.println(customer.getCustomerName() + "님의 보유 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
//		customerLee.bonusPoint =1000;
//	
//		System.out.println(customerLee.showCustomerInfo());
//		
//		Customer customerKim = new VIPCustomer(10020, "김유신", 12345);
//		customerKim.bonusPoint = 1000;
//		
//		System.out.println(customerKim.showCustomerInfo());
//		System.out.println("===========할인율과 보너스 포인트 계산===========");
//		
//		int price = 10000;
//		int leePrice = customerLee.calcPrice(price);
//		int kimPrice = customerKim.calcPrice(price);
//		
//		System.out.println(customerLee.getCustomerName() + "님이 " + leePrice + "원 지불하셨습니다.");
//		System.out.println(customerLee.showCustomerInfo());
//		System.out.println(customerKim.getCustomerName() + "님이 " + kimPrice + "원 지불하셨습니다.");
//		System.out.println(customerKim.showCustomerInfo());
	}
}
