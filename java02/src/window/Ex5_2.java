package control;

import javax.swing.JOptionPane;

public class Ex5_2 {

	public static void main(String[] args) {
		String me = JOptionPane.showInputDialog(null, "나의 나이를 입력하세요.");
		String br = JOptionPane.showInputDialog(null, "동생의 나이를 입력하세요.");
		int me1 = Integer.parseInt(me);
		int br1 = Integer.parseInt(br);
		
		if (me1 >= br1) {
			System.out.println("내가 떡 2개를 먹어요");
		} else {
			System.out.println("동생이 떡 2개를 먹어요");
		}
	}

}
