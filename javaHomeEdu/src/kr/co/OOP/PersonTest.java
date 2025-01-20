package kr.co.OOP;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personKim = new Person();
		
		personKim.name="김유신";
		personKim.weight=85.5F;
		personKim.height=180.0F;
		
		Person personLee = new Person("이순신",175,75); // 매개변수를 받는 생성자를 생성했을 떄 오류 발생.(디폴트 생성자 활성 이후 오류 해결)
		
	}

}
