package privateTest;

public class PrivateTest01 {
	
	String name;
	private int score;
	public PrivateTest01() {
	}
	public PrivateTest01(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public void inputScore(int score) {
		this.score =score;
	}
	
	public void test() {
		System.out.println(name);
		System.out.println(score);
		
		
	}

}
