package Test;

import kr.co.hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
//		studentLee.studentName = "�̹��";
		studentLee.setStudentName("�̹��");				//setStudentName�޼��带 Ȱ��. private ������ ���� ����
		
		System.out.println(studentLee.getStudentName());
		
	}

}
