package array;

public class exampleQ3 {

	public static void main(String[] args) {
		int[] evenNum = new int[5];
		int currentEven = 2;
		
		for(int i = 0; i < evenNum.length; i++) {
			evenNum[i] = currentEven;									//���� ¦���� �迭�� ����
			currentEven += 2;											//���� ¦���� �̵�(+2��)
		}
		System.out.println("�迭 ���� ����");
		for(int i = 0; i < evenNum.length; i++) {
			System.out.println(evenNum[i]+(i < evenNum.length-1 ? ", " : ""));
		}
		System.out.println("\n-----------------------------");
		
		int sum = 0;
		for(int i = 0; i < evenNum.length; i++) {
			sum+= evenNum[i];
		}
		System.out.println("¦���� ���� : " + sum);
	}

}
