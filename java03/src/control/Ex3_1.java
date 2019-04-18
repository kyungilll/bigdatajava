package control;

import java.util.Scanner;

public class Ex3_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			while (true) {
			System.out.println("점수를 입력하세요.");
			int x = sc.nextInt();
			
			String result;
			
			if (x>=90) {
				 result = "A";
			} else if (x>=80) {
				 result = "B";
			} else if (x>=70) {
				 result = "C";
			} else if (x>=60) {
				 result = "D";
			} else {
				 result = "F";
			}
			System.out.print("당신의 학점은 " + result + "입니다.");
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