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
	
	Person returnSelf() {
		return this;
	}
	
}




public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnSelf();
		System.out.println(p);
		System.out.println(noName);

	}

}
