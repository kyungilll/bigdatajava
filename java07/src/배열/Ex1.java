package 배열;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] ex = new String[3];
		
		for (int i = 0; i < ex.length; i++) {
			System.out.println("과목을 입력하세요.");
			ex[i] = sc.next();
		}
		
		System.out.println(ex[0] + "보다는" + ex[2]);
	}

}
