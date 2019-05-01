package 스태틱;

public class Clock {
	int price;
	String name;
	int nowTime;
	String company;
	
	public void Clock() {
		
	}

	public Clock(int price, String name, int nowTime, String company) {
		this.price = price;
		this.name = name;
		this.nowTime = nowTime;
		this.company = company;
	}

	public Clock(int price, String company) {
		super();
		this.price = price;
		this.company = company;
	}

	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
}
