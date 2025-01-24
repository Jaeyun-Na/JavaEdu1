package Test;

import kr.co.hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
//		studentLee.studentName = "이방원";
		studentLee.setStudentName("이방원");				//setStudentName메서드를 활용. private 변수에 접근 가능
		
		System.out.println(studentLee.getStudentName());
		
	}

}
