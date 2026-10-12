package classTest;

public class Student {
	
//멤버변수 선언(속성,필드)  
	String name;
	String hakbun;
	int grade;
	int age;
	int score;
	
	public void hello( ){ //반환값이 없는 메서드 -> 반환타입을 void로 선언
	System.out.println("안녕하세요");
	System.out.println("반갑습니다");
	System.out.println("감사합니다");
    }
	public int add(int num1,int num2) {//외부로부터 2개의 수를 입력받아서, 그 두 수의 합을 반환하는 메서드
		
		return num1 + num2;
		//num 매개변수, parameter
		                 //200 인수, 인자값 argument
	}
    public double average(int num1,int num2) {//외부로부터 2개의 수를 입력받아서, 그 두 수의 합을 반환하는 메서드
		double result1;
		result1 = add(num1,num2)/3.0;
		return result1;
    }
	public void	greeting(String str) { // 매개변수는 존재하고 반환값은 없는메서드
		System.out.println(str+"님 안녕하세요");
		//return str;(void->String)
	}
	public int numout() { //매개변수는 없고, 반환값만 존재하는메서드
		int sum;
		sum = 100+200;
	// result = 1000+2000;
		//return sum; result;
		return sum; //자바에서 메서드는 오직 1개의 반환값만을 가질수있다.
	}
	public static void hello2() {
		System.out.println("Hello world!!");
	}
	public String pass(int score) {
		if(score>=80) {
		return"A";
		}else {
        return"B";
		}
		}
	
	}
