package 부품만들기;

public class 내방 {

	public static void main(String[] args) {
		Phone p1 = new Phone();

		p1.company = "apple"; // 만들지 않은 메소드는 상속받은 것
		p1.shape = "네모";
		p1.size = 11;
		
		System.out.println(p1.company);
		System.out.println(p1.shape);
		System.out.println(p1.size);
		
		//--------------------------------------
		
		Phone p2 = new Phone();
		p2.company = "삼성";
		p2.shape = "네모";
		p1.size = 10;
		
		System.out.println(p2.company);
		System.out.println(p2.shape);
		System.out.println(p2.size);
		
		p1.call();
		p1.text();
		p1.alarm();
		
		TV tv1 = new TV(); // > 메모리할당
		//  new > 객체생성의 역할
		
		//이후 생성자 이용
		tv1.color = "빨강색";
		tv1.power = true;
		tv1.size = 30;
		
//		System.out.println(tv1.color);
//		System.out.println(tv1.power);
//		System.out.println(tv1.size);
		
		System.out.println(tv1); //원래는 주소값 출력이지만 tostring으로 재정의
		
		
		
	}

	
}
