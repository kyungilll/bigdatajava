package 부품만들기;

public class 거실 {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		p1.company = "사과";
		p1.shape = "네모";
		p1.size = 11;
		
		System.out.println(p1);
		
		//메소드 사용(call, 부른다)
		String name = p1.call();
		System.out.println(name + "와 통화하다.");
		
		//void 형의 메소드를 호출할 경우에는
		//리턴받은 값이 없어 변수에 넣을수도, 출력할 수도 없다.
//		System.out.println(p1.text(););
		
		System.out.println("나는오늘 " + p1.alarm()+"시 보다 한 시간 일찍 일어났다.");
		int time = p1.alarm();
		
		System.out.println(time);
	}
	

}
