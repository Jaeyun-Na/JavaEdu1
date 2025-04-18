package singleton;

public class Car {

	private static int serialNum = 10000;								// �ڵ����� ���� ��ȣ�� �����ϱ� ���� ���� ����
	private int carNum;													// �� Car �ν��Ͻ��� ���� ��ȣ�� �����ϴ� �ν��Ͻ� ����
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {											// �ڵ����� ���� ��ȣ�� ��ȯ�ϴ� getter �޼���
		return carNum;
	}

	public void setCarNum(int carNum) {									// �ڵ����� ���� ��ȣ�� �����ϴ� setter �޼���
		this.carNum = carNum;
	}
	

	
}
