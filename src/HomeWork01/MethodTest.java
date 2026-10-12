package HomeWork01;

public class MethodTest {


	public void printStar(int count) {
			
		for(int i=1;i<=count;i++) {
			System.out.printf("*");
	}
		System.out.println();
	
	}
    public int max(int a,int b) {
    	if(a < b) {
    		return b;
    	} return a;
    }	
       
 
    public double calculateAverage(int a,int b, int c) {
    double avg = (a + b + c) / 3;
    return avg;
    }
    
    
}