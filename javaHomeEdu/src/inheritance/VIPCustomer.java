package inheritance;

/*
public class VIPCustomer {
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;												//vip �� ��� ���� ���̵�
	double saleRatio;													//������
	
	public VIPCustomer() {
		customerGrade = "VIP";											//�� ���
		bonusRatio = 0.05;												//���ʽ� ���� 5%
		saleRatio = 0.1;												//������ 10%
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);						//������ ����
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ���ε�� " + bonusPoint + "�Դϴ�.";
	}
	
}
*/

public class VIPCustomer extends Customer{								//VIPCustomer Ŭ������ Customer Ŭ������ ��ӹ���
	private int agentID;												//VIP �� ���� ���̵�
	double saleRatio;													//������
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";											//�� ���	-->	�����߻����� ���� Ŭ�������� private �����̹Ƿ� ������ �߻�
		bonusRatio = 0.05;												//���ʽ� ���� 5%
		saleRatio = 0.1;												//������ 10%
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}





