package HomeWork02;

public class Temperature {

	double celsius;
	double fahrenheit;
	
	
	
	public Temperature() {
		
	}

	public Temperature(double celsius) {
		this.celsius = celsius;
	}

	public double toFahrenheit(){
		fahrenheit = celsius * 1.8 + 32;
		return fahrenheit;
	// return celsius * 1.8 + 32;
	}
}
