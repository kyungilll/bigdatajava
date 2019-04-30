package 자바생성자;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		MemberBank[] mb = new MemberBank[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < mb.length; i++) {
			System.out.println("상품명을 입력하세요.");
			mb[i].product = sc.next();
			System.out.println("예금주명을 입력하세요.");
			mb[i].name = sc.next();
			System.out.println("예금액을 입력하세요.");
			mb[i].money = sc.nextInt();
		}
		
		System.out.println(mb[1].product + "통장에는 " + 
		mb[1].money + "만원이 들어있어요 \n" + mb[2].name + 
		"의 통장에는 " + mb[2].money + "만원이 들어있어요. \n  "
				+ "우리집 전체 예금액은 " + (mb[0].money + mb[1].money + 
						mb[2].money)+ "만원 이예요.");
	}
	

	
}
