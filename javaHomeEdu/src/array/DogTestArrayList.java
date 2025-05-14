package array;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<dog> list = new ArrayList<dog>();
		
		list.add(new dog("�ǹ�", "ġ�Ϳ�"));
		list.add(new dog("����", "Ǫ��"));
		list.add(new dog("����", "���޸���"));
		list.add(new dog("����", "����"));
		list.add(new dog("����", "������"));
		
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i).showDogInfo());
		}
		
		for(array.dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
	}

}
