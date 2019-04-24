package 배열;

import java.util.Scanner;

public class 성적 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[] scorej = new int[3];
		int[] scores = new int[3];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("이름을 입력하세요 >");
			name[i] = sc.next();
			System.out.print("자바점수를 입력하세요 >");
			scorej[i]= sc.nextInt();
			System.out.print("스프링점수를 입력하세요 >");
			scores[i]= sc.nextInt();
			
			System.out.println();
		}
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생이름 : " + name[i]);
			System.out.println("자바점수 : " + scorej[i]);
			System.out.println("스프링점수 : " + scores[i]);
		}
		
		System.out.print("세 학생의 이름은 : ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		System.out.print("자바 점수 중 제일 높을 자바 점수는 : > ");
		int maxj = 0;
		for (int i = 0; i < scores.length; i++) {
			
			if (maxj<scorej[i]) {
				maxj = scorej[i];
			}
			
		}
		System.out.print(maxj);
		for (int j = 0; j < scores.length; j++) {
			
			if (maxj==scorej[j]) {
				System.out.println(" ("+ name[j] + ") ");
			}
		}
		System.out.println();
		System.out.print("스프링 점수 중 제일 낮은 자바 점수는 : > ");
		int mins=100;
		for (int i = 0; i < scores.length; i++) {
			
			if (mins>scores[i]) {
				mins = scores[i];
			}
		}
		System.out.print(mins);
		for (int j = 0; j < scores.length; j++) {
			
			if (mins==scores[j]) {
				System.out.println(" ("+ name[j] + ") ");		
		
	}
		}
	}
}


	
