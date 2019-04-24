package 배열;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		
		int[] scores = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			String x = JOptionPane.showInputDialog("성적을 입력하세요");
			scores[i] = Integer.parseInt(x);
//			scores[i] = sc.nextInt();
			sum = sum + scores[i];
		}
		double avg = sum/scores.length;
		System.out.println("평균 성적은 " + avg + "입니다.");
	}

}
