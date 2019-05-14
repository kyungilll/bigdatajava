package java20;

public class Truck extends Car{
	int weight;
	int length;
	
	public Truck() {
		System.out.println("트럭객체 생성");
		
	}

	public Truck(int weight, int length) {
		super(); // 생략가능 , 부모의 기본생성자 자동으로 호출함
		this.weight = weight;
		this.length = length;
		System.out.println("INT,INT");
	}

	public Truck(String color, int speed, int weight, int length) {
		super(color, speed); // 생략불가 > 부모의 파라메터가 있는 생성자를 호출할 경우 수동으로 입력이 필요함
		this.weight = weight;
		this.length = length;
		System.out.println("ST,INT3");
	}

	
	 
	
}
