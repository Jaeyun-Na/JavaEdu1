package kr.co.OOP;

import thisEx.Person;

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
	 */
}
