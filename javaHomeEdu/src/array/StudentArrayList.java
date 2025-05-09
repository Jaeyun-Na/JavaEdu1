package array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> library = new ArrayList<Student>();
		
		library.add(new Student(1001,"James"));
		library.add(new Student(1002,"Tomas"));
		library.add(new Student(1003,"Edward"));

		for(Student student : library) {
			student.showStudentInfo();
		}
		System.out.println();
		System.out.println("===예제 정답===");
		for(int i = 0; i < library.size(); i++) {
			Student student = library.get(i);
			student.showStudentInfo();
		}
		
		
	}

}
