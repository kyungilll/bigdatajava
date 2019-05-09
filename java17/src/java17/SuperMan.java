package java17;

public class SuperMan extends Man{
//	이미 6가지 속성을 가진 상태
	//정적속성
	boolean fly;
	
	//동적속성
	public void flySpeed() {
		sleep();
		System.out.println("500으로 날다.");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", eye=" + eye + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
