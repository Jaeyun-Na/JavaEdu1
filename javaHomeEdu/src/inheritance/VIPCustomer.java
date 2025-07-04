package inheritance;

/*
public class VIPCustomer {
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;												//vip 고객 담당 상담원 아이디
	double saleRatio;													//할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";											//고객 등급
		bonusRatio = 0.05;												//보너스 적립 5%
		saleRatio = 0.1;												//할인율 10%
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);						//할인율 적용
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인드는 " + bonusPoint + "입니다.";
	}
	
}
*/

public class VIPCustomer extends Customer{								//VIPCustomer 클래스는 Customer 클래스를 상속받음
	private int agentID;												//VIP 고객 상담원 아이디
	double saleRatio;													//할인율
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";											//고객 등급	-->	오류발생이유 상위 클래스에서 private 변수이므로 오류가 발생
		bonusRatio = 0.05;												//보너스 적립 5%
		saleRatio = 0.1;												//할인율 10%
//		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
}





