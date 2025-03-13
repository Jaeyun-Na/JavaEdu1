package kr.co.OOP;

public class objectOriented_객체지향6 {

	/*
	 * This 예약어
	 * 
	 * 생성된 인스턴스 스스로를 가리키는 예약어
	 * 
	 */

	/*
	 * class BirthDay{
	 * 
	 * int day; int month; int year;
	 * 
	 * public void setYear(int year) { // 태어난 연도를 지정하는 메서드 this.year = year; //
	 * dDay.year = year;와 같음 }
	 * 
	 * public void printThis() { // this 출력 메서드 System.out.println(this); //
	 * System.out.println(dDay);와 같음 }
	 * 
	 * }
	 * 
	 * 
	 * public class BirthDayEx {
	 * 
	 * public static void main(String[]arg) { BirthDay bDay = new BirthDay();
	 * bDay.setYear(2000); // 태어난 년도 2000으로 지정 System.out.println(bDay); // 참조 변수 출력
	 * bDay.printThis(); // this 출력 메서드 호출 } }
	 */

	/*
	 * 인스턴스를 가리키는 변수가 참조 변수이며, 참조 변수를 출력하면 '클래스 이름@메모리 주소'문자열 값이 나옴 출력 결과를 보면
	 * bDay.printThis()메서드를 호출하여 출력한 this 값이 참조 변수 bDay를 출력한 값과 같음. 클래스 코드에서 사용하는
	 * this는 생성된 인스턴스 자신을 가리키는역활을 함. 따라서 this.year = year;문장으로 참조하면 동적 메모리에 생성된
	 * 인스턴스의 year 변수 위치를 가리키고 그 위치에 매개변수 값을 넣어 주는 것임.
	 * 
	 * 스택 메모리 힙 메모리 SetYear() this-------| BirthDay 클래스 생성 main()
	 * bDay--------------------------> year main() args month day main() 함수는
	 * ThisExmaple 클래스의 시작 메서드 main()함수에서 bDay 변수가 가리키는 인스턴스와 BirthDay 클래스의
	 * setYear() 매서드에서 this가 가리키는 인스턴스가 같은 곳에 있음.
	 * 
	 * 
	 * 생성자에서 다른 생성자를 호출하는 this
	 * 
	 * 클래스에 생성자가 여러 개 있을 떄 어떤 생성자에서 다른 생성자를 호출하는 경우가 종종 있음. 이때 this를 사용 클래스의 생성자에서
	 * 다른 생성자를 호출할 수 있음.
	 */
	
	/*
	 * class Person{ String name; int age;
	 * 
	 * Person(){
	 *  this("이름없음",1);
	 *   } 
	 *   
	 *   Person(String name, int age){
	 *    this.name = name;
	 * 	  this.age = age;
	 *  }
	 * }
	 * 
	 * public class CallAnotherConst {
	 * 
	 * public static void main(String[] args) {
	 *  
	 * Person noName = new Person();
	 * System.out.println(noName.name);
	 * System.out.println(noName.age);
	 * 		} 
	 * }
	 */
	
	/*	Person 클래스에는 Person() 디폴트 생성자와 매개변수를 갖는 Person(String name, int age) 생성자가 있음.
	 *	클래스가 생성 될 떄 Person(String, int)가 호출되어 이름과 나이를 전달 하고, Person() 디폴트 생성자가 호출되는 경우에는 초깃값으로 "이름없음"과 1 값을 대입
	 *	디폴트 생성자 코드 안에서 직접 써도 되지만, 이미 다른 생성자에 이코드가 작성되어 있으므로 this를 활용하여 다른 생성자를 호출.
	 * 
	 * 	그런데 this로 다른 생성자를 호출할 때는 주의할 점이 this를 사용하여 생성자를 호출하는 코드 이전에 다른 코드를 넣을 수 없음.
	 * 	만약 다른 코드를 넣으면 오류메세지가 발생.
	 * 
	 * 생성자는 클래스가 생성될 때 호출되므로 클래스 생성이 완료되지 않은 시점에 다름 코드가 있다면 오루가 발생할 수 있음.
	 * 즉 디폴트 생성자에서 생성이 완료 되는 것이 아니라 this를 사용 하여 다른 생성자를 호출하므로, this를 활용한 문장이 가장 먼저 와야함.
	 */
	
	/*	자신의 주소를 반환하는 this
	 * 
	 * 마지막으로 this를 사용하여 생성된 클래스 자신의 주소 값을 반환할 수 있음
	 * 인스턴스 주소 값을 반환할 때는 this를 사용하고 반환형은 클래스 자료형을 사용
	 */
	
