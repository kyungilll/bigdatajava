package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class CarInfoDAO2 {

	Connection con;
	PreparedStatement ps;
	
	String url;
	String user;
	String password;
	
	public void insert(CarInfoDTO dto) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 완료");
		
		url = "jdbc:mysql://localhost:3306/tacar";
		user = "root";
		password = "1234";
		 
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");
	
		String sql = "insert into carinfo values(?,?,?,?,?,?,?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getBrand());
		ps.setString(3, dto.getType());
		ps.setString(4, dto.getPrice());
		ps.setString(5, dto.getDistance());
		ps.setString(6, dto.getYear());
		ps.setString(7, dto.getLocation());
		ps.setString(8, dto.getColor());
		ps.setString(9, dto.getFuel());
		ps.setString(10, dto.getTransmission());
		ps.setString(11, dto.getOpt());
		ps.setString(12, dto.getGuarantee());
		
		System.out.println("3. SQL문 결정완료");
		
		ps.executeUpdate();
		System.out.println("4. SQL전송완료");
	}
	public void delete(String id) throws Exception {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 완료");
			
			url = "jdbc:mysql://localhost:3306/tacar";
			user = "root";
			password = "1234";
			 
			 con = DriverManager.getConnection(url, user, password);
				System.out.println("2. DB연결 성공");
		
			String sql = "delete from carinfo where id = ?";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, id);
			System.out.println("3. SQL문 결정완료");
			
			ps.executeUpdate();
			System.out.println("4. SQL전송완료");
	}
	public void update(String id, String chtable, String change) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 완료");
		
		url = "jdbc:mysql://localhost:3306/tacar";
		user = "root";
		password = "1234";
		 
		 con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공");
	
			
			String sql = "update carinfo set " + chtable + " = ? where id =?";
			//테이블명으로 입력받음
			ps = con.prepareStatement(sql); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
		
		System.out.println("3. SQL문 결정완료");
		
		ps.executeUpdate();
		System.out.println("4. SQL전송완료");
}
}
