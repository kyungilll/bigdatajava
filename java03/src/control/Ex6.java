package control;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		String sp = JOptionPane.showInputDialog("속도점수를 입력하시오");
		String sf = JOptionPane.showInputDialog("안정성점수를 입력하시오");
		String ga = JOptionPane.showInputDialog("연비점수를 입력하시오");
		
		int sp1 = Integer.parseInt(sp);
		int sf1 = Integer.parseInt(sf);
		int ga1 = Integer.parseInt(ga);
		
		double sp0 = sp1*0.5;
		double sf0 = sf1*0.3;
		double ga0 = ga1*0.2;
		
		double result = sp0+sf0+ga0;
		
		if (result >=80) {
			System.out.println(result + "점 우수");
			
			if (sp1>=80 && sf1>=80 && ga1 >=80) {
				System.out.println("베스트");
			}else {
			}
		} else if (result >=70) {
			System.out.println(result + "점 보통");
		} else {
			System.out.println(result + "점 불량");
		}
	}
}
