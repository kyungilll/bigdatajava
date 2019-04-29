package 부품만들기;



public class Phone {

//		전화기 =>class
//		특징,특성을 찾아 부품을 만듦
//
//		-정적특성 : 모양, 크기, 제조사	=> 멤버변수
	String shape; //값을 넣지않음
	int size;
	String company;
	
//		-동적특성 : 전화하다, 문자하다, 알람을 맞추다. => (멤버)메소드
	public String call() { //소괄호의 용도 > 
		return "친구";
	}
	public void text() {
		System.out.println("문자하다.");
	}
	public int alarm() {
		return 10;
	}
	@Override
	public String toString() {
		return "Phone [shape=" + shape + ", size=" + size + ", company=" + company + "]";
		// return > 반환값이 있음
		// void 가 있을 경우 return 을 쓰지 않음
		
		
	}

	
}
