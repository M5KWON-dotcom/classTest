package HomeWork02;

public class Product {
	
	String name;
	int price;
	int quantity;
	
	public int getTotalPrice(int price, int quantity) {
		int result;
		result = price * quantity;
		return result;
	}
	
	

}
