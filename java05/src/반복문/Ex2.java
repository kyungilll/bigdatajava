package 반복문;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		
		String x = JOptionPane.showInputDialog("숫자입력");
		int i = Integer.parseInt(x);
		for (int j = 1; j<=i ; j++) {
			System.out.print("★");
		}
	}

}