	/*
	 * 객체 간 협력
	 * 
	 * 객체지향 프로그램은 객체를 정의하고 객체 간 협력으로 만들어짐.
	 * 학생이 학교를 가기 위해 수행하는 과정을 프로그램으로 구현
	 * 
	 * 핵생 클래스 구현
	 * 
	 * 핵생클래스는 이름, 학년, 가진돈을 멤버 변수(속성)로 가짐.
	 * 그리고 [버스를 탄다], [지하철을 탄다], [학생의 현재 정보를 보여준다]를 메서드로 가집. - Student4
	 * 
	 * 8행에 생성자는 학생 이름과 학생이 가진 돈을 매개변수로 받음
	 * 학생 클래스를 하나 생성하면 학생 이름과 학생이 가진 돈을 초기화함.
	 * 디폴트 생성자를 제공하지 않으므로 학생 클래스를 생성 하려면 매개변수가 있는 Student(String studentName, int money) 생성자를 호출해야함.
	 * takeBus()매서드는 학생이 한 버스를 선택해서 탄 경우를 구현한 코드임.
	 * 버스를 타면 버스요금은 내기 떄문에 this.monet -= 1500;문장이 수행 되면 학생의 소지금이 1500만큼 줄어듬.
	 * 지하철도 마찬가지로 takeSubway()메서드에서 지하철 요금을 내는것을 구현한 this.monet -= 2000; 문장이 수행되면 학생의 소지금이 2000 줄어듬.
	 * 마지막으로 showInfo() 함수는학생 정보를 출혁해줌으로 학생의 이름과 남은 돈 정보가 문자열로 연결되어 출력됨.
	 * 
	 * 버스 클래스 구현
	 * 
	 * 학생 한명이 승차하면 버스 요금을 받고 승객수가 증가하는 클래스를 만듬.
	 * 버스 클래스의 멤버 변수로는 버스 번호, 승객 수, 버스가 받은 버스 요금 총액이 있음.
	 * take()메서드에서 승객 한명이 버스를 탄 경우를 구현.
	 * 승객이 요금을 지불, 요금을 매개변수로 받고(거스름돈은 생략) 요금이 들어오면 버스 수입이 증가, 승객 수도 증가
	 * Bus 클래스 8행 Bus(int busNumber) 생성자에서는 버스 번호를 매개변수로 받아 버스가 생성 될 떄 버스 번호를 초기화함.
	 * showInfo() 매서드에서는 버스 번호와 버스를 탄 승객 수 그리고 버스 수입을 문자열로 면결하여 출력함.
	 * 
	 * 지하철 클래스 구현
	 * 
	 * Subway(String lineNumber) 생성자가 지하철 몇호선인지를 매개변수로 받아 Subway 클래스를 생성함.
	 * take() 메서드는 생객이 탄 경우에 발생하는 일을 구현함.
	 * 지하철 수입이 증가하고, 승객수가 한명 증가함.
	 * showInfo()메서드는 지하철 노선, 승객수, 지하철 수입을 문자열로 출력함.
	 * 
	 * 
	 * 학생, 버스, 지하철 객체 협력하기
	 * 
	 * Student, Bus, Subway 클래스를 기반으로 학생이 버스나 지하철을 탔을 때 상황을 구현.
	 * 학생은 James, Tomas.
	 * 클래스 TakeTrans를 보면 두 개의 학생 인스컨스가 생성
	 */
	/*
	 * Static 변수
	 * 
	 * 변수를 여러 클래스에서 공통으로 사용하려면?
	 * 
	 * public class Student{
	 * 	public int studentID;
	 * 	public String studentName;
	 * 	public int grade;
	 * 	public String address;
	 * }
	 * 
	 * 학생 클래스를 사용하면 여러 학생의 인스턴스를 만들 수 있음.
	 * 학생마다 고유한 학번(stidentID)를 갖으며, 학생이 입학하면(클래스가 생성 되면) 학번이 자동 생성되도옥 만들고 싶음.
	 * 생성됨 인스턴스는 학번을 순서대로 가져가야함.  이떄 어떻게 학생에게 학번은 부여할 수 있을까?
	 * 각 인스턴스마다 따로 생성되는 변수가 아닌, 크래스 전반에서 공통으로 사용할 수 있는 기준 변수가 있어야 함.
	 * 학생이 한명 생성될 떄 마다 기준 변수 값을 하나씩 증가시켜 각 학생 인스턴스의 학번 변수에 대입해 주면 된다.
	 * 이떄 클래스에서 공통으로 사용하는 변수를 'static 변수'로 선언 한다.
	 * 
	 * static 변수의 정의와 사용방법
	 * 
	 * static 변수란 다른 용어로 '정적 변수'라고도 함.
	 * static 변수는 자바 뿐만 아니라 다른 언어에서도 비슷한 개념으로 사용하고 있는 변수로서 자바에서는 다른 멤버 변수처럼 클래스 내부에 선언함.
	 * 변수를 선언할 때 다음과 같이 자료형 앞에 static 예약어를 사용함.
	 * 
	 * 	static 예약어	   자료형		 변수 이름
	 * 		static		int		serialNum;
	 * 
	 * static 변수는 클래스 내부에서 선언하지만, 다른 멤버변수처럼 인스턴스가 생성 될 때다마 새로 생성되는 변수가 아님.
	 * static 변수는 프로그램이 실행되어 메모리에 올라갔을 때 딱 한번 메모리 공강이 할당 됨. 그리고 그 값은 모든 이스턴스가 공유함.
	 * 일반 멤버 변수는 인스턴스가 생성 될 떄마다 새로 생성되어 각각 다른 studentName을 갖게 되지만, static으로 선언한 변수는 인스턴스 생성과 상관없이 먼저 생성 되고, 그값을 모든 인스턴스가 고융하게 되는거임.
	 * 이런 이유 때문에 static변수를 클래스에 기반한 변수라고 해서 '클래스 변수'라고 함.
	 */
			
	
}
