package java01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex5_1 {

	public static void main(String[] args) {
		System.out.println("�ܵ� ������ �����մϴ�.");
	Scanner sc = new Scanner(System.in);	
	String[] loc = {"������","����","����","���ֵ�","��û��"};
	int[]book = new int[5];
	while (true) {
		System.out.println();
		System.out.println("���ϴ� ������ ��û���ּ���. (�� ������ 2����� ��û ����)");
		
		for (int i = 0; i < loc.length; i++) {
			System.out.print(" " + i + ")" + loc[i]);
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < book.length; i++) {
			System.out.print("   " + book[i] + "   ");
		}
		System.out.println();
		System.out.println();
		String xx = JOptionPane.showInputDialog("���ϴ� �����ڵ带 �Է��ϼ���. \n 1~" + loc.length + " ������ ���� �Է��ϼ���. \n ����� > 0");
		int x = Integer.parseInt(xx)-1;
		// ���̾�α׷� ������ȣ �Է¹���
		if (x>=0 && x<=loc.length-1) {
			if(book[x]<=1) {
			book[x]++;
			} else {
				JOptionPane.showMessageDialog(null, "�ο��ʰ��� ��û�� �� �����ϴ�.");
			}
		} else if (x==-1) {
			JOptionPane.showMessageDialog(null, "����ý����� �����մϴ�.");
			break;
		} else {
			JOptionPane.showMessageDialog(null,"1~" + loc.length + " ������ ���� �ٽ� �Է��ϼ���.");
		}
		for (int i = 0; i < book.length; i++) {
			System.out.print("   " + book[i] + "   ");
		}
	}
	}
}
