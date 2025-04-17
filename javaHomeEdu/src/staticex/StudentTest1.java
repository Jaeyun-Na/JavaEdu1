package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentLee = new Student();
		studentLee.setStudentName("ÀÌÁö¿ø");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		
		Student studentSon = new Student();
		studentSon.setStudentName("¼ÕÈï¹Î");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}

}
