package kr.co.OOP;

public class student {

	int studentId;
	String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}
	
	public student (int studentId) {
		this.studentId = studentId;
	}

	public student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		student studentAhn = new student(); // 클래스 생성
		studentAhn.studentName = "안연수";

		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
