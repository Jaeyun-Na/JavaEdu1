package kr.co.OOP;

public class objectOriented_��ü����2 {
	/* 
	 * Student Ŭ������ ��� ������ �޼���� �����Ǿ�����.
	 * ��������� Ŭ���� �Ӽ��� ��Ÿ����, �ż���� ��� ������ �̿��Ͽ� Ŭ���� ����� ������
	 * 
	 * 
	 * -���α׷� �����ϴ� main()�Լ�
	 * 	�ڹ� ����ӽ��� ���α׷��� �����ϱ� ���� ȣ���ϴ� �Լ�. Ŭ���� ���ο� ��������, Ŭ���� �޼���� �ƴ�
	 * 	
	 * 	main()�Լ����� Ŭ������ ����ϴ� ����� �ΰ�����
	 * 	1. Ŭ���� ���ο� main()�Լ��� ����°�.
	 * 	2. �ܺο� �׽�Ʈ�� Ŭ������ ����� ����ϴ°�
	 */

		int	studentId;								
	  	String studentName;								
	  	int grade;									
	  	String address;								

	  	
	  	public String getStudentName(){				
	  		return studentName;						
	  	}	
	  	
	  	
	  	public static void main(String[] args) {
	  		objectOriented_��ü����2 studentAhn = new objectOriented_��ü����2();	//Ŭ���� ����
			studentAhn.studentName = "�ȿ���";
			
			System.out.println(studentAhn.studentName);
			System.out.println(studentAhn.getStudentName());
	  	}						
	  												
	  	/*Ŭ���� ���ο� main() �Լ��� ����� �� Ŭ������ ���α׷��� ���� Ŭ������ ��.
	  	 * Ŭ������ ����� ����Ǵ��� �˾ƺ��� ���ؼ� Ŭ���� ���ο� main() �Լ��� ����� ���� ���� �Ҽ�����.
	  	 */
	
}
