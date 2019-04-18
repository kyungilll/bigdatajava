package control;

import javax.swing.JOptionPane;

public class 다이얼로그테스트 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "내가 다이얼로그예요");
		//출력용 다이얼로그
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		//입력용 다이얼로그
		System.out.println("당신의 이름은 : " + name);
		String age = JOptionPane.showInputDialog("당신의 나이을 입력하세요.");
		int data = Integer.parseInt(age); // 스트링으로 받은  age를 숫자로 바꿔줌
		JOptionPane.showConfirmDialog(null, "내년 내 나이는" + (data+1) + "입니다.");
	}

}
