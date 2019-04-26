package java09;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class 버튼백개2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		String[] movies = new String[5];
		JButton[] buttons = new JButton[200];
		
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼"+(i+1)+"번");
			
		}
		buttons[0].setBounds(50, 50, 150, 100); 
		f.add(buttons[0]);
		buttons[1].setBounds(200, 50, 150, 100); 
		f.add(buttons[1]);
		buttons[2].setBounds(350, 50, 150, 100); 
		f.add(buttons[2]);
		buttons[3].setBounds(500, 50, 150, 100); 
		f.add(buttons[3]);
		buttons[4].setBounds(500, 50, 150, 100); 
		f.add(buttons[4]);
		buttons[5].setBounds(650, 50, 150, 100); 
		f.add(buttons[5]);
		//위치, 크기 지정
		
		
		
		f.setLayout(null);
		f.setSize(1000, 1000);
		f.setVisible(true);
		
		
	}

}
