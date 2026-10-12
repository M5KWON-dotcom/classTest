package classTest;

public class Member {
//아이디, 비밀번호, 회원이름, 회원나이, 회원주소
	String memberId; //회원아이디
	String memberPw; //회원비밀번호
	String memberName; //회원이름
	int memberAge; //회원나이
	String memberAdr; //회원주소
	
	public Member() { //기본 생성자 -> 생략가능
		
	}
    public Member(String memberId,String memberPw,String memberName,int memberAge, String memberAdr) { //기본 생성자 -> 생략가능
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberAdr = memberAdr;
	
	}
	
	public String adultPass() {  //"성년"or"미성년"
		if(this.memberAge <= 19) {
    	return"미성년";}
		return"성년";	
		}
		}//void ->리턴값 없음
	

