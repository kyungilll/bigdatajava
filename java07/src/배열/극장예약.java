package 배열;

import java.util.Scanner;

public class 극장예약 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int[] seat = new int[10];
			int[] seat1 = new int[10];
			
			System.out.println("--------------------");
			
			for (int i = 0; i < seat.length; i++) {
				seat[i] = i+1;
				System.out.print(" " + seat[i]);
			}
			System.out.println();
			System.out.println("--------------------");

			
			for (int i = 0; i < seat1.length; i++) {
				seat1[i] = 0;
				System.out.print(" " + seat1[i]);
			}
			System.out.println();
			
		
			for (int i = 0; i < seat1.length; i++) {
				System.out.print("원하시는 좌석번호를 입력하세요. > ");
				int input = sc.nextInt()-1;
				seat1[input] = 1;
				
				for (int j = 0; j < seat1.length; j++) {
					System.out.print(" " + seat1[j]);
				}
				System.out.println();
				
				int sum=0;
				for (int j = 0; j < seat1.length; j++) {
					
					if (seat1[j]==1) {
						sum = sum+1;
					}
					
				}
				System.out.println(10000*sum);
				
			}
			
			
		
	}

}
