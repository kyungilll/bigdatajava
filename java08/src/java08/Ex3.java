package java08;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int membern = 5;
		String[] name = new String[membern];
		int[] age = new int[membern];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < age.length; i++) {
			System.out.print("이름을 입력하세요. > ");
			name[i] = sc.next();
			System.out.print("나이를 입력하세요. > ");
			age[i] = sc.nextInt();
		} //이름, 나이 입력받음
		
		System.out.println();
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + " "+ age[i]);
		} //이름, 나이 출력
		
		System.out.println("전체 인원수 : > " + membern);
		
		int sum=0;
		for (int i = 0; i < age.length; i++) {
			sum = sum+age[i];
		}
		System.out.println();
		System.out.print("참석자의 평균나이 > " + (sum/membern) + "살 입니다.");
	}
}
