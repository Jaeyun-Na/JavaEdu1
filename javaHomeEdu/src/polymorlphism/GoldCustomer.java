package polymorlphism;

public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 01;
	}
	
	public int calcPrice(int price) {											//재정의한 매서드
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
}
