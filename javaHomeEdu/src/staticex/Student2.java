package staticex;

public class Student2 {

	private static int serialNum = 1000;					//private ������ ����
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}

	public static int getSerialNum() {						//serialNum�� get()�޼���
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {		//serialNum�� set()�޼���
		Student2.serialNum = serialNum;
	}

//		Ŭ���� �ż���� �ν��Ͻ� ���� ��
//	public static int getSerialNum() {						//serialNum�� get()�޼���(Ŭ���� �ż�����)
//		int i = 10;
//		studentName = "������";
//		return serialNum;
//	}
}
