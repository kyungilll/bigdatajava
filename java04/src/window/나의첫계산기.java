package window;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기 {
	private static JTextField n1;
	private static JTextField n2;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setBackground(new Color(255, 228, 196));
		
		f.setSize(289, 397);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("나의 계산기");
		label.setFont(new Font("굴림", Font.PLAIN, 48));
		f.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("숫자1 >>>>");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("굴림체", Font.BOLD, 22));
		f.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setBackground(Color.YELLOW);
		n1.setFont(new Font("굴림체", Font.BOLD, 22));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label_1 = new JLabel("숫자2 >>>>");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("굴림체", Font.BOLD, 22));
		label_1.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_1);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림체", Font.BOLD, 22));
		n2.setColumns(10);
		n2.setBackground(Color.YELLOW);
		f.getContentPane().add(n2);
		
		JButton b = new JButton("두 수를 계산");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int data1 = Integer.parseInt(num1);
				int data2 = Integer.parseInt(num2);
				// 문자열 > 숫자로 바꿔줌 ★
				
				System.out.println(data1 + data2);
			}
		});
		b.setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().add(b);
		
		
		f.setVisible(true);
		
		// TODO Auto-generated method stub

	}

}
