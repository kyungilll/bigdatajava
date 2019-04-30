package 자바생성자;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

public class 쇼핑몰 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Member[] m = new Member[3];
	
	System.out.println("쇼핑몰가입할 정보를 입력해주세요.");
	System.out.println("==========================");
	System.out.println("이름    나이    연락처   주소    ");
	System.out.println("==========================");
	
	for (int i = 0; i < m.length; i++) {
		m[i].name = JOptionPane.showInputDialog("이름을 입력하시오");
		String x = JOptionPane.showInputDialog("나이을 입력하시오");
		m[i].age = Integer.parseInt(x);
		
		m[i].tel = JOptionPane.showInputDialog("연락처를 입력하시오");
		m[i].addr = JOptionPane.showInputDialog("주소를 입력하시오");
		
	}
	for (int j = 0; j < m.length; j++) {
		System.out.println(m[j]);
	}
	
	
}
}
