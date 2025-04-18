package singleton;

public class CarFactory {

	private static CarFactory instance = new CarFactory();								// CarFactory�� ���� �ν��Ͻ��� �����ϴ� ���� ����
	private CarFactory() {}																// �ܺο��� �ν��Ͻ��� �������� ���ϵ��� �����ڸ� private���� ����
	
	public static CarFactory getInstance() {											// CarFactory�� �̱��� �ν��Ͻ��� ��ȯ�ϴ� ���� �޼���
		
		if(instance == null) {
			instance = new CarFactory();
		}
		
		return instance;
	}
	
	public Car createCar() {
		 
		 Car car = new Car();
		return car;
		 
		 
	}
	
}
