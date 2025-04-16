package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student3 studentHong = new Student3();
		studentHong.setStudentName("홍길동");
		System.out.println("[학생 이름] : " + studentHong.studentName + " / [학생 ID] : " + studentHong.studentID + " / [카드 번호] : " + studentHong.cardNum);
		
		Student3 studentKim = new Student3();
		studentKim.setStudentName("김광현");
		System.out.println("[학생 이름] : " + studentKim.studentName + " / [학생 ID] : " + studentKim.studentID + " / [카드 번호] : " + studentKim.cardNum);
	}

}
