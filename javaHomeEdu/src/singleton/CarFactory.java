package singleton;

public class CarFactory {

	private static CarFactory instance = new CarFactory();								// CarFactory의 단일 인스턴스를 저장하는 정적 변수
	private CarFactory() {}																// 외부에서 인스턴스를 생성하지 못하도록 생성자를 private으로 선언
	
	public static CarFactory getInstance() {											// CarFactory의 싱글톤 인스턴스를 반환하는 정적 메서드
		
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
