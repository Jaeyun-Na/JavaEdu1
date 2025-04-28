package array;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] studentInfo = new Student[3];
		
		studentInfo[0] = new Student(1001,"James");
		studentInfo[1] = new Student(1002,"Tomas");
		studentInfo[2] = new Student(1003,"Edward");
		
		for(int i = 0; i < studentInfo.length; i++) {
			studentInfo[i].showStudentInfo();
		}

	}

}
