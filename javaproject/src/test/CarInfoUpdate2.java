package test;

import javax.swing.JOptionPane;

public class CarInfoUpdate2 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("ID 입력");
		String chtable = JOptionPane.showInputDialog("변경할 항목 입력");
		String change= JOptionPane.showInputDialog("변경될 내용 입력");
		
		CarInfoDAO2 db = new CarInfoDAO2();
		
		try {
			db.update(id, chtable, change);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
