package staticex;

public class Student2 {

	private static int serialNum = 1000;					//private 변수로 변경
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

	public static int getSerialNum() {						//serialNum의 get()메서드
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {		//serialNum의 set()메서드
		Student2.serialNum = serialNum;
	}

//		클래스 매서드와 인스턴스 변수 예
//	public static int getSerialNum() {						//serialNum의 get()메서드(클래스 매서드임)
//		int i = 10;
//		studentName = "이지원";
//		return serialNum;
//	}
}
