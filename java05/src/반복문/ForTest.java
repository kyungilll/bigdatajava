package 반복문;

public class ForTest {
	int test; // 전역변수 (global)
	
	public static void main(String[] args) {
		int sum=0; //지역변수(local)
		int start;
//		for(초기값; 조건식; 증감식) {
		 for (start = 1; start <=10; start++)	{
			 sum=sum+start;
		 }
		 
		 System.out.println("1 부터 10까지의 합은 "+ sum + "입니다.");
			
		
	}

}
