package HomeWork01;

public class Account {
	
	String owner;
	int balance;
	int money;
	
	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public int deposit(int money) {
	     balance += money;
	     return balance;
	}
	public int withdraw(int money) {
		 balance -= money;
		 return balance; //가독성좋음 -> 리턴값을 식에서빼서 아래로 내림
	}
	public void showBalance() {
	System.out.printf(owner+ "님의 잔액: ");
	System.out.println(balance + "원");
			
	}
	
}
