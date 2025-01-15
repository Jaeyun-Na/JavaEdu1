package kr.co.OOP;

public class objectOriented_객체지향 {

	
	
	/* 
	 * 아침에 일어나서 학교를 가는것을 예로 들면
	 * 
	 *아침에 일어난다 - 씻는다 - 아침밥을 먹는다 - 버스를 탄다 - 요금을 지불한다 - 버스에서 하차한다 - 학교에 도착
	 *
	 *순서대로 일어나는 일을 시간순으로 프로그래밍 하는것을 절차 지향 프로그래밍이라고 한다
	 *
	 *객체 지향 프로그래밍이란 객체를 정의하고 객체 간 협력을 프로그래밍 하는것
	 *대상이 되는 개체는 학생, 밥, 버스, 학교 등이 있음
	 *[아침밥을 먹는다] 라는 행동은 '학생'이란 객체와 '밥'이란 객체가 있어 핵생이 밥을 먹는 협력으로 이루어 짐
	 *[버스를 탄다] 라는 행동은 '학생'객체가 '버스' 객체를 이용하는 행동이 발생하는것
	 *
	 *객체 지향 프로그래밍이란 먼저 객체를 만들고 객체 사이에 일어나는 일을 구현하는것
	 *
	 *클래스란?
	 *
	 *클래스는 객체의 속성과 기능을 코드로 구현한것
	 *
	 *학생 객체를 표현하기 위해서는 이름,학번,학년,사는곳 등등이 있음.
	 *이런 클래스 속성은 특성이라고 하며, 클래스 내부에 변수로 선언 한다.
	 *이렇게 선언하는 클래스의 속성을 '멤버 변수'라고 함
	 */
	
	/*
	 * 예) 학생 클래스 만들기
	 * 
	 * public class Student {
	 * 		int studentID;
	 * 		String studentName;
	 * 		int grade;
	 * 		String address;
	 * }
	 * 
	 * 예문) Person 클래스 만들기(이름,나이,성별)
	 * 
	 * public class Person {
	 * 		String name;
	 * 		int age;
	 * 		char gender;
	 * }
	 * 
	 * 	자바 클래스 이름 짓는 규칙
	 * 
	 * 자바에서 클래스 이름은 대문자로 시작함. 소문자로 시작한다고 해서 오류가 발생하는것은 아니지만, 대문자로 시작하는 것이 개발자들 사이의 규칙
	 * 소셜 컨벤션(social convension)이 사회적 관습을 뜻하는 것처럼 코딩 동네엣서는 이러한 규칙을 코딩 컨벤션(coding convension)dlfkrhgka
	 * 
	 */
	/*
	 *   클래스 살펴보기
	 *   
	 *    student 클래스를 다시 살펴보면 학생 객체가 가지는 속성(학번,이름,학년...)을 변수로 선언 했음
	 *    클래스 내부에 선언하여 객체 속성을 나타내는 변수가 [멤버 변수]임.
	 *    
	 *    클래스에 선언하는 멤버 변수는 다른 말로는 속성, 특성 등으로 표현하기도 함.
	 *    멤버 변수는 속성이 무엇임에 따라 알맞은 자료형을 선언 해주어야함
	 *    
	 *    public class Person {
	 * 		String name;
	 * 		int height;
	 * 		double weight;
	 * 		char gender;
	 * 		boolean married;
	 * }
	 *    Person 클래스의 멤버변수로 이름, 키, 몸무게, 성별, 결혼 여부를 선언했음.
	 *    이와 같이 멤버 변수를 선언할 떄, int형, double형 같은 기본자료형으로 선언 할 수도 있고, 또 다른 클래스형으로 선언할 수있음.
	 *    클래스형이란 다른 말로 객체자료형 또는 참조 자료형이라고 함.
	 *    참조 자료형으로 사용하는 클래스는 String, Date와 같이 이미 JDK에서 제공하는 것일수고 있고, 개발자가 직접 만든 Student나 Person 같은 클래스가 다른 클래스에서 사용하는 멤버 변수의 자료형이 될 수도 있음.
	 *    
	 *    				------ 기본 자료형: int, long, float, double 등 
	 *    변수의 자료형 ----
	 *    				------ 참조 자료형: String, Date, Student 등
	 *
	 *	클래스 기능을 구현하는 메서드
	 *
	 *	클래스 내부에서 멤버변수를 사용하여 클래스 기능을 구현하는 것을 '멤버 함수' 또는 '메서드'라고 함
	 * 
	 * 	예) 학생 이름과 주수 출력하는 메서드 만들기
	 * 	
	 * public class Student {
	 * 		int studentID;
	 * 		String studentName;
	 * 		int grade;
	 * 		String address;
	 * 
	 * public void showStudentInfo(){
	 * 	System.out.println(studentName + ","+address);		//이름, 주소 출력
	 * 	}
	 * }   
	 *  
	 *   패키지란????
	 *   
	 * 	패키지는 간단히 말하면 클래스 파일의 묶음. 패키지를 만들면 프로젝트 하위에물리적으로 디렉터리가 생성됨
	 *	패키지는 계층 구조를 가질 수 있음
	 */
	
	
	
