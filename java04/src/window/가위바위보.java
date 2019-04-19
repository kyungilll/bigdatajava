package window;

import java.util.Random;

import javax.swing.JOptionPane;

public class 가위바위보 {

	public static void main(String[] args) {

		Random ran = new Random();
		int x = ran.nextInt(3);
		
		String me = JOptionPane.showInputDialog("숫자를 입력하세요.");
		int me1 = Integer.parseInt(me) % 3;
		
		switch (me1) { 
		case 0:
			switch (x) {
			case 0:
				JOptionPane.showMessageDialog(null, "가위를 냈습니다.");
				JOptionPane.showMessageDialog(null, "비겼습니다.");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "가위를 냈습니다.");
				JOptionPane.showMessageDialog(null, "졌습니다.");
				break;

			default:
				JOptionPane.showMessageDialog(null, "가위를 냈습니다.");
				JOptionPane.showMessageDialog(null, "이겼습니다.");
				break;
			}
			break;
			
		case 1:
			switch (x) {
			case 0:
				JOptionPane.showMessageDialog(null, "바위를 냈습니다.");
				JOptionPane.showMessageDialog(null, "이겼습니다.");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "바위를 냈습니다.");
				JOptionPane.showMessageDialog(null, "비겼습니다.");
				break;

			default:
				JOptionPane.showMessageDialog(null, "바위를 냈습니다.");
				JOptionPane.showMessageDialog(null, "졌습니다.");
				break;
			}
			break;
		default:
			switch (x) {
			case 0:
				JOptionPane.showMessageDialog(null, "보를 냈습니다.");
				JOptionPane.showMessageDialog(null, "졌습니다.");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "바위를 냈습니다.");
				JOptionPane.showMessageDialog(null, "이겼습니다.");
				break;

			default:
				JOptionPane.showMessageDialog(null, "바위를 냈습니다.");
				JOptionPane.showMessageDialog(null, "이겼습니다.");
				break;
			}
			break;
		}
		
		
		
//		String y = JOptionPane.showInputDialog("입력하세요.");
//		int y1 = Integer.parseInt(y);
		
		
		
	}

}
