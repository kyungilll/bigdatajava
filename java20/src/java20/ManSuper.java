package java20;

public class ManSuper extends Man{

	String color;
	String location;
	
	public ManSuper(int tall, int weight, String color, String location) {
		super(tall, weight);
		this.color = color;
		this.location = location;
	}


	public String toString() {
		
		return super.toString();
	}
	
}
