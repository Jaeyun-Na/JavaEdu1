package array;

public class Student {

	private String name;
	private int studentID;
	
	public Student(int studentID, String name) {
		this.name = name;
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void showStudentInfo() {
		System.out.println(studentID + " , " + name);
		
	}
	
	
	
	
}
