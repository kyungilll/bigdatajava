package control;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요");
		
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		
		System.out.println("x1+x2 = " + (x1+x2));
		System.out.println("x1-x2 = " + (x1-x2));
		System.out.println("x1*x2 = " + (x1*x2));
		if (x2==0) {
			System.out.println("x1/x2 = " + "계산불가");
		} else {
		System.out.println("x1/x2 = " + (x1/x2));
		}
	}
	
}
//예제 2번
//두 수를 입력받으세요
//4칙 연산을 하여 프린트