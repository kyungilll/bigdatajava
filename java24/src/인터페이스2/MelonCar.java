package 인터페이스2;

public class MelonCar implements Car{

	@Override
	public void start() {
		System.out.println("메론출발");
	}

	@Override
	public void speedUp() {
		System.out.println("메론가속");
	}

	@Override
	public void speedDown() {
		System.out.println("메론감속");
	}

}
