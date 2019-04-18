package control;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int x = random.nextInt(100);
				
		//////////////////
		int count = 0;
		
		while (true) {
			count = count + 1;
			
			System.out.println("생각한 숫자를 입력하세요.");
			int y = sc.nextInt();
			if (x<y) {
				System.out.println("더 작습니다.");
			} else if (x>y) {
				System.out.println("더 큽니다.");
			} else {
				System.out.println("정답입니다");
				System.out.println("당신이 시도한 횟수는 >" + count);
				break;
			}
		}
	}
	
	// 숫자 맞추기
}

