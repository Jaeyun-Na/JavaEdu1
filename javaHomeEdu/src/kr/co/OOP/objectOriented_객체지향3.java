package kr.co.OOP;

public class objectOriented_��ü����3 {


	private String studentName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		student studentAhn = new student();

		studentAhn.studentName = "�Ƚ¿�";

		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	
		/*
		 * [objectOriented_��ü����3] Ŭ������ [objectOriented_��ü����2] Ŭ���� ��Ŭ������ ���� ��Ű���� �ֱ� ������ ��Ű���̸��� [kr.co.OOP]�� ���ϵ�.
		 * ���� ��Ű���� �ٸ��� import ���� ����Ͽ� �Բ� ����ϱ� ���ϴ� Ŭ������ �ҷ��;���.
		 */
	
		/*	new ������ Ŭ���� �����ϱ�
		 * 
		 * Ŭ������ ����Ϸ��� ���� Ŭ������ �����ؾ���
		 * 
		 * (Ŭ������) (���� �̸�) = new (������);
		 * Student atudentAhn = new Student;
		 * 
		 * Ŭ���� �ڷ��� ������ �����ϰ� new ������ �����ڸ� ȣ��, �����ϸ� ���ο� Ŭ������ ������.
		 * Ŭ������ �����Ѵٴ°��� Ŭ������ ���� ����Ҽ� �ֵ��� �޸� ����(�� �޸�)�� �Ҵ� �޴´ٴ� ��.
		 * ������ ����� �� �ֵ��� ������ Ŭ������ '�ν��Ͻ�'�����. �ν��Ͻ��� ����Ű�� Ŭ������ ������ '��������'��� ��.
		 * 
		 */
		
		
		/*	�ν��Ͻ��� ���� ����
		 * 	-��ü. Ŭ����, �ν��Ͻ�
		 * ��ü�� '�ǻ糪 ������ ��ġ�� ���'�̸� �̸� �ڵ�� �����Ѱ��� Ŭ����.
		 * Ŭ������ �޸� ������ ������ ���¸� �ν��Ͻ������. ���� ������ Ŭ������ �ν��Ͻ��� ��ü�����.
		 * 
		 * 
		 * 																		|----student1(�ν��Ͻ�)
		 * 	Student ----Student(Ŭ����)[studentId, studentName, grade, address..��]----student2(�ν��Ͻ�)
		 * 																		|----student3(�ν��Ͻ�)
		 * 	Ŭ������ �ϳ�����, �� Ŭ�����κ��� ���� ���� ���� �ٸ� �ν��Ͻ��� ���� �Ҽ� ����.
		 * 	
		 * 	��) �б����� �л��̶� �߻���� ���� �ϳ�����, �б��� �ٴϴ� �л� �������� �������ΰͰ� ��������
		 */
	
		
		//�ν��Ͻ� ���� �� �����ϱ�
		student student1 = new student();
		student1.studentName = "�Ƚ¿�";
		System.out.println(student1.getStudentName());
		
		student student2 = new student();
		student2.studentName = "�Ƚ���";
		System.out.println(student2.getStudentName());
		
		/*	���� ���� ��� 
		 * ���� ������ ����ϸ� �ν��Ͻ��� ��� ������ �޼��带 �����Ͽ� ����� �� ����.
		 * �̶� ��Ʈ(.)�����ڸ� ���
		 * 
		 * ��)
		 * (���� ����). (��� ����)
		 * (���� ����). (�޼���)
		 */ 
		studentAhn.studentName = "�Ƚ���";						//��� ���� ���
		System.out.println(studentAhn.getStudentName());		//�޼��� ���
		
		/*
		 * 	�ν��Ͻ��� �� �޸�
		 * 
		 * new Student()�� ���� �ϸ� Student �ϳ��� ����. �� Student�� studentId, studentName ���� ��� ������ ���� ����.
		 * �̵� ������ ������ ������ �ʿ��ѵ�, �̋� ����ϴ� �޸𸮰� �� �޸�(heap memory)��
		 * Ŭ���� �����ڸ� �ϳ� ȣ���ϸ� �ν��Ͻ��� �� �޸𸮿� �����Ǵ°�.
		 */
		// Student studentAhn = new Student();					//12�� �� Ȯ��
		
		
		//student student1 = new student();
		//student student2 = new student();
		
		/*
		 * Ŭ������ ���� �� ������ �ν��Ͻ��� �ٸ� �޸� ������ ������.
		 * ��� ������ �����ϴ� ������ �Ź� ���� �����ٴ� �ǹ�.
		 * �̷��� ���������� Ŭ������ ������ ��� ������ �ٸ����� [�ν��Ͻ� ����]��� �θ�
		 */
		
		/*student student1 = new student();
		*student1.studentName = "�Ƚ¿�";
		*
		*student student2 = new student();
		*student2.studentName = "�Ƚ���";
		*/
		System.out.println(student1);					//���� ���� �� ���
		System.out.println(student2);					//���� ���� �� ���
		
		/*
		 * �� �޸𸮿� ���� �� �ν��Ͻ��� �޸� �ּҴ� ���Ӥ��� ������ �����.
		 * ��� ������ Ȯ���غ��� 'Ŭ���� �̸�@�ּ� ��'��
		 * �� ���� ���� �ӽſ��� ��ü�� �����Ǿ����� ������ ��ü�� �Ҵ��ϴ� ���� �ּҰ�
		 * ���� ���ϸ� �ش� ���� ����Ǿ� �ִ� �ּ�.
		 * 
		 * 
		 * 
		 * 		���						����
		 * 		��ü				��ü ���� ���α׷��� ���. ������ �ν��Ͻ�
		 * 		Ŭ����			��ü�� ���α׷����ϱ� ���� �ڵ�� ���� ����
		 * 		�ν��Ͻ�			Ŭ������ �޸𸮿� ������ ����
		 * 		�������			Ŭ������ �Ӽ�, Ư��
		 * 		�޼���			��� ������ �̿��Ͽ� Ŭ������ ����� ����
		 * 		���� ����			�޸𸮿� ������ �ν��Ͻ��� ����Ű�� ����
		 * 		���� ��			������ �ν��Ͻ��� �޸� �ּҰ�
		 */
		
		
	}

	
	
	
	
	
}
