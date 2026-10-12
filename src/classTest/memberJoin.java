package classTest;

public class memberJoin {
	public static void main(String[] args) {
		
		Member member01 = new Member();
		
		member01.memberId ="tiger01";
		member01.memberPw ="1234d";
		member01.memberName ="홍길동";
		member01.memberAge = 19;
		member01.memberAdr = "경기도일산동구";
		//adultPass메서드를 호출, 매개변수가 없는 메서드이므로 인수를 넣지않고호출함
		
		Member member02 = new Member("lion01","8787a","이순신",20,"서울시용산구");{
		
	//	member01.adultPass() ;
		String pass = member01.adultPass();
		System.out.println(pass);
		
		pass = member02.adultPass();
		System.out.println(pass);
	}

}
}
