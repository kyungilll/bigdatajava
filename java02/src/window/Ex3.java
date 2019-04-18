package control;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			while (true) {
			System.out.println("점수를 입력하세요.");
			int x = sc.nextInt();
			
			System.out.print("당신의 학점은 > ");
			if (x>=90) {
				System.out.println("A");
			} else if (x>=80) {
				System.out.println("B");
			} else if (x>=70) {
				System.out.println("C");
			} else if (x>=60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
			System.out.println("-----------");
			System.out.println(" ");
			}
	}
}

//입력값을 받아서, 학점계산
//
//90점이상  A
//80점이상  B
//70점이상  C
//60점이상  D
//그 이하  F