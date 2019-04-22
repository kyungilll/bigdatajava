package 반복문;

public class ForTest2 {
	int test; // 전역변수 (global)
	
	
	public static void main(String[] args) { //스트링으로 잡혀있는 이유 > 외부에서 입력받은 데이터는 모두 String
		for (int i=1; i<=10; i++) { // 횟수계산용도
			for (int j=1; j<=10; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
//		for (int i = 1; i < args.length; i++) { for 문에서 가장 가까운 배열 (sting)
//			
//		}
		
	
		
	}

}
