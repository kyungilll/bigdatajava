package control;

import javax.swing.JOptionPane;

public class Ex5_0 {

	public static void main(String[] args) {
		
		
		String good = JOptionPane.showInputDialog("먹고싶은 음식은?");
		String bad = JOptionPane.showInputDialog("먹기싫은 음식은?");
		
		System.out.println("먹고싶은 음식은 " +  good);
		System.out.println("먹기싫은 음식은 " +  bad);
		
	}

}
