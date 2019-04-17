package cal;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 취미는? > ");
		String hob = sc.next();
		
		System.out.print("평소  TV시청시간은? > ");
		String tv = sc.next();
		
		System.out.print("봄 여행을 다녀왔나요? > ");
		boolean trev = sc.nextBoolean();
		
		System.out.println("내 취미는 "+ hob + "이고 평소에 TV를 " + tv + "시간도 보지 않아요.");
		System.out.println("봄 여행은" + trev + "예요.");
		
		
	}

}
