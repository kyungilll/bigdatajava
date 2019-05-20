package String테스트;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.random());
		int num = (int)(Math.random()+10);
		System.out.println(num);
		
		double num2 = 12345.6789;
		System.out.println(Math.ceil(num2)); //소숫점  올림
		System.out.println(Math.floor(num2)); //소숫점 내림
		System.out.println(Math.round(num2));// 반올림
		final double NUM = 1000; 
		//한 번 넣어두고 변하지 않는 값 > 상수 / 일반적으로 대문자 표시
		//final class는 상속할 수 없음 / 종단클래스
		
		int num3 = -100;
		System.out.println(Math.abs(num3));
		
		int num4 = -200;
		System.out.println(Math.max(num3, num4));
		
		System.out.println(Math.pow(3, 3));
		System.out.println(Math.sqrt(100));
		
		Random r = new Random();
		r.setSeed(100); //매번 같은 랜덤값으로 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(100));
		}
		System.out.println(Math.tan(90));
		
	}

}
