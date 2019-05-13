package 같은패키지;

public class 직원User {
	
	public static void main(String[] args) {
		직원 work = new 직원();
		work.age = 100; // default = 같은 package 내에서 접근가능
		work.name = "pakr"; 
		work.salary = 100; //같은 상속관계에 있는 다른 패키지까지 사용가능
//		work.ssn = "10010";
	}
	
}
