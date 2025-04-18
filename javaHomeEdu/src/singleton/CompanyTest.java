package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company myCompany1 = Company.getInstance();					//클래스 이름으로 getInstnace()호출하여 참조 변수에 대입
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);				//두 변수가 같은 주소인지 확인
		
	}

}
