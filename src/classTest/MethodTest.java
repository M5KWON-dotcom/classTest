package classTest;

public class MethodTest {
	int value = 10;  //글로벌배리어블,전역변수
	
	public int test01(){
		int num = 100; //지역변수,로컬배리어블
		return num+ value + 100;  //200
	}
    public int test02() { 
    	int num =100; //전역변수와 지역변수의 이름이 같을경우, 지역변수가 우선
    	return num+200;//300
    }
}
