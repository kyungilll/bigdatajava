package 스태틱;

public class Money {
	static int money = 10000;
	
	String name;
	int age;
	
	public Money() {
		
	}
	
	public Money(String name, int age) {
		this.name = name;
		this.age = age;
		money = money-1000;
	}


	@Override
	public String toString() {
		return " [이름=" + name + ", 나이=" + age + "]";
	}

	//동적변수
	public String play() {
		return "놀아요.";
	}
	public String tv() {
		return "TV를봅니다..";
	}
}
