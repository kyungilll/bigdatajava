package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class CarInfoDAO {

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
	public void update(String id, int chtable, String change) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 완료");
		
		url = "jdbc:mysql://localhost:3306/tacar";
		user = "root";
		password = "1234";
		 
		 con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공");
	
		switch (chtable) {
		case 1:
			String sql1 = "update carinfo set brand = ? where id =?";
			ps = con.prepareStatement(sql1); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		case 2:
			String sql2 = "update carinfo set type = ? where id =?";
			ps = con.prepareStatement(sql2); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		case 3:
			String sql3 = "update carinfo set price = ? where id =?";
			ps = con.prepareStatement(sql3); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		case 4:
			String sql4 = "update carinfo set distance = ? where id =?";
			ps = con.prepareStatement(sql4); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		case 5:
			String sql5 = "update carinfo set year = ? where id =?";
			ps = con.prepareStatement(sql5); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		case 6:
			String sql6 = "update carinfo set location = ? where id =?";
			ps = con.prepareStatement(sql6); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		case 7:
			String sql7 = "update carinfo set color = ? where id =?";
			ps = con.prepareStatement(sql7); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		case 8:
			String sql8 = "update carinfo set fuel = ? where id =?";
			ps = con.prepareStatement(sql8); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		case 9:
			String sql9 = "update carinfo set transmission = ? where id =?";
			ps = con.prepareStatement(sql9); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		case 10:
			String sql10 = "update carinfo set opt = ? where id =?";
			ps = con.prepareStatement(sql10); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		case 11:
			String sql11 = "update carinfo set guarantee = ? where id =?";
			ps = con.prepareStatement(sql11); //객체화
			ps.setString(1, change);
			ps.setString(2, id);
			break;
		default:
			JOptionPane.showMessageDialog(null, "1~11 사이의 수로 다입력하세요.");
			break;
		}
		
		System.out.println("3. SQL문 결정완료");
		
		ps.executeUpdate();
		System.out.println("4. SQL전송완료");
}
}