	/*
	 *   메서드
	 * 
	 * 	함수란?
	 * 	하나의 기능을 수행하는 일련의 코드
	 * 	함수는 어떠한 기능을 수행 하도록 미이 구현해 놓고 필요할때 마다 호출하여 사용할 수 있음
	 * 	
	 * 	입력(num1, num2)
	 * 		함수(add함수)
	 * 		result= num1+num2
	 * 					출력(result)
	 * ==============================131줄 예============================================
	 * int[함수 반환형] add[함수 이름](int num1, int num2[매개 변수]){		
	 * 		int result;
	 * 		result = num1 + num2;
	 * 		return[예약어] result;
	 * }
	 * =================================================================================
	 */
	int	getTenTotal() { 
		int i;
		int total = 0;
		
		for(i=1; i <= 10; i++) {
			total += i;
		}
		return total;
	 }

	/*
	 * 	return 예약어와 반환어(114줄 참고)
	 * add()함수를 수행한 후 결과 값은 변수 result에 저장됨.
	 * result에 저장됨 값은 함수를 호출했을때 반환되는 값이므로 '반환 값'이라고도 부름.
	 * '이 함수의 결과 값을 반환합니다'를 뜨사는 예약어가 바로 return.
	 */
	
	
	
	
	//	함수 호출하고 값 반환
//	public static void main(String[ ] args) {
//		
//		int exNum1 = 10;
//		int exNum2 = 20;
//		
//		int sum = add(exNum1, exNum2);
//		System.out.println(exNum1 + "+" + exNum2 + "=" + sum + "입니다." );
//	}
//
//	private static int add(int exNum1, int exNum2) {
//		int result = exNum1 + exNum2;
//		return result;
//	}
	
	/*위 코드는 add()함수를 구현하였음.
	 *두 대의 매개변수에 int형 값을 전달 받아 두수의 합을 돌려줌, 결과 값이 정수형이기 떄문에 반환형이 int형임.
	 *반환 값이 int형이기 떄문에 결과 값이 정자되는 sum변수 앞에 int를 붙임.
	 * 
	 */
	
	//연습 문제) 사칙연산을 수행하는 함수를 모두 구현
	
	public static void main(String[ ] args) {
		int testNum1 = 20;
		int testNum2 = 40;
		
		int sum = add1(testNum1, testNum2);
		System.out.println("합 :"+sum);
		
		int sub = remove(testNum1, testNum2);
		System.out.println("차 :"+sub);
		
		int mul = mul(testNum1, testNum2);
		System.out.println("곱 :"+mul);
		
		int div = div(testNum1, testNum2);
		System.out.println("나누기 :"+div);
		
	}

	private static int div(int testNum1, int testNum2) {
		int result = testNum1 / testNum2;
		return result;
	}

	private static int mul(int testNum1, int testNum2) {
		int result = testNum1 * testNum2;
		return result;
	}

	private static int remove(int testNum1, int testNum2) {
		int result = testNum1 - testNum2;
		return result;
	}

	private static int add1(int testNum1, int testNum2) {
		int result = testNum1 + testNum2;
		return result;
	}
	
	
	/*	클래스 기능을 구현하는 메서드
	 * 메섣그는 함수에 객체 지향 개념이 포함된 용어로 이해하면 됨
	 */

	public class Studnet{
		int studentID;
 		String studentName;
 		int grade;
 		String address;
 		
 		public String getStudentName() {
			return studentName;
		}	
 		
 		public void setStudentName(String name) {
 			studentName = name;
			
		}
	}
	
	/*	메서드 이름은 해당 클래스를 사용하는 코드의 입장에서 짓는 것이 좋음.
	 * 	Student 클래스를 사용하는 A클래스에서 학생이름(studenName)을 가져오는(get) 기능을 제공하는 메서드 이름은 getStudentName으로 지음.
	 * 	메서드의 반환 값은 studentName인데 studentName 자료형이 String이므로 반환형도 String임.
	 * 
	 * 	setStudentName()메서드는 student 클래스를 사용하여 다른 코드에서 학생이름을 새로 지정하거나 바꿈.
	 * 	studentName 값을 지정하는(set) 기능을 제공하는것
	 * 	해당 메서드는 이름을 전달받아 지정하는것이기 떄문에 매개변수 name이 필요. 매개변수 name을 멤버변수 studentName에 대입하면 학생 이름이 지정.
	 *  반환 값이 없음으로 반환형은 void로 지정.
	 * 
	 */
	
	
	
}
