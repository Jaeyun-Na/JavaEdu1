package kr.co.OOP;

import staticex.Student2;

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
			
	/*
	 * -staticex-
	 * 학생이 새로 생성 되면 학번을 차례로 부여하는 예제를 통해 static 변수를 사용하는 방법
	 * 사용할 static 변수는 serialNum. 변수 값은 학생이 생성 될 때마다 순서대로 증가. 증가된 값을 각 학생의 학번에 대입해 주면 학생에게 새로운 학번 부여
	 */
	
	
	/*
	 * Student 클래스에서 기준 값 역할을 하는 serialNum 변수를 선언하고 기준 값으로 1000을 대입.
	 * 테스드 코드에서 학생을 두명 생성하고 serialNum이 증가했을 때 두 인스턴스에서 증가된 값이 공유되는지 확인 -> (package)staticex
	 */
	
	/*
	 * studentLee를 먼저 생성하고 이 참조 변수를 사용하여 전체 인스턴스에서 공동으로 사용하는 serialNum 변수 값을 1 증가시킴. studentSon을 생성, 생성된 studentSon으로는 아무 연산도 수행하지 않음.
	 * studentSon과 studentLee로 serialNum 변수 값을 출력해 보면 둘 다 1001로 증가된 serialNum 값이 출력되는 것을 할 수 있음.
	 * static으로 선언한 serialNum 변수는 모든 인스턴스가 공유하기 때문. 즉 두 개의 참조 변수가 동일한 변수의 메모리를 가리키고 있다는 것을 알 수 있음.
	 * 
	 *  
	 *  	데이터 영역					스택 메모리					힙 메모리
	 *      serialNum				   studentLee				  studentLee 인스턴스
	 *        1001					   studentSon				  studentSon 인스턴스
	 *  
	 *  
	 *  학번 생성하기
	 *  
	 *  학생이 한 명 생성될 때마다 학번을 자동으로 부여하는 프로그램을 완성해 보자  -> static-Student1
	 *  
	 *  static 변수(serialNum)를 하나 선언. 학생이 생성될 때마다 변수 값이 증가.
	 *  static 변수를 그냥 바로 학번으로 사용하면 안됨. static 변수는 모든 인스턴스가 공유하는 변수이므로 이 변수를 바로 학번으로 사용하면 모든 학생이 동일한 학번 값을 갖게 됨.
	 *  학번은 학생의 고유번호이므로 학생의 멤버 변수로 선언해 주고, 학생이 한 명 생성될 때마다 증가한 serialNum 값을 studentID에 대입해 주면 이 문제를 해결할 수 있음.
	 *  Student 클래스에 생성자를 추가하고 생성자에서 serialNum 값을 증가시키고 증가된 값을 studentID 변수에 대입
	 *  StudentTest2 클래스에서 실제로 학생이 생성될 때마다 증가된 다른 학번을 가지는지 확인.
	 */
	
	/*
	 * 학생 인스턴스를 생성할 때 마다 serialNum 변수의 값은 증가함.
	 * 그리고 새로 생성되는 학생마다 가지는 studentID 변수에 증가한 serialNum 값을 복사해 주었으므로, 두 학생의 학번은 다름. 
	 * 이처럼 static변수는 같은 클래스에서 생성된 인스턴스들이 같은 값을 공유할 수 있으므로, 인스턴스 간에 공통으로 사용할 값이 필요한 경우 유용하게 사용할 수 있음.
	 */
	
	/*
	 * 		클래스 변수
	 * static 변수는 인스턴스를 생성할 때마다 만들어지는 것이 아니고 클래스를 선언할 때 특정 메모리에 저장되어 모근 인스턴스가 공유하는 변수
	 * static 변수는 인스턴스 생성과는 별개이므로 인스턴스보다 먼저 생성됨.
	 * 그러므로 인스턴스가 아닌 클래스 이름으로도 참조하여 사용할 수 있음. 따라서 자바에서는 static변수를 클래스 변수라고 하며 StudentTest2.java코드는 다음처럼 변경 할수 있음
	 * 
	 * StudentTest2.java 파일처럼 static 변수 serialNumdmf studentLee.serialNum과 같이 인스턴스로 참조 할 수 있음.
	 * static 변수는 인스턴스가 생성되지 않아도 사용 할 수 있기 떄문에 보통 student.seialNum과 같이 클래스 이름과 함께 사용함.
	 * 
	 * 	[static 변수는 클래스 이름으로 직접 참조함]
	 * StudentTest2.java에서처럼 static변수를 studentLee.serialNum과 같이 사용하면 serialNum아래쪽에 노란줄이 보임.
	 * 이것은 요류가 아닌 이변수가 static변수이므로 인스턴스 참조 변수가 아닌 클래스 이름으로 직접 참조하라는 뜻.
	 * StudentTest3.java처럼 클래스 이름으로 직접 참조하면 노란줄이 사라짐. 이클립스에서 static변수와 static 메서드는 이탤릭체로 나타남.
	 * 
	 * static 변수, 정적 변수, 클래스 변수라는 3가지 용어를 사용했음.
	 * 셋 모두 자바에서 static 변수를 의미함. 자바에서 static 변수를 클래스 변수라고 하는 이유는 인스턴스마다 생성되는 변수가 아니라 클래스에 속해 한 번만 생성되는 변수이고 이를 여러 인스턴스가 공우하기 때문임.
	 * 
	 * 
	 * 
	 * 
	 * 		클래스 매서드
	 * 일반 멤ㅁ버 변수를 위한 메서드가 존재하듯 static 변수를 위한 메서드도 있음.
	 * 이런 메서드를 'static 메서드' 또는 '클래스 메서드'라고함. serialNum 변수를 사용하는 메서드를 만들어보자.
	 * 외부클래스에서 serialNum 변수를 직접 참조하지 못하도록 일단 private로 선언하고 이 변수에 대한 get()메서드와 set()메서드를 생성함.
	 * Student클래스의 serialNum 변수를 private로 변경하면 기존의 StudentTest1, StudentTest2, StudentTest3에서는 직접 참조할 수 없어 오류가 발생하므로 Student2클래스를 새로 생성.
	 * 
	 */
	
	/*
	 * public class Student2 {
	 *
	 *private static int serialNum = 1000;					//private 변수로 변경
	 *int studentID;
	 *String studentName;
	 *int grade;
	 *String address;
	 *
	 *public Student2() {
	 *	serialNum++;
	 *	studentID = serialNum;
	 *}
 	 *
	 *public String getStudentName() {
	 *	return studentName;
	 *}
	
	 *public void setStudentName(String name) {
	 *	this.studentName = name;
	 *}
	 *
	 *public static int getSerialNum() {						//serialNum의 get()메서드
	 *	int i = 10;
	 *	return serialNum;
	 *}
	 *
	 *public static void setSerialNum(int serialNum) {		//serialNum의 set()메서드
	 *	Student2.serialNum = serialNum;
	 *}
	 *
	 *	
	 *}
	 * 
	 */
	
	/*
	 * 외부 클래스에서 serialNum 값을 사용하려면 get() 메서드를 호출하고, serialNum 변수 값을 변경하려면 set() 메서드를 사용해야함.
	 * get() 메서드와 set() 메서드를 사용하도록 변경했을 때 프로그램이 제대로 실행되는지 확인해야함 -> studentTest4 확인
	 */
	
	/*
	 *public class StudentTest4 {
	 *
	 *	public static void main(String[] args) {
	 *		// TODO Auto-generated method stub
	 *
	 *	Student2 studentLee = new Student2();
	 *	studentLee.setStudentName("이지원");
	 *	System.out.println(Student2.getSerialNum());		//serialNum 값을 가져오기 위해 get()메서드를 클래스 이름으로 직접 호출
	 *	System.out.println(studentLee.studentName + "학번 : " + studentLee.studentID);
	 *
	 *	Student2 studentSon = new Student2();
	 *	studentSon.setStudentName("손기정");
	 *	System.out.println(Student2.getSerialNum());		//serialNum 값을 가져오기 위해 get()메서드를 클래스 이름으로 직접 호출
	 *	System.out.println(studentSon.studentName + "학번 : " + studentSon.studentID);
	 *	}
	 *
	 *}
	 * 
	 */
	/*
	 * StudentTest4.java의 [System.out.println(Student2.getSerialNum());], [System.out.println(Student2.getSerialNum());] 코드는 serialNum을
	 * 직접 참조하지 않고 getSerialNm()메서드를 호출하여 참조함.
	 * static 메서드 또한 static 변수처럼 인스턴스 참조 변수가 아닌 클래스 이름으로 직접 호풀할 수 있음.
	 * 
	 */
	/*
	 * 		클래스 메서드와 인스턴스 변수
	 * 클래스 메서드 내부에서는 인스턴스 변수를 사용할 수 없음.  --> Student2 클래스 매서드와 인스턴스 변수 예 확인
	 *
	 * getSerialNum() 메서드는 static 예억어를 붙인 클래스 메서드 임.
	 * 이메서드는 세종유의 변수를 사용함. 가장 먼저 선언한 int i를 보자.
	 * 이 변수는 메서드 내부에서 선언하였음. 이렇게 메서드 내부에서 선언한 변수를 그 지억에서만 사용한다고 해서 지역변수라고 함.
	 * 지역 변수는 메서드가 호출될 때 메모리에 생성되어 메서드가 끝나면 사라지는 변수.
	 * 따라서 이 변수는 getSerialNum() 메서드 내부에서만 사용할 수 있음. 마지만 return Serial.Num; 문장을 보면 serialNum 변수는 static 변수. 그러므로 클래스 메서드인 getSerialNum()메서드 내부에서도 사용할 수 있음.
	 * 
	 * 그런데 메서드 내부의 두 번째 줄에 사용한 studentName 변수는 오류가 발생함. 이변수는 Student2 클래스의 멤버 변수로, 인스턴스가 생성될 때 만들어지는 인스턴스 변수이기 떄문.
	 * 클래스 메서드와 클래스 변수는 인스턴스가 생성되지 않아도 사용할 수 있음. --> StudentTest5
	 * 
	 */
	
	/*
	 * 
	 * class StudentTest5의 5행을 보면 클래스 메서드 Student2.getSerialNum()과 같이 인스턴스가 생성되지 않아도 언제든 호풀할 수 있음. studentName처럼 인스턴스가 생성되어야 메모리가 할당되는 인스턴스 변수는 클래스 메서드에서 사용할수 없음.
	 * 
	 * 클래스 메서드 내부에서 지역 변수와 클래스 변수는 사용할 수 있지만, 인스턴스 벼ㅛㄴ수는 사용할 수 없ㅡㅁ. 또한 클래스 메서드에서 인스턴스 변수를 자용할수 없지만, 반대로 일반 메서드에서 클래스 변수를 사용하는 것은 전혀 문제가 도지 않음.
	 * 왜냐면 인반 메서드는 인스턴스가 생성될 때 호충되는 메서드이고, 클래스 변수는 이미 만들어진 변수이기 떄문에 일반 메서드에서도 클래스 변수를 호출할 수 있기 때문
	 * 
	 */
}
