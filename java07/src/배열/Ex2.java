package 배열;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		
		for (int i : num) {
			System.out.println("숫자를 입력하시오");
			num[i] = sc.nextInt();
			
		}
		System.out.println(num[0] + "+" + num[2] + " 은" + (num[0]+num[2]) + " 입니다.");
	}

}
