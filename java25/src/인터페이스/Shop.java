package 인터페이스;

public class Shop implements Circle, Pay {
	// 다중인터페이스를 끌어오기 가능 (다중상속)

	@Override
	public void size() {
		System.out.println("size of circle");
	}

	@Override
	public void 반지름을구하다() {
		System.out.println("반지름을 구하다");
	}

	@Override
	public void 계산하다() {
		System.out.println("CALCUL of Pay");
	}

}
