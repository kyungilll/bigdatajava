package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		//. 은 접근연산자
		f.setTitle("나의 첫번재 그래픽 프로그램");
		JButton button = new JButton("나를 눌러주세요");
		//버튼생성, 버튼에 들어갈 내용
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("나를 눌렀군요");
			}
		});
		
		f.getContentPane().add(button);
		//프레임에 버튼을 얹음
		
		
		
		
		f.setVisible(true); 
		//프레임만 보이게 함 , 맨끝에 두어야 함
	}

}
