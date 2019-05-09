package java17;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	
	public MyWindow() {
		setTitle("나는 윈도우 프레임");
		
		MyPanel p = new MyPanel(); 
		add(p);
		
		setVisible(true);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		MyWindow name = new MyWindow();
	}
	
	}

