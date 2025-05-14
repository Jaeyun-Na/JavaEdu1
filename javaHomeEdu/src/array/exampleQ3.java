package array;

public class exampleQ3 {

	public static void main(String[] args) {
		int[] evenNum = new int[5];
		int currentEven = 2;
		
		for(int i = 0; i < evenNum.length; i++) {
			evenNum[i] = currentEven;									//현재 짝수를 배열에 저장
			currentEven += 2;											//다음 짝수로 이동(+2씩)
		}
		System.out.println("배열 저장 값들");
		for(int i = 0; i < evenNum.length; i++) {
			System.out.println(evenNum[i]+(i < evenNum.length-1 ? ", " : ""));
		}
		System.out.println("\n-----------------------------");
		
		int sum = 0;
		for(int i = 0; i < evenNum.length; i++) {
			sum+= evenNum[i];
		}
		System.out.println("짝수의 합은 : " + sum);
	}

}
