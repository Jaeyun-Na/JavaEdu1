package kr.co.OOP;

class BirthDay{
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) {					// 태어난 연도를 지정하는 메서드
		this.year = year;							// dDay.year = year;와 같음
	}
	
	public void printThis() {						// this 출력 메서드
		System.out.println(this);					// System.out.println(dDay);와 같음
	}
	
}


public class ThisExmaple {

	public static void main(String[]arg) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);							// 태어난 년도 2000으로 지정
		System.out.println(bDay);					// 참조 변수 출력
		bDay.printThis();							// this 출력 메서드 호출
	}
}
