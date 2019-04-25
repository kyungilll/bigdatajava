package java08;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수강 신청을 진행합니다.");
		String[] sub = {"자바","스프링","안드로이드","파이썬","제이쿼리"};
		int[] x = new int[5];
		while(true) {
			System.out.println("원하는 과목을 신청해주세요.");
			System.out.println("---------------------------------------");
			for (int i = 0; i < sub.length; i++) {
				System.out.print(i+1 + sub[i] + " ");
			}
			System.out.println();
			System.out.println("---------------------------------------");
			for (int i = 0; i < x.length; i++) {
				System.out.print(x[i] + "       ");
			}
			System.out.println();
			System.out.println("=======================================");
			System.out.print("원하는 과목코드를 입력해주세요. (종료 0) > ");
			int a = sc.nextInt()-1;
			
			if(a>=0 && a<sub.length) {
				if (x[a]==0) {
					System.out.println("정상 신청되었습니다.");
					x[a]=1;
				} else {
					System.out.println("이미 신청된 과목입니다.");
					System.out.println("다른코드를 입력하세요.");
				}
			} else if(a==-1){
				System.out.println("수강신청을 종료합니다.");
				break;
				}else {
				System.out.println("1~" + sub.length + "까지 숫자로 다시 입력하세요.");
			}
		}
	}

}
