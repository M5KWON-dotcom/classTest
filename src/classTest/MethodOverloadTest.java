package classTest;

public class MethodOverloadTest {
	
	public int add(int a) {  //이름이 같은 메서드가 존재하므로 호출불가 에러
		return a + 100;
	}
	public int add(int a, int b) {
		return a + b;  // 메서드의 이름이 같더라도 매개변수의 타입과 갯수가 다르면
	                   //오버로딩
	}
	public int add(double a) {
		return(int) a + 100; //매개변수의 타입이 다름
	}

	
}
