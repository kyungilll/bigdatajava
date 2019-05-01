package 스태틱;

public class Person {
	int height;
	int weight;
	String secret;
	String addr;
	
	public Person() {
		
	}
	public Person(int height, int weight, String secret, String addr) {
		this.height = height;
		this.weight = weight;
		this.secret = secret;
		this.addr = addr;
	}

	public int getWeight() {
		return weight;
	}
	public double getSecret() {
		return (height-100)*0.9;
	}
	public String getAddr() {
		return addr;
	}
}
