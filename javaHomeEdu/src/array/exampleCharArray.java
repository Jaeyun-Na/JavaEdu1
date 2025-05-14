package array;

public class exampleCharArray {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for(int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;								// 아스키 값으로 각 요소에 저장
		}
		
		for(int i = 0; i < alphabets.length; i ++) {
			char uppercaseChar = Character.toUpperCase(alphabets[i]);
			System.out.println(uppercaseChar + " , " + (int)uppercaseChar);
		}
	}
}
