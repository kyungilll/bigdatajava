package window;
//사칙연산 계산기

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex2_1 {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField cal;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 두 번째 계산기");
		// 타이틀
		
		f.getContentPane().setBackground(new Color(255, 228, 196));
		f.setSize(423, 237);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		// 접근 연산자
		
		JLabel label = new JLabel("----나의 계산기----");
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
		n1.setColumns(20);
		
		JLabel label_1 = new JLabel("숫자2 >>>>");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("굴림체", Font.BOLD, 22));
		label_1.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_1);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림체", Font.BOLD, 22));
		n2.setColumns(20);
		n2.setBackground(Color.YELLOW);
		f.getContentPane().add(n2);
		
		JLabel label_2 = new JLabel("연산자 입력");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("굴림체", Font.BOLD, 22));
		label_2.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(label_2);
		
		cal = new JTextField();
		cal.setFont(new Font("굴림체", Font.BOLD, 22));
		cal.setColumns(5);
		cal.setBackground(new Color(32, 178, 170));
		f.getContentPane().add(cal);
		
		JButton button_2 = new JButton("실행");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				String cal1 = cal.getText();
				
				
				
						
				double data1 = Integer.parseInt(num1);
				double data2 = Integer.parseInt(num2);
				// 문자열 > 숫자로 바꿔줌 ★
				
				
				double result=0;
				if ("+".equals(cal1)) {
					result = data1+data2;
				} else if ("-".equals(cal1)) {
					result = data1-data2;
				} else if ("*".equals(cal1)) {
					result = data1*data2;
				} else if ("/".equals(cal1)) {
					result = data1/data2;
				} else {
					System.out.println("연산자를 다시 입력하세요 > +,-,*,/ ");
				
				}
				
				if (cal1.equals("+")||cal1.equals("-")||cal1.equals("*")||cal1.equals("/")){
				System.out.println("두 수의 연산 결과는 " + result + "입니다.");
				} else {
				}
				}
//				System.out.println(data1 + data2);
//				로 쓰는 코드는 좋지 않음 / 변수생성하는 것을 지향 > result
				
			}
		);
		button_2.setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().add(button_2);
		
		
		f.setVisible(true);

	}

}
