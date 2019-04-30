package 자바생성자;

public class tour {
public static void main(String[] args) {
	
	Car car1 = new Car(); // Car라는 클래스의 멤버변수가 복사됨
	//car1이라는 변수에 Car의 주소값이 들어가있음
	
	car1.color = "검정색";
	car1.convert = true;
	
	System.out.println(car1);
	
	
	car1.change();
	int exSpeed = car1.speedup(100);
	System.out.println(exSpeed + "km/h 로 속도를 높히다.");
	
//	System.out.println();
//	Car car =  new Car();
	
	Car car2 = new Car("빨강", false);
	System.out.println(car2);
	
	Car car3 = new Car("빨강");
	System.out.println(car3);
	
}
}
