package java15;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsMain {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public BbsMain() {
		JFrame f = new JFrame("나의 게시판 만들기");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(12, 10, 102, 54);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("굴림", Font.BOLD, 30));
		textField.setBounds(130, 7, 242, 62);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
		textField_1.setBackground(Color.WHITE);
		textField_1.setFont(new Font("굴림", Font.BOLD, 30));
		textField_1.setColumns(10);
		textField_1.setBounds(130, 79, 242, 62);
		f.getContentPane().add(textField_1);
		
		JLabel label = new JLabel("제목");
		label.setFont(new Font("굴림", Font.BOLD, 30));
		label.setBounds(12, 82, 102, 54);
		f.getContentPane().add(label);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.RED);
		textField_2.setBackground(Color.WHITE);
		textField_2.setFont(new Font("굴림", Font.BOLD, 30));
		textField_2.setColumns(10);
		textField_2.setBounds(130, 151, 242, 62);
		f.getContentPane().add(textField_2);
		
		JLabel label_1 = new JLabel("내용");
		label_1.setFont(new Font("굴림", Font.BOLD, 30));
		label_1.setBounds(12, 154, 102, 54);
		f.getContentPane().add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.RED);
		textField_3.setBackground(Color.WHITE);
		textField_3.setFont(new Font("굴림", Font.BOLD, 30));
		textField_3.setColumns(10);
		textField_3.setBounds(130, 223, 242, 62);
		f.getContentPane().add(textField_3);
		
		JLabel label_2 = new JLabel("기타");
		label_2.setFont(new Font("굴림", Font.BOLD, 30));
		label_2.setBounds(12, 226, 102, 54);
		f.getContentPane().add(label_2);
		
		JButton btnNewButton = new JButton("BBS 검색하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDAO dao = new BbsDAO();
				String inputid = textField.getText();
				BbsDTO dto =dao.select(inputid);
				
				String id = dto.getId();
				String title = dto.getTitle();
				String content = dto.getContent();
				String etc = dto.getEtc();
				
				textField.setText(id);
				textField_1.setText(title);
				textField_2.setText(content);
				textField_3.setText(etc);
				
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(64, 310, 242, 59);
		f.getContentPane().add(btnNewButton);
		
		JButton btnBbs = new JButton("BBS 생성하기");
		btnBbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDAO dao = new BbsDAO();
				String id = textField.getText();
				String title = textField_1.getText();
				String content = textField_2.getText();
				String etc = textField_3.getText();
				
				try {
					dao.insert(id, title, content, etc);
				} catch (Exception e1) {
					System.out.println("에러발생");
					e1.printStackTrace();
				}
				
			}
		});
		btnBbs.setFont(new Font("굴림", Font.BOLD, 30));
		btnBbs.setBounds(64, 379, 242, 59);
		f.getContentPane().add(btnBbs);
		
		JButton btnBbs_1 = new JButton("BBS 수정하기");
		btnBbs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDAO dao = new BbsDAO();
				String id = textField.getText();
				String title = textField_1.getText();
				String content = textField_2.getText();
				String etc = textField_3.getText();
				
				try {
					dao.update(id, title, content, etc);
				} catch (Exception e2) {
					System.out.println("에러발생");
				}
			}
		});
		btnBbs_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnBbs_1.setBounds(64, 448, 242, 59);
		f.getContentPane().add(btnBbs_1);
		
		JButton btnBbs_2 = new JButton("BBS 삭제하기");
		btnBbs_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDAO dao = new BbsDAO();
				String id = textField.getText();
				try {
					dao.delete(id);
				} catch (Exception e2) {
					System.out.println("오류발생");
				}
			}
		});
		btnBbs_2.setFont(new Font("굴림", Font.BOLD, 30));
		btnBbs_2.setBounds(64, 517, 242, 59);
		f.getContentPane().add(btnBbs_2);
		f.setVisible(true);
		f.setSize(400, 636);
		
	}
	public static void main(String[] args) {
		BbsMain name = new BbsMain();
	}
}
