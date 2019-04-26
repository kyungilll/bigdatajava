package java09;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class 버튼백개 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		String[] movies = new String[5];
		JButton[] buttons = new JButton[100];
		
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼"+(i+1)+"번");
			JButton btnNewButton = new JButton(" ");
			f.add(btnNewButton); //프레임에 실제 버튼을 얹음
		}
		
		
		f.setSize(1000, 1000);
		f.setVisible(true);
		
		
	}

}
