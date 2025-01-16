package kr.co.OOP;

public class objectOriented_객체지향3 {


	private String studentName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		student studentAhn = new student();

		studentAhn.studentName = "안승연";

		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	
		/*
		 * [objectOriented_객체지향3] 클래스와 [objectOriented_객체지향2] 클래스 두클래스가 같은 패키지에 있기 떄문에 패키지이름이 [kr.co.OOP]로 통일됨.
		 * 만약 패키지가 다르면 import 문은 사용하여 함꼐 사용하기 원하는 클래스를 불러와야함.
		 */
	
		/*	new 예약어로 클래스 생성하기
		 * 
		 * 클래스를 사용하려면 먼저 클래스를 생성해야함
		 * 
		 * (클래스형) (변수 이름) = new (생성자);
		 * Student atudentAhn = new Student;
		 * 
		 * 클래스 자료형 변수를 선언하고 new 예약어로 생성자를 호출, 대입하면 새로운 클래스가 생성됨.
		 * 클래스를 생성한다는것은 클래스를 실제 사용할수 있도록 메모리 공간(힙 메모리)을 할당 받는다는 뜻.
		 * 실제로 사용할 수 있도록 생성된 클래스를 '인스턴스'라고함. 인스턴스를 가르키는 클래스형 변수를 '참조변수'라고 함.
		 * 
		 */
		
		
		/*	인스턴스와 참조 변수
		 * 	-객체. 클래스, 인스턴스
		 * 객체란 '의사나 행위가 미치는 대상'이며 이를 코드로 구현한것이 클래스.
		 * 클래스가 메모리 공간에 생성된 상태를 인스턴스라고함. 또한 생성된 클래스의 인스턴스를 객체라고함.
		 * 
		 * 
		 * 																		|----student1(인스턴스)
		 * 	Student ----Student(클래스)[studentId, studentName, grade, address..등]----student2(인스턴스)
		 * 																		|----student3(인스턴스)
		 * 	클래스는 하나지만, 이 클래스로부터 여러 개의 각각 다른 인스턴스를 생성 할수 있음.
		 * 	
		 * 	예) 학교에서 학생이란 추상어의 뜻은 하나지만, 학교에 다니는 학생 개개인은 여러명인것과 마찬가지
		 */
	
		
		//인스턴스 여러 개 생성하기
		student student1 = new student();
		student1.studentName = "안승연";
		System.out.println(student1.getStudentName());
		
		student student2 = new student();
		student2.studentName = "안슬기";
		System.out.println(student2.getStudentName());
		
		/*	참조 변수 사용 
		 * 참조 변수를 사용하면 인스턴스의 멤버 변수와 메서드를 참조하여 사용할 수 있음.
		 * 이때 도트(.)연산자를 사용
		 * 
		 * 예)
		 * (참조 변수). (멤버 변수)
		 * (참조 변수). (메서드)
		 */ 
		studentAhn.studentName = "안승현";						//멤버 변수 사용
		System.out.println(studentAhn.getStudentName());		//메서드 사용
		
		/*
		 * 	인스턴스와 힙 메모리
		 * 
		 * new Student()를 선언 하면 Student 하나가 생성. 각 Student는 studentId, studentName 등의 멤버 변수를 갖고 있음.
		 * 이들 변수를 저장할 공간이 필요한데, 이떄 사용하는 메모리가 힙 메모리(heap memory)임
		 * 클래스 생성자를 하나 호출하면 인스턴스가 힙 메모리에 생성되는것.
		 */
		// Student studentAhn = new Student();					//12번 줄 확인
		
		
		//student student1 = new student();
		//student student2 = new student();
		
		/*
		 * 클래스가 생성 될 떄마다 인스턴스는 다른 메모리 공간을 차지함.
		 * 멤버 변수를 저장하는 공강이 매번 따로 생가다는 의미.
		 * 이러한 의유떄문에 클래스에 선언한 멤버 변수를 다른말로 [인스턴스 변수]라고 부름
		 */
		
		/*student student1 = new student();
		*student1.studentName = "안승연";
		*
		*student student2 = new student();
		*student2.studentName = "안슬기";
		*/
		System.out.println(student1);					//참조 변수 값 출력
		System.out.println(student2);					//참조 변수 값 출력
		
		/*
		 * 힙 메모리에 생성 된 인스턴스의 메모리 주소는 차ㅣㅁ조 변수에 저장됨.
		 * 출력 내용을 확인해보면 '클래스 이름@주소 값'임
		 * 이 값은 가상 머신에서 객체가 생성되었을때 생성된 객체에 할당하는 가상 주소값
		 * 쉽게 말하면 해당 값이 저장되어 있는 주소.
		 * 
		 * 
		 * 
		 * 		용어						설명
		 * 		객체				객체 지향 프로그램의 대상. 생성된 인스턴스
		 * 		클래스			객체를 프로그래밍하기 위해 코드로 만근 상태
		 * 		인스턴스			클래스가 메모리에 생성된 상태
		 * 		멤버변수			클래스의 속성, 특성
		 * 		메서드			멤버 변수를 이용하여 클래스의 기능을 구현
		 * 		참조 변수			메모리에 생성된 인스턴스를 가리키는 변수
		 * 		참조 값			생성된 인스턴스의 메모리 주소값
		 */
		
		
	}

	
	
	
	
	
}
