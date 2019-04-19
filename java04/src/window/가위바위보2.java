package window;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 가위바위보2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int x = ran.nextInt(3);
		
		//★★★★★★★★★
		
		
		FlowLayout flow = new FlowLayout();
		
		JFrame f = new JFrame("입력값 받는 프로그램");
		
		f.getContentPane().setLayout(flow);
		
		JLabel label = new JLabel("결과창");
		
		
		JButton b1 = new JButton("가위");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				label.setText("");
			}
		});
		b1.setBackground(new Color(47, 79, 79));
		b1.setForeground(new Color(244, 164, 96));
		b1.setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("바위");
		b2.setForeground(new Color(244, 164, 96));
		b2.setFont(new Font("굴림", Font.BOLD, 16));
		b2.setBackground(new Color(47, 79, 79));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("보");
		b3.setForeground(new Color(244, 164, 96));
		b3.setFont(new Font("굴림", Font.BOLD, 16));
		b3.setBackground(new Color(47, 79, 79));
		f.getContentPane().add(b3);
		
		JButton go = new JButton("---실행---");
		go.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(go);
		
		label.setFont(new Font("굴림", Font.BOLD, 32));
		f.getContentPane().add(label);
		f.setSize(282, 236);
		f.setVisible(true);

	}

}
