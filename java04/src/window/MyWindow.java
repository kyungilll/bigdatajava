package window;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MyWindow {
	public static void main(String[] args) {
		//new 로 적힌것은 모두 위로 올려줌
		//프레임
		FlowLayout flow = new FlowLayout();
		JTextField text = new JTextField(20);
		text.setFont(new Font("굴림", Font.PLAIN, 20));
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요.");
		label.setFont(new Font("굴림", Font.BOLD, 15));
		label.setForeground(Color.BLUE);
		JFrame f = new JFrame("입력값 받는 프로그램");
		JButton button = new JButton("나를 누르세요.");
		button.setBackground(Color.GRAY);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("굴림", Font.BOLD, 17));
		f.setSize(433, 328);
		//물 흐르듯이 배치
		f.getContentPane().setLayout(flow);
		//버튼
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼이 눌러졌군요.");
				//버튼을 눌렀을 때 콘솔에 프린트
				String data = text.getText(); // text에 입력된 값을 가져와서 넣어줌
				System.out.println("당신의 주요과목은 : "+data);
			}
		}); //더블클릭 했을 때의 인터페이스 (호출)
		
		//글자들
		f.getContentPane().add(label);
		f.getContentPane().add(text);
		
		//입력받는 화면 (크기 ~개 글자 까지)
		
		f.getContentPane().add(button);
		
		f.setVisible(true);
	}
}
