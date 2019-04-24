package 배열;

import java.util.Scanner;

public class 가수투표 {

	public static void main(String[] args) {
		String[] sing = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
	
			for (int j = 0; j < sing.length; j++) {
				System.out.print("가수 이름 입력 > ");
				sing[j] = sc.next();
			}
			for (int i = 0; i < sing.length; i++) {
				
				System.out.print(i+1 + ">" + sing[i]);
				if(i+1==sing.length) {
				}else {
					System.out.print(", ");
				}
			}
			while (true) {
			System.out.println();
			System.out.print("투표번호 > ");
			int vote = sc.nextInt();
			
			if (vote==1||vote==2||vote==3) {
			System.out.println("선택한 가수 > " + sing[vote-1]);
			} else {
				System.out.println("다시 입력하시오");
			}
	}

	}
}
