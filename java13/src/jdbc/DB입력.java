package jdbc;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DB입력 {
public static void main(String[] args) {
	
	String id = JOptionPane.showInputDialog("ID입력");
	String pw = JOptionPane.showInputDialog("PW입력");
	String name = JOptionPane.showInputDialog("이름입력");
	String tel = JOptionPane.showInputDialog("번호입력");
	
	Db처리 db = new Db처리();
	
	try {
		db.insert(id, pw, name, tel);
	} catch (Exception e) {
		e.printStackTrace(); //에러정보출력
	} 
}
}
