package privateTest;

public class MainStatic {

	public static void main(String[] args) {
		
		
	StaticTest value =new StaticTest();
	value.name = "홍길동";
	value.age = 17;
	
	StaticTest.age = 17;
	StaticTest.name = "홍길동";
		
	}
	}