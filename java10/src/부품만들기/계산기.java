package 부품만들기;

public class 계산기 {

		public int add(int x, int y) {
			return x+y;
		}
		
		public void add(int x, double y) {
			System.out.println(x+y);
		}
		
		//입력값의 타입으로 구별
		//자바는 메소드 이름을 동일하게 할 수 있다.
		//하나의 이름으로 동일한 기능을 표현하게 하는 기능.
		//다형성(오버로딩) 
	
		public void add(String x, int y) { //인자(매개변수 = parameter)는 반드시 두 개 필요
			System.out.println(x+y); 
		}
		
		//입력값의 개수, 타입, 순서가 일치해야 함
}
