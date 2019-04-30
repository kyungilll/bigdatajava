package 자바생성자;

import java.util.Scanner;

public class 쇼핑몰1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Member1[] man = new Member1[3];
		
		for (int i = 0; i < man.length; i++) {
			
			System.out.print("아이디 입력");
			String id = sc.next();
			System.out.print("비밀번호 입력");
			String pw = sc.next();
			System.out.print("등급 입력");
			String grade = sc.next();
			System.out.print("마일리지 입력");
			int point = sc.nextInt();
			
			man[i] = new Member1(id, pw, grade, point);
		}
		
		System.out.println(man[0].id + "의 비밀번호는 " + man[0].pw +
				"입니다. \n" + man[1].id + "는 " + man[1].grade + "이고 마일리지는 " + 
				man[1].point + "입니다. \n 총 마일리지는 " 
				+ (man[0].point+man[1].point+man[2].point) +"입니다. "
						+ "\n 평균 마일리지는 " + 
				(man[0].point+man[1].point+man[2].point)/man.length 
				+"입니다.");
		
		
	}
}
