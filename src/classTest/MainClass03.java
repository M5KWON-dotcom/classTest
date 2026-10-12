package classTest;

public class MainClass03 {

	public static void main(String[] args) {
		Score score1 = new Score(90); 

		System.out.println(score1.kor);
	}
	Score score2 = new Score();
//	score.eng = 85;

	Score score3 = new Score(90,70,100);
// 영어점수 85점 객체의선언과 동시에 초기화하시오.-> 불가능
}
