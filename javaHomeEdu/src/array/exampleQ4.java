package array;

public class exampleQ4 {

	public static void main(String[] args) {
		
		dog[] dogArray = new dog[5];
		dogArray[0] = new dog("�ǹ�", "ġ�Ϳ�");
		dogArray[1] = new dog("����", "Ǫ��");
		dogArray[2] = new dog("����", "���޸���");
		dogArray[3] = new dog("����", "����");
		dogArray[4] = new dog("����", "������");
		
		for(int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		for(dog Dog : dogArray) {
			System.out.println(Dog.showDogInfo());
		}
	}

}
