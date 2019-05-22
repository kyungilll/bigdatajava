package 인터페이스;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow3 extends JFrame implements ActionListener{
	JButton b1, b2; //전역변수로 선언
	public MyWindow3() {
		setSize(300, 300);
		b1 = new JButton("나를 눌러요");
		b2 = new JButton("나도 눌러요");
		add(b1);
		add(b2);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		MyWindow3 name = new MyWindow3();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getSource()); // 누구에 의해서 호출되었는지
		if(e.getSource()==b1) {
			System.out.println("나를 누르셨군요");
		} else if(e.getSource()==b2) {
			System.out.println("나도 눌러요를 누르셨군요");
		}
	}
}
