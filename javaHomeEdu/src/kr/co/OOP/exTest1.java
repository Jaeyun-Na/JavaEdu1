package kr.co.OOP;

public class exTest1 {

//	String personName;
//	int personAge;
//	boolean personMarried;
//	int personChildren;
//
//	public String getpersonName() {
//		return personName;
//	}
//
//	public int getpersonAge() {
//		return personAge;
//	}
//
//	public boolean getpersonMarried() {
//		return personMarried;
//	}
//
//	public int getpersonChildren() {
//		return personChildren;
//	}
//
//	public static void main(String[] args) {
//		exTest1 personMan = new exTest1(); // Ŭ���� ����
//		personMan.personName = "James";
//		personMan.personAge = 40;
//		personMan.personMarried = true;
//		personMan.personChildren = 3;
//
////		System.out.println(personMan.personName);
//		System.out.println(personMan.getpersonName());
////		System.out.println(personMan.personAge);
//		System.out.println(personMan.getpersonAge());
////		System.out.println(personMan.personMarried);
//		System.out.println(personMan.getpersonMarried());
////		System.out.println(personMan.personChildren);
//		System.out.println(personMan.getpersonChildren());
//	}

	long orderNum;
	String userId;
	String orderDate;
	String orderName;
	String productNum;
	String address;

	public long getorderNum() {
		return orderNum;
	}

	public String getuserId() {
		return userId;
	}

	public String getorderDate() {
		return orderDate;
	}

	public String getorderName() {
		return orderName;
	}

	public String getproductNum() {
		return productNum;
	}

	public String getaddress() {
		return address;
	}

	public static void main(String[] args) {
		exTest1 orderPerson = new exTest1(); // Ŭ���� ����
		
		orderPerson.orderNum = 201803120001L;
		orderPerson.userId = "abs123";
		orderPerson.orderDate = "2018 - 03 - 12";
		orderPerson.orderName = "ȫ���";
		orderPerson.productNum = "PD0345-12";
		orderPerson.address = "����� �������� ���ǵ��� 20����";
		
		
		System.out.println("�ֹ���ȣ : "+orderPerson.getorderNum());
		System.out.println("�ֹ��� ���̵� : "+orderPerson.getuserId());
		System.out.println("�ֹ� ��¥ : "+orderPerson.getorderDate());
		System.out.println("�ֹ��� �̸� : "+orderPerson.getorderName());
		System.out.println("�ֹ� ��ǰ ��ȣ : "+orderPerson.getproductNum());
		System.out.println("��� �ּ� : "+orderPerson.getaddress());
		

	}
}
