package 스태틱;

public class PersonTest {
	public static void main(String[] args) {
		
		Person prn1 = new Person(175, 65, "모름", "서울");
		Person prn2 = new Person(170, 60, "비밀", "경기");
		
		System.out.println(prn1.addr);
		System.out.println(prn2.getWeight());
		System.out.println(prn2.getSecret());
	}
}
