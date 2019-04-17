package cal;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 400;
		
		if (x % 2 == 0) {
			System.out.println("짝수이다.");
		} else {
			System.out.println("짝수가 아니다.");
		}
		
		System.out.println("-----삼항연산자로 출력");
		
		System.out.println(x%2 ==0 ? "짝수":"홀수");
		// if문과 동일함
		
//		while(True) {
//			
//		} //무한루프
	}

}
