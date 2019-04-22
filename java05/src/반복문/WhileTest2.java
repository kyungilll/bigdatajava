package 반복문;

public class WhileTest2 {

	public static void main(String[] args) {
		
	int x = 1;
	int sum=0;
	
	while (x<=10) {
		sum= sum+x; // 대입연산자 (=) 가 기준이 됨
		x=x+1; // x++ 같은 뜻
		
	}
	
	System.out.println(sum);
	
	}
}
