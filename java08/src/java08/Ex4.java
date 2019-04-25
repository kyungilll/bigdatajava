package java08;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println("--------------콘도 예약을 진행합니다.--------------");
		
		Scanner sc = new Scanner(System.in);
		
		int n = 5; //신청하는 사람, 혹은 횟수지정
		String[] loc = {"강원도","전라도","파주","제주도","충청도"};
		int[] count = new int[loc.length];
		while (true) {
			System.out.println("원하는 지역을 신청해주세요. (각 지역은 2명까지 신청가능)");
			System.out.println("---------------------------------------------");
			for (int i = 0; i < loc.length; i++) {
				System.out.print((i+1) + ">" + loc[i] + " ");
			}
			System.out.println();
			System.out.println("---------------------------------------------");
			for (int i = 0; i < count.length; i++) {
				System.out.print(count[i] + "       ");
			} // 선택된 횟수 초기값 출력
			System.out.println();
			System.out.println("원하는 지역코드를 입력하세요. (종료는 0) >>>");
			int choice = sc.nextInt()-1;
			if (choice>=0 && choice<=4) {
				
					if (count[choice]<2) {
					count[choice] = count[choice]+1;
					} else {
						System.out.println("인원이 초과되어 신청이 불가합니다.");
					}
			 }else if (choice==-1) {
				 System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("1~" + loc.length + " 사이의 수로 다시 입력하세요.");
			}
		}
	}
}
