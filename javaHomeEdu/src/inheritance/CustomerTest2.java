package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer(0, null, 0);
//		customerKim.setCustomerID(10020);		
//		customerKim.setCustomerName("������");		
		customerKim.bonusPoint = 10000;		
		System.out.println(customerKim.showCustomerInfo());
				
	}

}
