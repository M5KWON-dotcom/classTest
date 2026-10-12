package privateTest;

public class MainTest {
public static void main(String[] args) {

	PrivateTest01 privatetest =new PrivateTest01("홍길동",90);
	
	//privatetest.name = "홍길동";
	//privatetest.score = 90;
	
	privatetest.inputScore(100);
	
	privatetest.test();
	
	}
}