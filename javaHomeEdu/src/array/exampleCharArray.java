package array;

public class exampleCharArray {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for(int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;								// �ƽ�Ű ������ �� ��ҿ� ����
		}
		
		for(int i = 0; i < alphabets.length; i ++) {
			char uppercaseChar = Character.toUpperCase(alphabets[i]);
			System.out.println(uppercaseChar + " , " + (int)uppercaseChar);
		}
	}
}
