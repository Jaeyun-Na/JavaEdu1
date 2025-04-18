package singleton;

public class Company {

	private static Company instance = new Company();		//�����ϰ� ������ �ν��Ͻ�(2�ܰ�)
	private Company() {}									//(1�ܰ�)
	
	public static Company getInstance() {					//�ν��Ͻ��� �ܺο��� ������ �� �ֵ��� public get()�޼��� ����
		if(instance == null) {
			instance = new Company();
		}
		return instance;									// �����ϰ� ������ �ν��Ͻ� ��ȯ
	}
	
	
}
