package kr.co.OOP;

public class Person {

	String name;
	float height;
	float weight;

	public Person() { // 디폴드 생성자
	}

	public Person(String pname) {
		name = pname;
	}

	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
}
