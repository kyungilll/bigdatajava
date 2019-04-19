package window;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		String grade = null;
		

		String x = JOptionPane.showInputDialog("등급를 입력하세요.");
		System.out.println(x);
		
		char y = x.charAt(0);
		
		if (y=='A') {
			JOptionPane.showMessageDialog(null, "최우수입니다.");
		} else if (y=='B') {
			JOptionPane.showMessageDialog(null, "우수입니다.");
		} else if (y=='C') {
			JOptionPane.showMessageDialog(null, "보통입니다.");
		} else {
			JOptionPane.showMessageDialog(null, "불합격입니다.");
		} 
	}
}


