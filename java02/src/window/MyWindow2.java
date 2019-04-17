package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	JFrame f = new JFrame();
	f.setSize(300, 300);

	JButton button = new JButton("자바프로젝트");
	button.addActionListener(new ActionListener() {
		// MyWindow2.java 우클릭 > open with > window... > design
		public void actionPerformed(ActionEvent e) {
			System.out.println("다음주부터 자바프로젝트가 시작됩니다.");
		}
	});
	
	f.getContentPane().add(button);
	
	f.setVisible(true);
	
	}

}
