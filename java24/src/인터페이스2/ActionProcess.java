package 인터페이스2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionProcess implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼1");
	}

}
