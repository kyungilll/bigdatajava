package 일기장;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 다이어리 {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public 다이어리() {
		JFrame f = new JFrame("일기장 작성화면");
		f.getContentPane().setBackground(Color.GREEN);
		JLabel l = new JLabel("<<<<<일기작성날짜>>>>>");
		
		f.getContentPane().add(l);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		textField = new JTextField();
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("<<<<<일기작성제목>>>>>");
		f.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("<<<<<일기작성내용>>>>>");
		f.getContentPane().add(label);
		
		textField_2 = new JTextField();
		f.getContentPane().add(textField_2);
		textField_2.setColumns(30);
		
		
		JButton btnNewButton = new JButton("저장하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = textField.getText();
				String title = textField_1.getText();
				String dairy = textField_2.getText();
				
				try {
					FileWriter w = new FileWriter(date + ".txt");
					w.write(date+"\n");
					w.write(title+"\n");
					w.write(dairy+"\n");
					w.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
//				FileWriter file;
//				try {
//					file = new FileWriter(date+".txt");
//					file.write(date+"\n");
//					file.write(title+"\n");
//					file.write(dairy+"\n");
//					file.close();
//				} catch (IOException e1) {
//                    e1.printStackTrace();
//                }
				
			}
		});
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("읽어오기");
		f.getContentPane().add(btnNewButton_1);
		
		f.setSize(400, 494);
		f.setVisible(true);
	}

}
