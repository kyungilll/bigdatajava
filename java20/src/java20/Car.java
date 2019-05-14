package java20;

public class Car {
	String color;
	int speed;
	
	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
		System.out.println("ST, INT");
	}
	
	public Car() {
	System.out.println("차 객체 생성");
	}
	
}
