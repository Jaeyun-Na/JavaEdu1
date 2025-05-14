package array;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<dog> list = new ArrayList<dog>();
		
		list.add(new dog("뽀미", "치와와"));
		list.add(new dog("초코", "푸들"));
		list.add(new dog("설탕", "포메리안"));
		list.add(new dog("순돌", "시츄"));
		list.add(new dog("진돌", "진돗개"));
		
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i).showDogInfo());
		}
		
		for(array.dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
	}

}
