package kr.co.OOP;

public class student {

	int studentId;
	String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}

	public static void main(String[] args) {
		student studentAhn = new student(); // Ŭ���� ����
		studentAhn.studentName = "�ȿ���";

		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
