package java09;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2 {
	static int x = 0; //현재 위치값 / 전역변수
	
	public static void main(String[] args) {
		 
		JFrame f = new JFrame();
		String[] pic = {"s1.png","s2.png","s3.png","s4.png","s5.png","s6.png"};
		String[] ch = {"왼쪽으로","오른쪽으로"};
		int[] ch1 = {-1,1};
		JButton[] buttons = new JButton[2];
		JButton img = new JButton();
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(ch[i]);
			f.getContentPane().add(buttons[i]);
		}
		
		f.add(img);
		ImageIcon icon = new ImageIcon("s1.png");
		img.setIcon(icon);
		
//		-----------------------------------------------------
		
		buttons[0].addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(x<=0) {
					JOptionPane.showMessageDialog(null, "첫 번째 사진입니다.");
				} else {
				ImageIcon icon = new ImageIcon(pic[x-1]);
				x=x-1;
				img.setIcon(icon);
				}
			}
		});
//		------------------------------------------------------
		buttons[1].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(x>=6) {
					JOptionPane.showMessageDialog(null, "마지막 사진입니다.");
					
				}  else {
				ImageIcon icon = new ImageIcon(pic[x+1]);
				x=x+1;
				img.setIcon(icon);
				}
			}
		});
		
//		---------------------------------------------------
		f.setVisible(true);
		f.setSize(1000, 1000);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
	}

}
