package test;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {

			JFrame f = new JFrame("sign in");
			
			f.setSize(283, 155);
			f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JTextField text = new JTextField();
			
			JLabel lblId = new JLabel("ID  ");
			f.getContentPane().add(lblId);
			
			textField = new JTextField();
			f.getContentPane().add(textField);
			textField.setColumns(20);
			
			String ID = textField.getText();
			
			JLabel lblPw = new JLabel("PW");
			f.getContentPane().add(lblPw);
			
			textField_1 = new JTextField();
			textField_1.setColumns(20);
			f.getContentPane().add(textField_1);
			
			String PW = textField_1.getText();
			
			JButton btnSignIn = new JButton("sign in");
			btnSignIn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// 입력된 ID,PW  일치할 경우 로그인 
					// 틀리면 다시입력하시오, 삭제
				}
			});
			f.getContentPane().add(btnSignIn);
			
			JButton btnSignUp = new JButton("sign up");
			f.getContentPane().add(btnSignUp);
			
			JButton btnIdpwSerch = new JButton("ID&PW serch");
			f.getContentPane().add(btnIdpwSerch);
			f.setVisible(true);
			
	}

}
