package thisEx;

class Person{
	String name;
	int age;
	
	Person(){
		this("�̸�����",1);
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}




public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
	}

}
