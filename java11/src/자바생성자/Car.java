package 자바생성자;

import java.awt.Color;

public class Car {

	
	// 정적속성
	String color;
	boolean convert;
	
//	public Car() {
//		System.out.println("객채생성시 초기화 할 처리를 실행...");
//	}
//	
//	public Car(String color, boolean convert) {
//		//color, convert 는 지역변수, 밖에서 같은 이름의 변수를 쓸 수 있음 
//		this.color = color;
//		this.convert = convert;
//		//지역변수는 파란색, 전역변수는 갈색으로 표시됨
//		//현재작업중인 클래스를 지정할 때 this
//		
//		
////		====>입력속성에 따라서 Car를 구분함
//		
//	}
//	public Car(String color) {
//		this.color = color;
//	}
	
	//생성자단축기 > alt + shift + s + o
	
	public Car(boolean convert) {
		this.convert = convert;
	}
	
	
	public Car() {
	} //기본생성자 > 아래 파라메터가 있는 생성자가 있을 경우에는 만들 수 없음


	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, boolean convert) {
		this.color = color;
		this.convert = convert;
	}


	// 동적속성
	public void change() {
		System.out.println("기어를 변속하다.");
	}
	
	
	public int speedup(int nowSpeed) {
		return nowSpeed + 30;
	} // nowSpeed > 매개변수=파라메터 ★


	@Override
	public String toString() {
		return "Car [color=" + color + ", convert=" + convert + "]";
	} //입력값없음 , 문자열로 리턴 
	

}
