package privateTest;

public class Board {
	
	    private int boardNum =1;
		private String writer = "홍길동";
		private String title = "안녕하세요.";
		private String content = "오늘, 날씨 좋아요~!";
		private String date = "2026-10-01";
		private int hit = 0;
	//외부로부터 받아온 인수를 멤버변수인 boardNum에 저장해주는 메소드
		
	 public Board() {
	}
	 	 
	 public Board(int boardNum, String writer, String title, String content, String date, int hit) {
		this.boardNum = boardNum;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.date = date;
		this.hit = hit;
	}
	 public void setBoardNum(int boardNum) { //private로 감싼거와 세트		
	     this.boardNum = boardNum;
		 }
	 public int getBoardNum() {
		 return boardNum;
	 }
	 public String getWriter() {
		 return writer;
	 }
	 public void setWriter(String writer) {
		 this.writer = writer;
	 }
	 public String getTitle() {
		 return title;
	 }
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 public String getContent() {
		 return content;
	 }
	 public void setContent(String content) {
		 this.content = content;
	 }
	 public String getDate() {
		 return date;
	 }
	 public void setDate(String date) {
		 this.date = date;
	 }
	 public int getHit() {
		 return hit;
	 }
	 public void setHit(int hit) {
		 this.hit = hit;
	 }
	
	
	 /* public int getBoardNum(){    
      	 return this.boardNum;
	 }
     public void setWriter(String writer) {  //private로 감싼거와 세트		
     this.writer = writer;
     }
     public void setTitle(String title) {  //private로 감싼거와 세트		
         this.title = title;   

      */
     }
