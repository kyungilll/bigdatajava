package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class MyPhone {

	public static void main(String[] args) throws Exception { // 예외처리
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/myphone";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String id = JOptionPane.showInputDialog("ID입력");
		String title = JOptionPane.showInputDialog("TITLE입력");
		String x = JOptionPane.showInputDialog("PRICE입력");
		int price = Integer.parseInt(x);
		String company = JOptionPane.showInputDialog("COMPANY입력");
		String sql = "insert into product values(?,?,?,?)";

		PreparedStatement phone = con.prepareStatement(sql);
		phone.setString(1, id); //1번위치에  ID를
		phone.setString(2, title);
		phone.setInt(3,price);
		phone.setString(4, company);

		phone.executeUpdate();
	}
}
