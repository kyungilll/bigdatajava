package 반복문;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
	while (true) {
		System.out.print("계절(1-4)를 입력하세요. => ");
		int i = sc.nextInt();
	
	
	if (i==1) {
		System.out.println("계절은  봄입니다.");
		break;
	}
	else if (i==2) {
		System.out.println("계절은  여름입니다.");
		break;
	}
	else if (i==3) {
		System.out.println("계절은  가을입니다.");
		break;
	}
	else if (i==4) {
		System.out.println("계절은  겨울입니다.");
		break;
	}
	

		
	sc.close();
	}}
	}
