package control;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저기요");
		System.out.println("--------------");
		System.out.println("메뉴를 고르세요");	
			while(true) {
			System.out.println("--------------");
			System.out.println("1.짜장면 2.짬뽕 3.우동");
			System.out.println(" > ");
			
			int food = sc.nextInt(); //메소드==함수, 명령어
			
			System.out.println("------------");
			System.out.println("당신의 선택은? " + food);
			 
			if (food ==1) {
				System.out.println("당신은 짜장면을 선택");
			} else if (food ==2) {
				System.out.println("당신은 짬뽕을 선택");
			} else if (food ==3){
				System.out.println("당신은 우동을 선택");
			} else {
				System.out.println("없는 메뉴입니다. 다시 선택하세요");
			} //else의 끝
		} //while의 끝
	} 

}