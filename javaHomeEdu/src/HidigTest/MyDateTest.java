package HidigTest;

public class MyDateTest {
	public static void main(String[] arg) {
		
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
	}
}
