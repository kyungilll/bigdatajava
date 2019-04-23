package test;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CarInfo {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;

	public static void main(String[] args) {

		JFrame f = new JFrame("판매정보입력");
		
		f.setSize(220, 1000);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JLabel lblNewLabel = new JLabel("브랜드");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(lblNewLabel);
		
		JTextField textField = new JTextField();
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 20));
		textField.setBackground(Color.YELLOW);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		String brand = textField.getText();
		
		JLabel label = new JLabel("차종");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_1);
		
		String type = textField_1.getText();
		
		JLabel label_1 = new JLabel("가격");
		label_1.setFont(new Font("굴림", Font.BOLD, 20));
		label_1.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("굴림", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_2);

		String price = textField_2.getText();
		
		JLabel label_2 = new JLabel("키로수");
		label_2.setFont(new Font("굴림", Font.BOLD, 20));
		label_2.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("굴림", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_3);
		
		String dist = textField_3.getText();
		
		JLabel label_3 = new JLabel("연식");
		label_3.setFont(new Font("굴림", Font.BOLD, 20));
		label_3.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("굴림", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_4);
		
		String year = textField_4.getText();
		
		JLabel label_4 = new JLabel("지역");
		label_4.setFont(new Font("굴림", Font.BOLD, 20));
		label_4.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("굴림", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_5);
		
		String location = textField_5.getText();
		
		
		JLabel label_5 = new JLabel("색상");
		label_5.setFont(new Font("굴림", Font.BOLD, 20));
		label_5.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("굴림", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_6);
		
		String color = textField_6.getText();
		
		JLabel label_6 = new JLabel("연료");
		label_6.setFont(new Font("굴림", Font.BOLD, 20));
		label_6.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("굴림", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_7);
		
		String fuel = textField_7.getText();
		
		JLabel label_7 = new JLabel("변속기");
		label_7.setFont(new Font("굴림", Font.BOLD, 20));
		label_7.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("굴림", Font.BOLD, 20));
		textField_8.setColumns(10);
		textField_8.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_8);
		
		String trm = textField_8.getText();
		
		JLabel label_8 = new JLabel("옵션");
		label_8.setFont(new Font("굴림", Font.BOLD, 20));
		label_8.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("굴림", Font.BOLD, 20));
		textField_9.setColumns(10);
		textField_9.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_9);
		
		String opt = textField_9.getText();
		
		JLabel label_9 = new JLabel("보증");
		label_9.setFont(new Font("굴림", Font.BOLD, 20));
		label_9.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("굴림", Font.BOLD, 20));
		textField_10.setColumns(10);
		textField_10.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_10);
		
		String gur = textField_10.getText();
		
		JLabel label_10 = new JLabel("차량번호");
		label_10.setFont(new Font("굴림", Font.BOLD, 20));
		label_10.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("굴림", Font.BOLD, 20));
		textField_11.setColumns(10);
		textField_11.setBackground(Color.YELLOW);
		f.getContentPane().add(textField_11);
		
		String num = textField_11.getText();
		
		JButton btnNewButton = new JButton("등록");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//등록 버튼을 눌렀을 때 데이터베이스로 저장될 예정
				
				
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
		
		
		
	}

}
