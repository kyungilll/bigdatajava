package control;

import javax.swing.JOptionPane;

public class Ex5_1 {

	public static void main(String[] args) {
		String pr = JOptionPane.showInputDialog("오늘 치킨의 가격은 얼마인가요?");
		int pr1 = Integer.parseInt(pr);
		
		if (pr1>=9000) {
			System.out.println("내일 다시 전화할게요.");
		} else {
			System.out.println("주문할게요.");
		}
	}

}
