package singleton;

public class CarfactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFactory factory = CarFactory.getInstance();				//CarFactory의 싱글톤 인스턴스를 가져옴
		Car mySonata = factory.createCar();							//팩토리를 이용하여 두 대의 Car 인스턴스를 생성
		Car yourSonata = factory.createCar();
		
		
																	// 생성된 두 자동차의 고유 번호를 출력
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		
	}

}
