package control;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		
		System.out.println("누가 더 큰지 판별하여 프린트하세요");
		
		if (x1 > x2) {
			System.out.println(x1);
		} else if (x1 < x2) {
			System.out.println(x2);
		} else {
			System.out.println("두 수는 같거나 비교할 수 없습니다.");
		}
	}

}
//
//예제 1번
//두 수를 입력받으세요
//누가 더 큰지 판별하여 프린트