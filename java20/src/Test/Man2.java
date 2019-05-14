package Test;

public class Man2 extends Man {

	int z;
	int a;
//	public Man2(int x, int y, int z, int a) {
//		super(x, y);
//		this.z = z;
//		this.a = a;
//		 System.out.println("자식 파라미터");
//	}
//	public Man2() {
//		super();
//		System.out.println("자식 기본생성자");
//	}
	public Man2(int x, int y) {
		super(x, y);
		System.out.println("자식 > 부모 파라메터");
	}
	
	

	
}
