package HomeWork02;

public class MainMethod {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		product.name = "마우스";
		product.price = 2000;
		product.quantity = 100;
		
		int sum =product.getTotalPrice(2000,100);
		
		System.out.println("총 가격:"+ sum);
		

	    Score score = new Score(90,80,100); 
	    score.printScore1();	//int오류
	    score.printPass();  //boolean말고 다른거?
	    
	  	
	    Temperature temperature = new Temperature(25.0);
	    double tem = temperature.toFahrenheit();
        System.out.println("화씨 온도: " + tem);
	    
	    Movie movie = new Movie(140);//위아래 둘다 140 넣어야 결과값이 나옴
	    boolean movieRuntime  = movie.isLongMovie(140); //좀더 간편하게 할수있는지?
	    System.out.println("긴 영화인가요? "+ movieRuntime );
	}
}

