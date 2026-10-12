package classTest;

public class ConTest {

	int number;
	String name;
	double score;
	
	//생성자만들기 -> public 생략가능
	public ConTest(){ //기본생성자 ->표시 생략 가능
		
	}
	public ConTest(int number,String name,double score){ 
	     this.number =10;//number
	     this.name ="이순신";
		 this.score =85.5;
	}
	public ConTest(int number,String name){ 
	     this.number = 15;//number
	     this.name ="김유신";
		 
}
}