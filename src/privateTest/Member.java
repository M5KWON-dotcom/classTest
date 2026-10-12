package privateTest;

public class Member {

	private String email;
	private String password;
	private String name;
	private int age;
	private String number;
	private int phonenumber;
	
	public Member() {
		}
	public Member(String email, String password, String name, int age, String number, int phonenumber) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.age = age;
		this.number = number;
		this.phonenumber = phonenumber;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	
}
