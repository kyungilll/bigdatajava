package cal;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은? >");
		String name = sc.next();
		
		System.out.print("당신의 나이는? >");
		String age = sc.next();
		// 계산이 필요할 경우  next 대신  nextInt > string으로 받아와서 int 로 바꿔줌
		// int age = sc.nextint();
		
		System.out.print("당신의 태어난 연도는? >");
		int year = sc.nextInt();
		int age2 = 2019 - year +1;
		
		System.out.print("당신의 관심과목은? >");
		String sub = sc.next();
		
		System.out.println(name+"님은"+age+"살 이고 "+sub+"에 관심이 있습니다.");
		System.out.println("정확한 나이는 " + age2 + "입니다.");
		
		}

}
