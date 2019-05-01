package 스태틱;

public class Worker {

	String name;
	String gender;
	int age;
	static int wcount;
	static int agesum;
	public Worker() {
		
	}
	public Worker(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		wcount++;
		agesum = agesum+age;
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + "]";
	}
	
	public void doit() {
		System.out.println("일하다");
	}
	public void friend() {
		System.out.println("친화력이 있다.");
	}
}
