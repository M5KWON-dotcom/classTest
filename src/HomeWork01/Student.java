package HomeWork01;

public class Student {

	String name;
	int score;
	
	
	public void introduce() {
		System.out.println("이름:" + name);
		System.out.println("점수:" + score);
	}
	public boolean isPass() { //is로 시작하면 boolean타입이 많다
		if(score>=60) {
			return true;
		} return false;
	}
	public String getGrade() {
		String result;
		if(score>=90) {
			result = "A";
		}else if(score>=80) {
			result = "B";
		}else if(score>=70) {
			result = "C";
	    }else {
		result = "F";}
		return result;
}
	public void weightScore(int score) {
		System.out.println( this.score+ score);
	}
}
