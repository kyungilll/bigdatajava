package cal;

import java.util.Scanner;

public class 입력테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 > ");
		// scanner (파일, 콘솔에서 입력된 값을 읽어옴)
		// 입력된 데이터를 입력창으로 가져다 주는 역할
		String name = sc.next(); // 대입연산자
		System.out.println("당신이 입력한 데이터는 " + name+"입니다.");
		
	}

}
