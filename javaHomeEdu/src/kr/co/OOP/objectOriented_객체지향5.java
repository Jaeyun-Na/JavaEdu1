package kr.co.OOP;

public class objectOriented_객체지향5 {

	/*
	 * 정보 은닉
	 * 
	 * 접근 제어자 살펴보기
	 * 
	 * 객체지향 프로그램엣거는 예약어르 사용하여 클래스 내부의 변수나 메서드,생성자에 대한 접근 권한을 지정할 수 있음.
	 * 이러한 예약어를 '접근 제어자'라고 함.
	 * public이라 선언한 변수나 메서드는 외부 클래스에서 접근이 가능하며, 외부클래스가 사용할수 있음.
	 * 반대로 접근제어자를 private로 선언한 변수나 메서드는 외부 클래스에서 사용이 불가능함.
	 * 
	 * student클래스의 studentName변수를 private로 바꾸면 각 studentName을 참조하던 변수들에 에러발생을 확인할수있음.
	 * 
	 * get(),set() 메서드
	 * private로 선언한 studentName변수를 외부 코드에서 사용하기 위해서는 public 메서드가 제공되어야함.
	 * 이떄 사용가능한것이 get(),set() 메서드
	 * 
	 * studentName 멤버 변수에 이름값을 집접 대입하는것이 아닌 setStudentName()메서드르 활용하여 값을 대입할수 있음(hiding - StudentTest)
	 * 
	 * 정보은닉이란
	 * 
	 * 클래스 내부에서 사용할 변수나 메서드는 private로 선언해서 외부에서 접근하지 못하도록 하는것을 객체지향에서 정보은닉이라고 함.
	 * 정보은닉은 객체지향 프로그래밍의 특징 중 하나이며 자바에서는 접근제어자를 사용하여 정보은닉을 구현
	 * 모든 변수를 private로 선언해야하는것은 아니지만, 필요한 경우에는 private로 선언 하여 오류를 막을수 있음.
	 * 
	 * 	접근제어자							설명
	 * 	public					외부 클래스 어디에서나 접근할 수 있음.
	 * 	protected				같은 패키지 내부와 상속 관계의 클래스
	 * 	아무것도 없음				default이며 같은 클래스 내부에서만 접근가능
	 * 	private					같은 클래스 내부에서만 접근할 수 있음.
	 * 
	 * 
	 * [exTest]
	 * MyDate와 MyDateTest 클래스 만들기
	 * <MyDate 클래스 완성하기>
	 * day, month, year변수는 private로 선언
	 * 각 변수의 get, set 메서드를 public으로 만듬
	 * MyDate(int day, int month, int year) 생성자 만듬
	 * public boolean isValid()메서드를 만들어 날짜가 유효한지 확인
	 * MyDateTest 클래스에서 생성한 MyDate 날짜가 유효한기 확인
	 * 
	 * class MyDateTest{
	 * 	MyDate date1 = new MyDate(30, 2, 2000);
	 * 	System.out.println(date1.isValid());
	 * 	MyDate date2 = new MyDate(2, 10, 2006);
	 * 	System.out.println(date2.isValid());
	 * 	}
	 * 
	 * <출력 결과>
	 * 유효하지 않은 날짜입니다.
	 * 유효한 날짜입니다.
	 * 
	 */
	
}
