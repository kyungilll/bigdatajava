package 반복문;

import javax.swing.JOptionPane;

public class WhileTest4 {

	public static void main(String[] args) {
		
		//두 개의 입력값을 받아서;
		//첫 번째 값부터 두 번째 값까지 더함.
		
		
		String num1=JOptionPane.showInputDialog("숫자1입력");
		int num11=Integer.parseInt(num1);
		
		String num2=JOptionPane.showInputDialog("숫자2입력");
		int num22=Integer.parseInt(num2);
		
		int sum = 0;
		//초기값
		
		while (num11 <= num22) { //조건식
			sum = sum + num11; // 더하는 식
			num11++;//증감식
		}

		System.out.println(sum);
	}

}
