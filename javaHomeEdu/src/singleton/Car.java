package singleton;

public class Car {

	private static int serialNum = 10000;								// 자동차의 고유 번호를 생성하기 위한 정적 변수
	private int carNum;													// 각 Car 인스턴스의 고유 번호를 저장하는 인스턴스 변수
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {											// 자동차의 고유 번호를 반환하는 getter 메서드
		return carNum;
	}

	public void setCarNum(int carNum) {									// 자동차의 고유 번호를 설정하는 setter 메서드
		this.carNum = carNum;
	}
	

	
}
