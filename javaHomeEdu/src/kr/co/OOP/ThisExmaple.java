package kr.co.OOP;

class BirthDay{
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) {					// �¾ ������ �����ϴ� �޼���
		this.year = year;							// dDay.year = year;�� ����
	}
	
	public void printThis() {						// this ��� �޼���
		System.out.println(this);					// System.out.println(dDay);�� ����
	}
	
}


public class ThisExmaple {

	public static void main(String[]arg) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);							// �¾ �⵵ 2000���� ����
		System.out.println(bDay);					// ���� ���� ���
		bDay.printThis();							// this ��� �޼��� ȣ��
	}
}
