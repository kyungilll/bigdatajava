package java09;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.util.Random;

public class 버튼백개3 {

	public static void main(String[] args) {
		Random random = new Random();
		JFrame f = new JFrame();
		
		String[] movies = new String[5];
		JButton[] buttons = new JButton[200];
		
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼"+(i+1)+"번");
			
		}
		for (int i = 0; i < buttons.length; i++) {
			int x = random.nextInt(850);
			int y = random.nextInt(900);
			buttons[i].setBounds(x, y, 100, 50); // (위치 xy, 버튼크기)
			f.add(buttons[i]);
			
		}
		
	
		
		
		
		f.setLayout(null);
		f.setSize(1000, 1000);
		f.setVisible(true);
		
		
	}

}
