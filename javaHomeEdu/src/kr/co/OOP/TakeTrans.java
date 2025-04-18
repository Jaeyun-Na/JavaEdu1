package kr.co.OOP;

import kr.co.hiding.Student;

public class TakeTrans {

	public static void main(String[] args) {
		Student4 studentJames = new Student4("James",5000);				//학생 생성
		Student4 studentTomas = new Student4("Tomas",10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Student4 studentEdward = new Student4("Edward",15000);
		Taxi taxi = new Taxi("자바 운수");
		studentEdward.takeTaxi(taxi);
		studentEdward.showInfo();
		taxi.showInfo();
	}

}
