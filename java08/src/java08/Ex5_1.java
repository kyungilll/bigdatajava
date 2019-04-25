package java01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex5_1 {

	public static void main(String[] args) {
		System.out.println("콘도 예약을 시작합니다.");
	Scanner sc = new Scanner(System.in);	
	String[] loc = {"강원도","전라도","파주","제주도","충청도"};
	int[]book = new int[5];
	while (true) {
		System.out.println();
		System.out.println("원하는 지역을 신청해주세요. (각 지역은 2명까지 신청 가능)");
		
		for (int i = 0; i < loc.length; i++) {
			System.out.print(" " + i + ")" + loc[i]);
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < book.length; i++) {
			System.out.print("   " + book[i] + "   ");
		}
		System.out.println();
		System.out.println();
		String xx = JOptionPane.showInputDialog("원하는 지역코드를 입력하세요. \n 1~" + loc.length + " 사이의 수를 입력하세요. \n 종료는 > 0");
		int x = Integer.parseInt(xx)-1;
		// 다이얼로그로 지역번호 입력받음
		if (x>=0 && x<=loc.length-1) {
			if(book[x]<=1) {
			book[x]++;
			} else {
				JOptionPane.showMessageDialog(null, "인원초과로 신청할 수 없습니다.");
			}
		} else if (x==-1) {
			JOptionPane.showMessageDialog(null, "예약시스템을 종료합니다.");
			break;
		} else {
			JOptionPane.showMessageDialog(null,"1~" + loc.length + " 사이의 수로 다시 입력하세요.");
		}
		for (int i = 0; i < book.length; i++) {
			System.out.print("   " + book[i] + "   ");
		}
	}
	}
}
