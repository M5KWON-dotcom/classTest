package classTest;

public class MainClass2 {

	public static void main(String[] args) {
		ConTest cont2 = new ConTest();
		ConTest cont = new ConTest(10,"이순신",85.5);
		ConTest cont3 = new ConTest(15,"김유신");
		//number 10, name 이순신, score 85.5점으로 객체를 초기화하시오.
		
	/*	cont.name = "이순신";
		cont.number =  10;
		cont.score = 85.5; */
		
		System.out.println(cont.name);

	}

}
