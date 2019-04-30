package 자바생성자;

public class Member {

	String name;
	int age;
	String tel;
	String addr;
	
	public Member(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
		
		
	}
	@Override
	public String toString() {
		return name + "     " + age + "      " + tel + "       " + addr;
	}
	
	
	
	//한사람씩 네 개의 데이터를 입력받아야함

	
}
