package kr.co.OOP;

public class objectOriented_��ü���� {

	
	
	/* 
	 * ��ħ�� �Ͼ�� �б��� ���°��� ���� ���
	 * 
	 *��ħ�� �Ͼ�� - �Ĵ´� - ��ħ���� �Դ´� - ������ ź�� - ����� �����Ѵ� - �������� �����Ѵ� - �б��� ����
	 *
	 *������� �Ͼ�� ���� �ð������� ���α׷��� �ϴ°��� ���� ���� ���α׷����̶�� �Ѵ�
	 *
	 *��ü ���� ���α׷����̶� ��ü�� �����ϰ� ��ü �� ������ ���α׷��� �ϴ°�
	 *����� �Ǵ� ��ü�� �л�, ��, ����, �б� ���� ����
	 *[��ħ���� �Դ´�] ��� �ൿ�� '�л�'�̶� ��ü�� '��'�̶� ��ü�� �־� �ٻ��� ���� �Դ� �������� �̷�� ��
	 *[������ ź��] ��� �ൿ�� '�л�'��ü�� '����' ��ü�� �̿��ϴ� �ൿ�� �߻��ϴ°�
	 *
	 *��ü ���� ���α׷����̶� ���� ��ü�� ����� ��ü ���̿� �Ͼ�� ���� �����ϴ°�
	 *
	 *Ŭ������?
	 *
	 *Ŭ������ ��ü�� �Ӽ��� ����� �ڵ�� �����Ѱ�
	 *
	 *�л� ��ü�� ǥ���ϱ� ���ؼ��� �̸�,�й�,�г�,��°� ����� ����.
	 *�̷� Ŭ���� �Ӽ��� Ư���̶�� �ϸ�, Ŭ���� ���ο� ������ ���� �Ѵ�.
	 *�̷��� �����ϴ� Ŭ������ �Ӽ��� '��� ����'��� ��
	 */
	
	/*
	 * ��) �л� Ŭ���� �����
	 * 
	 * public class Student {
	 * 		int studentID;
	 * 		String studentName;
	 * 		int grade;
	 * 		String address;
	 * }
	 * 
	 * ����) Person Ŭ���� �����(�̸�,����,����)
	 * 
	 * public class Person {
	 * 		String name;
	 * 		int age;
	 * 		char gender;
	 * }
	 * 
	 * 	�ڹ� Ŭ���� �̸� ���� ��Ģ
	 * 
	 * �ڹٿ��� Ŭ���� �̸��� �빮�ڷ� ������. �ҹ��ڷ� �����Ѵٰ� �ؼ� ������ �߻��ϴ°��� �ƴ�����, �빮�ڷ� �����ϴ� ���� �����ڵ� ������ ��Ģ
	 * �Ҽ� ������(social convension)�� ��ȸ�� ������ ���ϴ� ��ó�� �ڵ� ���׿����� �̷��� ��Ģ�� �ڵ� ������(coding convension)dlfkrhgka
	 * 
	 */
	/*
	 *   Ŭ���� ���캸��
	 *   
	 *    student Ŭ������ �ٽ� ���캸�� �л� ��ü�� ������ �Ӽ�(�й�,�̸�,�г�...)�� ������ ���� ����
	 *    Ŭ���� ���ο� �����Ͽ� ��ü �Ӽ��� ��Ÿ���� ������ [��� ����]��.
	 *    
	 *    Ŭ������ �����ϴ� ��� ������ �ٸ� ���δ� �Ӽ�, Ư�� ������ ǥ���ϱ⵵ ��.
	 *    ��� ������ �Ӽ��� �����ӿ� ���� �˸��� �ڷ����� ���� ���־����
	 *    
	 *    public class Person {
	 * 		String name;
	 * 		int height;
	 * 		double weight;
	 * 		char gender;
	 * 		boolean married;
	 * }
	 *    Person Ŭ������ ��������� �̸�, Ű, ������, ����, ��ȥ ���θ� ��������.
	 *    �̿� ���� ��� ������ ������ ��, int��, double�� ���� �⺻�ڷ������� ���� �� ���� �ְ�, �� �ٸ� Ŭ���������� ������ ������.
	 *    Ŭ�������̶� �ٸ� ���� ��ü�ڷ��� �Ǵ� ���� �ڷ����̶�� ��.
	 *    ���� �ڷ������� ����ϴ� Ŭ������ String, Date�� ���� �̹� JDK���� �����ϴ� ���ϼ��� �ְ�, �����ڰ� ���� ���� Student�� Person ���� Ŭ������ �ٸ� Ŭ�������� ����ϴ� ��� ������ �ڷ����� �� ���� ����.
	 *    
	 *    				------ �⺻ �ڷ���: int, long, float, double �� 
	 *    ������ �ڷ��� ----
	 *    				------ ���� �ڷ���: String, Date, Student ��
	 *
	 *	Ŭ���� ����� �����ϴ� �޼���
	 *
	 *	Ŭ���� ���ο��� ��������� ����Ͽ� Ŭ���� ����� �����ϴ� ���� '��� �Լ�' �Ǵ� '�޼���'��� ��
	 * 
	 * 	��) �л� �̸��� �ּ� ����ϴ� �޼��� �����
	 * 	
	 * public class Student {
	 * 		int studentID;
	 * 		String studentName;
	 * 		int grade;
	 * 		String address;
	 * 
	 * public void showStudentInfo(){
	 * 	System.out.println(studentName + ","+address);		//�̸�, �ּ� ���
	 * 	}
	 * }   
	 *  
	 *   ��Ű����????
	 *   
	 * 	��Ű���� ������ ���ϸ� Ŭ���� ������ ����. ��Ű���� ����� ������Ʈ ���������������� ���͸��� ������
	 *	��Ű���� ���� ������ ���� �� ����
	 */
	
	
	
