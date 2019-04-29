package 부품만들기;

public class TV {
//	TV > class

	boolean power;
	int size;
	String color;
	
//	-정적변수 : 모양, 크기, 색 => 멤버변수

//	-동적변수 : 채널변경, 음량조절, 연결 => 멤버메소드
	public void changeCh() {
		System.out.println("채널을 변경하다.");
	}
	public void volume() {
		System.out.println("음량을 조절하다.");
	}
	public void connect() {
		System.out.println("잭을 연결하다.");
	}
	
@Override // @ > 표시 , 지울 수 있음.

public String toString() { //스트링으로 바꾸다
	
	return power + " " + size + " " + color;
//	>> 주소가 찍히지 않고 세 변수가 찍힘
	
}
	
}
