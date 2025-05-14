package array;

public class exampleQ4 {

	public static void main(String[] args) {
		
		dog[] dogArray = new dog[5];
		dogArray[0] = new dog("뽀미", "치와와");
		dogArray[1] = new dog("초코", "푸들");
		dogArray[2] = new dog("설탕", "포메리안");
		dogArray[3] = new dog("순돌", "시츄");
		dogArray[4] = new dog("진돌", "진돗개");
		
		for(int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		for(dog Dog : dogArray) {
			System.out.println(Dog.showDogInfo());
		}
	}

}
