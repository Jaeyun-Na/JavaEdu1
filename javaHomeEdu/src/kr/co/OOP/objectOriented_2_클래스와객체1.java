package kr.co.OOP;

public class objectOriented_2_클래스와객체1 {
	/* 
	 * Student 클래스는 멤버 변수와 메서드로 구성되어있음.
	 * 멤버변수는 클래스 속성을 나타내고, 매서드는 멤버 변수를 이용하여 클래스 기능을 구현함
	 * 
	 * 
	 * -프로그램 시작하는 main()함수
	 * 	자바 가상머신이 프로그램을 시작하기 휘해 호출하는 함수. 클래스 내부에 만들지만, 클래스 메서드는 아님
	 * 	
	 * 	main()함수에서 클래스를 사용하는 방법은 두가지임
	 * 	1. 클래스 내부에 main()함수를 만드는것.
	 * 	2. 외부에 테스트용 클래스를 만들어 사용하는것
	 */

		int	studentId;								
	  	String studentName;								
	  	int grade;									
	  	String address;								

	  	
	  	public String getStudentName(){				
	  		return studentName;						
	  	}	
	  	
	  	
	  	public static void main(String[] args) {
	  		objectOriented_2_클래스와객체1 studentAhn = new objectOriented_2_클래스와객체1();	//클래스 생성
			studentAhn.studentName = "안연수";
			
			System.out.println(studentAhn.studentName);
			System.out.println(studentAhn.getStudentName());
	  	}						
	  												
	  	/*클래스 내부에 main() 함수를 만드면 이 클래스가 프로그램의 시작 클래스가 됨.
	  	 * 클래스가 제대로 수행되는지 알아보기 위해서 클래스 내부에 main() 함수를 만들고 직접 실행 할수있음.
	  	 */
	
}
