package test;

import javax.swing.JOptionPane;

public class CarInfoDelete {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("삭제할 ID 입력");
		
		CarInfoDAO db = new CarInfoDAO();
		
		try {
			db.delete(id);
		} catch (Exception e) {
		}
	}

}
