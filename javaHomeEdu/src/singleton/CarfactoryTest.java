package singleton;

public class CarfactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFactory factory = CarFactory.getInstance();				//CarFactory�� �̱��� �ν��Ͻ��� ������
		Car mySonata = factory.createCar();							//���丮�� �̿��Ͽ� �� ���� Car �ν��Ͻ��� ����
		Car yourSonata = factory.createCar();
		
		
																	// ������ �� �ڵ����� ���� ��ȣ�� ���
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		
	}

}
