package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 studentLee = new Student2();
		studentLee.setStudentName("������");
		System.out.println(Student2.getSerialNum());		//serialNum ���� �������� ���� get()�޼��带 Ŭ���� �̸����� ���� ȣ��
		System.out.println(studentLee.studentName + "�й� : " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�ձ���");
		System.out.println(Student2.getSerialNum());		//serialNum ���� �������� ���� get()�޼��带 Ŭ���� �̸����� ���� ȣ��
		System.out.println(studentSon.studentName + "�й� : " + studentSon.studentID);
	}

}
