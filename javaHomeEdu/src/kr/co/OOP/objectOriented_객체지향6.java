package kr.co.OOP;

import thisEx.Person;

public class objectOriented_��ü����6 {

	/*
	 * This �����
	 * 
	 * ������ �ν��Ͻ� �����θ� ����Ű�� �����
	 * 
	 */

	/*
	 * class BirthDay{
	 * 
	 * int day; int month; int year;
	 * 
	 * public void setYear(int year) { // �¾ ������ �����ϴ� �޼��� this.year = year; //
	 * dDay.year = year;�� ���� }
	 * 
	 * public void printThis() { // this ��� �޼��� System.out.println(this); //
	 * System.out.println(dDay);�� ���� }
	 * 
	 * }
	 * 
	 * 
	 * public class BirthDayEx {
	 * 
	 * public static void main(String[]arg) { BirthDay bDay = new BirthDay();
	 * bDay.setYear(2000); // �¾ �⵵ 2000���� ���� System.out.println(bDay); // ���� ���� ���
	 * bDay.printThis(); // this ��� �޼��� ȣ�� } }
	 */

	/*
	 * �ν��Ͻ��� ����Ű�� ������ ���� �����̸�, ���� ������ ����ϸ� 'Ŭ���� �̸�@�޸� �ּ�'���ڿ� ���� ���� ��� ����� ����
	 * bDay.printThis()�޼��带 ȣ���Ͽ� ����� this ���� ���� ���� bDay�� ����� ���� ����. Ŭ���� �ڵ忡�� ����ϴ�
	 * this�� ������ �ν��Ͻ� �ڽ��� ����Ű�¿�Ȱ�� ��. ���� this.year = year;�������� �����ϸ� ���� �޸𸮿� ������
	 * �ν��Ͻ��� year ���� ��ġ�� ����Ű�� �� ��ġ�� �Ű����� ���� �־� �ִ� ����.
	 * 
	 * ���� �޸� �� �޸� SetYear() this-------| BirthDay Ŭ���� ���� main()
	 * bDay--------------------------> year main() args month day main() �Լ���
	 * ThisExmaple Ŭ������ ���� �޼��� main()�Լ����� bDay ������ ����Ű�� �ν��Ͻ��� BirthDay Ŭ������
	 * setYear() �ż��忡�� this�� ����Ű�� �ν��Ͻ��� ���� ���� ����.
	 * 
	 * 
	 * �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� this
	 * 
	 * Ŭ������ �����ڰ� ���� �� ���� �� � �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� ��찡 ���� ����. �̶� this�� ��� Ŭ������ �����ڿ���
	 * �ٸ� �����ڸ� ȣ���� �� ����.
	 */
	
	/*
	 * class Person{ String name; int age;
	 * 
	 * Person(){
	 *  this("�̸�����",1);
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
	
	/*	Person Ŭ�������� Person() ����Ʈ �����ڿ� �Ű������� ���� Person(String name, int age) �����ڰ� ����.
	 *	Ŭ������ ���� �� �� Person(String, int)�� ȣ��Ǿ� �̸��� ���̸� ���� �ϰ�, Person() ����Ʈ �����ڰ� ȣ��Ǵ� ��쿡�� �ʱ갪���� "�̸�����"�� 1 ���� ����
	 *	����Ʈ ������ �ڵ� �ȿ��� ���� �ᵵ ������, �̹� �ٸ� �����ڿ� ���ڵ尡 �ۼ��Ǿ� �����Ƿ� this�� Ȱ���Ͽ� �ٸ� �����ڸ� ȣ��.
	 * 
	 */
}