	/*
	 *   �޼���
	 * 
	 * 	�Լ���?
	 * 	�ϳ��� ����� �����ϴ� �Ϸ��� �ڵ�
	 * 	�Լ��� ��� ����� ���� �ϵ��� ���� ������ ���� �ʿ��Ҷ� ���� ȣ���Ͽ� ����� �� ����
	 * 	
	 * 	�Է�(num1, num2)
	 * 		�Լ�(add�Լ�)
	 * 		result= num1+num2
	 * 					���(result)
	 * ==============================131�� ��============================================
	 * int[�Լ� ��ȯ��] add[�Լ� �̸�](int num1, int num2[�Ű� ����]){		
	 * 		int result;
	 * 		result = num1 + num2;
	 * 		return[�����] result;
	 * }
	 * =================================================================================
	 */
	int	getTenTotal() { 
		int i;
		int total = 0;
		
		for(i=1; i <= 10; i++) {
			total += i;
		}
		return total;
	 }

	/*
	 * 	return ������ ��ȯ��(114�� ����)
	 * add()�Լ��� ������ �� ��� ���� ���� result�� �����.
	 * result�� ����� ���� �Լ��� ȣ�������� ��ȯ�Ǵ� ���̹Ƿ� '��ȯ ��'�̶�� �θ�.
	 * '�� �Լ��� ��� ���� ��ȯ�մϴ�'�� �߻�� ���� �ٷ� return.
	 */
	
	
	
	
	//	�Լ� ȣ���ϰ� �� ��ȯ
//	public static void main(String[ ] args) {
//		
//		int exNum1 = 10;
//		int exNum2 = 20;
//		
//		int sum = add(exNum1, exNum2);
//		System.out.println(exNum1 + "+" + exNum2 + "=" + sum + "�Դϴ�." );
//	}
//
//	private static int add(int exNum1, int exNum2) {
//		int result = exNum1 + exNum2;
//		return result;
//	}
	
	/*�� �ڵ�� add()�Լ��� �����Ͽ���.
	 *�� ���� �Ű������� int�� ���� ���� �޾� �μ��� ���� ������, ��� ���� �������̱� ������ ��ȯ���� int����.
	 *��ȯ ���� int���̱� ������ ��� ���� ���ڵǴ� sum���� �տ� int�� ����.
	 * 
	 */
	
	//���� ����) ��Ģ������ �����ϴ� �Լ��� ��� ����
	
	public static void main(String[ ] args) {
		int testNum1 = 20;
		int testNum2 = 40;
		
		int sum = add1(testNum1, testNum2);
		System.out.println("�� :"+sum);
		
		int sub = remove(testNum1, testNum2);
		System.out.println("�� :"+sub);
		
		int mul = mul(testNum1, testNum2);
		System.out.println("�� :"+mul);
		
		int div = div(testNum1, testNum2);
		System.out.println("������ :"+div);
		
	}

	private static int div(int testNum1, int testNum2) {
		int result = testNum1 / testNum2;
		return result;
	}

	private static int mul(int testNum1, int testNum2) {
		int result = testNum1 * testNum2;
		return result;
	}

	private static int remove(int testNum1, int testNum2) {
		int result = testNum1 - testNum2;
		return result;
	}

	private static int add1(int testNum1, int testNum2) {
		int result = testNum1 + testNum2;
		return result;
	}
	
	
	/*	Ŭ���� ����� �����ϴ� �޼���
	 * �޼��״� �Լ��� ��ü ���� ������ ���Ե� ���� �����ϸ� ��
	 */

	public class Studnet{
		int studentID;
 		String studentName;
 		int grade;
 		String address;
 		
 		public String getStudentName() {
			return studentName;
		}	
 		
 		public void setStudentName(String name) {
 			studentName = name;
			
		}
	}
	
	/*	�޼��� �̸��� �ش� Ŭ������ ����ϴ� �ڵ��� ���忡�� ���� ���� ����.
	 * 	Student Ŭ������ ����ϴ� AŬ�������� �л��̸�(studenName)�� ��������(get) ����� �����ϴ� �޼��� �̸��� getStudentName���� ����.
	 * 	�޼����� ��ȯ ���� studentName�ε� studentName �ڷ����� String�̹Ƿ� ��ȯ���� String��.
	 * 
	 * 	setStudentName()�޼���� student Ŭ������ ����Ͽ� �ٸ� �ڵ忡�� �л��̸��� ���� �����ϰų� �ٲ�.
	 * 	studentName ���� �����ϴ�(set) ����� �����ϴ°�
	 * 	�ش� �޼���� �̸��� ���޹޾� �����ϴ°��̱� ������ �Ű����� name�� �ʿ�. �Ű����� name�� ������� studentName�� �����ϸ� �л� �̸��� ����.
	 *  ��ȯ ���� �������� ��ȯ���� void�� ����.
	 * 
	 */
	
	
	
}
