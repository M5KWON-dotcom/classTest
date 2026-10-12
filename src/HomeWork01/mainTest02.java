package HomeWork01;

public class mainTest02 {
	public static void main(String[] args) {
	
	MethodTest calculateAverage = new MethodTest();
	
	double avg = calculateAverage.calculateAverage(80, 90, 70); //반환값 지정
	System.out.println(avg);

	
	Student student01 = new Student();
	student01.name = "홍길동";
	student01.score = 75;
	
	student01.introduce();
	boolean pass = student01.isPass();
	System.out.println(pass);
	
	String res = student01.getGrade();
	System.out.println(res);
	
	student01.weightScore(10);
}
}
