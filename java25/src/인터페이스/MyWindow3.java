package 인터페이스;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow3 extends JFrame {
	JButton b, b2; // 전역변수로 선언

	public MyWindow3() {
		setSize(300, 300);
		b = new JButton("나를 눌러요");
		b2 = new JButton("나도 눌러요");
		add(b);
		add(b2);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		ActionListener action = new ActionListener() { 
			// 인터페이스로는 객체생성불가
			// 익명클래스를 만듦
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀군요");
			}
		};
		b.addActionListener(action);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("두번째 버튼을 누르다.");
			}
		});
		setVisible(true);

	}

	public static void main(String[] args) {
		MyWindow3 name = new MyWindow3();

	}

}
