package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DB갱신 {
	static Connection con;
	static PreparedStatement ps;
	static String url;
	static String user;
	static String password;
	
	public static void update(String fid, String cid) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");

		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		
		con = DriverManager.getConnection(url, user, password);
		
		fid = JOptionPane.showInputDialog("찾을 ID 입력");
		cid = JOptionPane.showInputDialog("변경할 ID");
		String sql = "update member set id=?, where id=?";
		
		
		ps = con.prepareStatement(sql); //	객체화 , 위 내용을 문법으로 인식
		
		ps.setString(2, cid);
		ps.executeUpdate();
		
	}

}
