package 일기장;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class 로그인 {
static String id = "root";
static String pw = "1234";
private JTextField textField;
private JTextField textField_1;
	public 로그인() {
		JFrame f = new JFrame("일기장 로그인화면");
		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("diary.jpg");
		l.setIcon(icon);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.setSize(306, 497);
		f.getContentPane().add(l);
		
		JButton button = new JButton("<<<<로그인>>>>");
		
		JLabel label = new JLabel("");
		f.getContentPane().add(label);
		
		JLabel lblId = new JLabel("ID입력");
		f.getContentPane().add(lblId);
		
		textField = new JTextField();
		f.getContentPane().add(textField);
		textField.setColumns(20);
		
		
		JLabel lblPw = new JLabel("PW입력");
		f.getContentPane().add(lblPw);
		
		textField_1 = new JTextField();
		textField_1.setColumns(15);
		f.getContentPane().add(textField_1);
		f.getContentPane().add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id1 = textField.getText();
				String pw1 = textField_1.getText();
				
				if (id.equals(id1) && pw.equals(pw1)) {
				다이어리 dairy = new 다이어리();
				} else {
				JOptionPane.showMessageDialog(null, "로그인 정보가 일치하지 않습니다.");
				System.out.println(id1 + "   " + pw1);
				}
			}
		});
		
		
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		로그인 log = new 로그인();
	}
}
