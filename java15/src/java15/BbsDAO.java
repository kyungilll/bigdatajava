package java15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.sql.*;
import com.mysql.jdbc.Driver;

public class BbsDAO {
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user = "root";
	String password = "1234";
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public void delete(String id) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 완료");
		
		url = "jdbc:mysql://localhost:3306/tacar";
		user = "root";
		password = "1234";
		 
		 con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공");
			
			String sql = "delete from bbs where id = ?";
			ps = con.prepareStatement(sql);	
			ps.setString(1, id);
			
			System.out.println("3. SQL문 결정완료");
			
			ps.executeUpdate();
			System.out.println("4. SQL전송완료");
	}
	public void update(String id, String title, String content , String etc) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 완료");
		
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");
		
		String sql = "update bbs set title = ?, content = ?, etc = ? where id = ?";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setString(3, etc);
		ps.setString(4, id);
		System.out.println("3. SQL문 결정완료");
		
		ps.executeUpdate();
		System.out.println("4. SQL전송완료");
	}
	public void insert(String id,   String title, String content, String etc) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 완료");
		
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");
		
		String sql = "insert into bbs values(?,?,?,?)";
		ps = con.prepareStatement(sql); //	객체화 , 위 내용을 문법으로 인식
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, etc);
		System.out.println("3. SQL문 결정완료");
		
		ps.executeUpdate();
		System.out.println("4. SQL전송완료");
	}
	public BbsDTO select(String inputId) {
		BbsDTO dto = null;
		try {
//		1. 드라이버설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 완료");
//		2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 완료");
//		3. SQL문결정 - 객체화
			String sql = "select*from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3. SQL문 객체화 완료");
//		4. SQL문 전송
			rs = ps.executeQuery(); // 받은 값 , 테이블 형태 ★★
//			rs = 를 설정하지 않았을 때 오류발생 > 
//			반드시 주소값을 가진 객체를 받아야 함 > 아닐 경우 null오류
			System.out.println("4. SQL문 전송완료");
//		SQL문 결과가 있으면, 받아서 처리
			dto = new BbsDTO();
			
			if(rs.next()) {
//				각 줄을 가르키는 커서를 옮기는 역할
//				rs.getString("id"); //인덱스번호에 있는 값을 가져옴
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
				
			} else {
				System.out.println("검색결과가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("오류발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally { //에러 발생여부와 관계없이 무조건 실행시켜야하는 코드
			try {
				con.close();
				ps.close();
				rs.close();
			} catch (SQLException e) {
				System.out.println("자원해제 중 에러발생");
			}//catch
		}//try
		return dto;
	}//select
}
