package kr.co.OOP;

public class objectOriented_객체지향4 {
	/*
	 * 생성자
	 * 
	 * 자바에서 클래스를 생설할떄 사용하는 person()같은 함수를 생서자라고 함. 클래스의 멤버 변수는 메서드오에 의해 값이 변경 될수도
	 * 있지만, 처음 클래스를 생성할 때 값을 정해야 하는경우도 있음. 생성자가 하는 일은 클래스를 처음 만들때 멤버변수나 상수를 초기화 하는것.
	 * 
	 * 
	 * 디폴트 생성자
	 * 
	 * 생서자는 클래스를 생성할때만 호출. 생성자 이름은 클래스 이름과 같고, 생성자는 반환값이 없음. Person클래스를 살펴보면
	 * Person() 생성자가 따로 없음.생성자 없는 클래스는 클래스 파일을 컴파일할 떄 자바 컴파일어에서 자동으로 생성자를 만들어줌. 자동으로
	 * 만들어 주는 생성자를 디폴트 생성자라고함.
	 * 
	 * 
	 * 
	 * 생성자 만들기
	 * 
	 * 필요한 경우 직접 생성자를 구현할수 있음. 생서자는 주로 멤버 변수에 대한 값을 매개변수로 받아서 인스턴스가 새로 생성 될때 멤버 변수
	 * 값을 초기화 하는 역활을 함. 즉 인스턴스가 생성됨과 동시에 멤버 변수의 값을 지정하고 인스턴스를 초기화 하기 위해 생성자를 직접 구현하여
	 * 사용함.
	 * 
	 * 
	 * 생성자 오버로드
	 * 
	 * 클래스에서 생성자가 두개 이상 제공되는 경우를 [생성자 오버로드(constructor overload)]라고 함.
	 * 필요에 따라 매개 변수가 다른 생성자를 여러개 만들수 있음.
	 * 클래스에 생성자를 여러개 제공하면 이클래스를 사용하는 코드에서는 원하는 생성자를 선택해 사용할수 있음.
	 * 경우에 따라서는 클래스에서 일부러 디폴트 생성자를 제공하지 않기도 한다.
	 * 
	 * 생성자의 주 역활은 인스턴스 변수의 초기화. Person클래스에서 여러가지 생성자를 제공한다면 이클래스를 사용하여 인스턴스를 만드는 경우 필요한 생성자를 골라서 사용할수 있음.
	 * 
	 * 
	 * 참조 자료형
	 * 
	 * 크기가 정해진 기본 자료형(int, char, float, double 등)으로 선언하는 변수가 있고, 클래스 자료형으로 선언하는 참조 자료형 변수가 있음.
	 * ex)
	 * student1,student2에서 학생에 대한 클래스이지만 과목에 대한 변수가 늘어남.
	 * Subject,student3에서는 과목 이름과 성적을 subject클래스로 분리하고, 학생 클래스에서 참조하도록함.
	 */
}
