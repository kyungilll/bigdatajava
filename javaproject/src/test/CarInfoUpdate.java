package test;

import javax.swing.JOptionPane;

public class CarInfoUpdate {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("ID 입력");
		String x = JOptionPane.showInputDialog("변경할 항목번호(1~11) 입력");
		int chtable = Integer.parseInt(x);
		String change= JOptionPane.showInputDialog("변경될 내용 입력");
		
		CarInfoDAO db = new CarInfoDAO();
		
		try {
			db.update(id, chtable, change);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
