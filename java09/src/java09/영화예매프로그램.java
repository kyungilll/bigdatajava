package java09;

import java.util.Scanner;

public class 영화예매프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 3; //행
		int y = 10; //열
		int[][] seat = new int[x][y];
		
		while(true) {
		System.out.println("-------------------");
		for (int i = 0; i < y-1; i++) {
			System.out.print((i+1) + " ");
		}
		System.out.println();
		System.out.println("-------------------");
		
		// 1~9 번 자리 출력
		
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		// 예약상태 출력 > 0,1
		
		System.out.print("예메 1번, 종료 0번 > ");
		int data = sc.nextInt();
		
		if (data==0) {
			break;
		} else if (data==1){
		} else {
			System.out.println("0, 1 로 다시 입력하세요.");
			System.out.println();
			continue;
		}
		// 1, 0, 다른 숫자를 선택했을 경우를 나눔
		// 1> 진행, 0> 종료, 기타> 다시 입력
		
		System.out.print("예매할 좌석 행 번호: >>>"); 
		int raw = sc.nextInt();
		if (raw<=0 || raw>=x) {
			System.out.print("예매할 좌석 열 번호: >>>"); 
			int col = sc.nextInt();
			if (col <=0 || col>y) { //없는 열 번호일 경우
				System.out.println("없는 좌석입니다.");
			} else {
				if (seat[raw-1][col-1] == 0) {
					seat[raw-1][col-1] =1;
					System.out.println("★");
					System.out.println(raw + "행 " + col + "열 예약완료");
				} else {
					System.out.println("이미 예매된 자리입니다. 다시 선택하세요.");
				}
			}
		}else { //없는 행 번호일 경우
			System.out.println("없는 좌석입니다."); 
		}
		}
	}

}
