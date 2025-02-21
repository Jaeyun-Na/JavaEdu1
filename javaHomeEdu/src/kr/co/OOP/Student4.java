package kr.co.OOP;

public class Student4 {

	public String studentName;							//학생 이름
	public int grade;									//학년
	public int money;									//소지금
	
	public Student4(String studentName, int money) {		//학생 이름과 소지금을 매개변로 받는 생성자
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {						//학생이 버스를 타면 1500원 지불하는 메서드
		bus.take(1500);
		this.money -= 1500;
	}
	public void takeSubway(Subway subway) {				//학생이 지하철 타면 2000원 지줄하는 메서드
		subway.take(2000);
		this.money -= 2000;
	}
	public void showInfo() {							//학생 정보를 출력하는 메서드
		System.out.println(studentName + "님의 남은 돈은 " +  money + "입니다.");
	}
}
