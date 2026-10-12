package classTest;

public class Score {

	int kor;
	int eng;
	int math;
	public Score() {// 기본생성자 자동으로 만들어짐 (우클릭-> source->제너럴 맨밑
	
		// TODO Auto-generated constructor stub
	}
	public Score(int kor, int eng, int math) { // 기본생성자 자동으로 만들어짐 (우클릭-> source->제너럴 필드
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Score(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
	public Score(int kor) {
		this.kor = kor;
	}
	
	
	//public void pass(int score) {
		//String pass = getGrade(score);
		//System.out.println("당신의 등급은"+ pass + "입니다.");
	}

