package HomeWork02;

public class Score {

	int kor;
	int eng;
	int math;
	
	double avg;
	int sum;
	String result;
	
	
	public Score() {
	}
	
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void  printScore1() {
		sum = kor + eng + math;
	  	avg = (kor + eng + math)/3.0; 
	  	System.out.println("총점: "+sum+"\n"+"평균: "+avg);	
	  	//System.out.println("총점: "+(kor+eng+math)+"점");
	  //System.out.println("평균: "+(kor+eng+math)/3.0+"점");
	}	
	public void printPass() { //평균이 90점 이상이면 "우수",
		//60점 미만이면 "재시험", 그 외는 "보통"을 출력
	if(avg>=90) {
		result = "우수";
		}else if(avg>=60) {
		result = "보통";
	    }else {
	    	result = "재시험";
	    } System.out.println(result);
	  //if(avg>=90){
	    //System.out.println("우수");
	    //}else if(avg<60){
	    //System.out.println("재시험");
	    //}else{
	    //System.out.println("보통");}
	}
}
