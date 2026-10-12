package HomeWork01;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account("홍길동",10000);
		account.deposit(5000);
		account.withdraw(3000);
		account.showBalance();
		
	}

}
