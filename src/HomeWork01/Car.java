package HomeWork01;

public class Car {
	
	String model;
	String color;
	int speed;
	
	
	public Car(String model, String color, int speed) {//생성자
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	public void showInfo() {
		System.out.println("모델:"+ model);
		System.out.println("색상:"+ color);
		System.out.println("속도:"+ speed);
		System.out.println();
		
		//System.out.println("모델:"+ model + "\n" + "색상:"+ color + "\n" + "속도:"+ speed);
	}
/*	public Car(String mdodel,String color,int speed) {
		this.model = "아반떼";
		this.color = "검정색";
		this.speed = 30;
	} */
}
