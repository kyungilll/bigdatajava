package 반복문;

import javax.swing.JOptionPane;

public class WhileTest5 {

	public static void main(String[] args) {
		
		//두 개의 입력값을 받아서;
		//첫 번째 값부터 두 번째 값까지 곱함
		
		
		String num1=JOptionPane.showInputDialog("숫자1번입력");
		int num11=Integer.parseInt(num1);
		
		String num2=JOptionPane.showInputDialog("숫자2번입력");
		int num22=Integer.parseInt(num2);
		
		double mul = 1; // Alt + Shift + R 변수명 한꺼번에 변경
		//초기값
		//★
		while (num11 <= num22) { //조건식
			mul = mul * num11; // 곱하는 식
			num11++;//증감식
		}

		System.out.println(mul);
	
	}

}
