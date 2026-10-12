package privateTest;

public class Membertest {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.setAge(0);
		System.out.println(member.getAge());
		
		member.setEmail(null);
		System.out.println(member.getEmail());
		
		member.setName(null);
		System.out.println(member.getName());
		
			
	}
}
