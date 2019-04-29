package 부품만들기;

import javax.swing.JFrame;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class 메뉴 {
	private static JTextField textField;
	private static JTextField textField_1;
	static int x=0;
	static int[] x1= new int[3];
	static int[] p= {6000,5000,6000};
	private static JTextField textField_2;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		String[] menu = {"m0.jpg","m1.jpg","m2.jpg"};
		f.setSize(600	, 500);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(null);
		
		메뉴부품 cal = new 메뉴부품();
		
		
		JButton b1 = new JButton("짬뽕 6000원");
		f.getContentPane().add(b1);
		
		b1.setBounds(100, 10, 108, 30);
		
		JButton b2 = new JButton("짜장 5000원");
		f.getContentPane().add(b2);
		
		b2.setBounds(221, 10, 108, 30);
		
		JButton b3 = new JButton("우동 6000원");
		f.getContentPane().add(b3);
		
		b3.setBounds(336, 10, 108, 30);
		
		JLabel label = new JLabel("개수");
		f.getContentPane().add(label);
		
		label.setBounds(100, 50, 30, 30);
		
		textField = new JTextField();
		f.getContentPane().add(textField);
		textField.setColumns(5);
		
		textField.setBounds(128, 50, 50, 30);
		
		JLabel label_1 = new JLabel("금액");
		f.getContentPane().add(label_1);
		
		label_1.setBounds(190, 50, 30, 30);
		
		textField_1 = new JTextField();
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_1.setBounds(221, 50, 80, 30);
		
		JButton img = new JButton();
		img.setBounds(100, 100, 400, 300);
		f.getContentPane().add(img);
		
		ImageIcon icon = new ImageIcon("m.jpg");
		img.setIcon(icon);
		
		textField_2 = new JTextField();
		textField_2.setBounds(313, 50, 168, 30);
		f.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(menu[0]);
				img.setIcon(icon);
				x=x+1;
				x1[0] = x1[0]+1;
				textField.setText(String.valueOf(x));
				textField_1.setText(String.valueOf(x*p[0]));
				textField_2.setText("짬뽕" + String.valueOf(x1[0] + "개 / 짜장" + String.valueOf(x1[1] + "개 / 우동" + String.valueOf(x1[2] + "개"))));
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(menu[1]);
				img.setIcon(icon);
				
				x=x+1;
				x1[1] = x1[1]+1;
				textField.setText(String.valueOf(x));
				textField_1.setText(String.valueOf(x*p[1]));
				textField_2.setText("짬뽕" + String.valueOf(x1[0] + "개 / 짜장" + String.valueOf(x1[1] + "개 / 우동" + String.valueOf(x1[2] + "개"))));

			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(menu[2]);
				img.setIcon(icon);
				x=x+1;
				x1[2] = x1[2]+1;
				textField.setText(String.valueOf(x));
				textField_1.setText(String.valueOf(x*p[2]));
				textField_2.setText("짬뽕" + String.valueOf(x1[0] + "개 / 짜장" + String.valueOf(x1[1] + "개 / 우동" + String.valueOf(x1[2] + "개"))));

			}
		});
		
		
		f.setVisible(true);
	}
}
