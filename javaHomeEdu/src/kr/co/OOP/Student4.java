package kr.co.OOP;

public class Student4 {

	public String studentName;							//�л� �̸�
	public int grade;									//�г�
	public int money;									//������
	
	public Student4(String studentName, int money) {		//�л� �̸��� �������� �Ű����� �޴� ������
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {						//�л��� ������ Ÿ�� 1500�� �����ϴ� �޼���
		bus.take(1500);
		this.money -= 1500;
	}
	public void takeSubway(Subway subway) {				//�л��� ����ö Ÿ�� 2000�� �����ϴ� �޼���
		subway.take(2000);
		this.money -= 2000;
	}
	public void showInfo() {							//�л� ������ ����ϴ� �޼���
		System.out.println(studentName + "���� ���� ���� " +  money + "�Դϴ�.");
	}
}
