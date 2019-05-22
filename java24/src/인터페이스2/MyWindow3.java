package 인터페이스2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow3        extends JFrame implements ActionListener{
JButton b1,b2;
	public MyWindow3() {
		setSize(300, 300);
		b1 = new JButton("버튼1");
		b2 = new JButton("버튼2");
		add(b1);
		add(b2);
		FlowLayout flow = new FlowLayout();
//		ActionProcess action = new ActionProcess(); 
		//아래 클래스
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
		System.out.println(e.getActionCommand());
		if(e.getSource()==b1) {
			System.out.println("b1클릭");
		} else if(e.getSource()==b2) {
			System.out.println("b2클릭");
		}
	}
}
