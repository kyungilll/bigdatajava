package window;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex1_1 {

	public static void main(String[] args) {
		FlowLayout flow = new FlowLayout();
		JFrame f = new JFrame("입력받는 프로그램");
		JLabel label = new JLabel("당신이 주로 사용하는 언어를 입력하세요");
		JLabel label2 = new JLabel("당신이 주로 사용하는 개발 툴을 입력하세요");
		label2.setFont(new Font("굴림", Font.BOLD, 15));
		JTextField text = new JTextField(20);
		JTextField text2 = new JTextField(20);
		JButton button = new JButton("언어 입력");
		button.setFont(new Font("굴림", Font.PLAIN, 15));
		label.setFont(new Font("굴림", Font.BOLD, 14));
		label.setBackground(Color.PINK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data = text.getText(); // text에 입력된 값을 가져와서 넣어줌
				String data2 = text2.getText(); // text에 입력된 값을 가져와서 넣어줌
				System.out.println("당신이 주로 사용하는 언어는 : "+data);
			}
		});
		
		f.setSize(327, 348);
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(label);

		f.getContentPane().add(text);
		f.getContentPane().add(label2);
		f.getContentPane().add(text2);
		f.getContentPane().add(button);
		
		JButton button2 = new JButton("툴 입력");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data2 = text2.getText(); // text에 입력된 값을 가져와서 넣어줌
				System.out.println("당신이 주로 사용하는 툴은 : "+data2);
			}
		});
		button2.setFont(new Font("굴림", Font.PLAIN, 15));
		button2.setToolTipText("");
		f.getContentPane().add(button2);
		f.setVisible(true);
	}

}
