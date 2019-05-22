package 인터페이스;

public class MelonCar implements Car { //상속받은 것과 같은 개념

	@Override
	public void start() {
		System.out.println("메론카 순간 가속");
	}

	@Override
	public void speedUp() {
		System.out.println("메론카 300");
	}

	@Override
	public void speedDown() {
		System.out.println("메론카 감속");
	}

}
