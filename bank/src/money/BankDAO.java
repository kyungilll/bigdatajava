package money;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BankDAO {
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	

	public ArrayList selectAll() {//모든정보 검색

		ArrayList list = new ArrayList();
		BankDTO dto = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 완료");

			String url = "jdbc:mysql://localhost:3306/bank";
			String user = "root";
			String password = "1234";

			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 완료");

			String sql = "select * from member";
			ps = con.prepareStatement(sql);

			System.out.println("3. SQL문 객체화 완료");

			rs = ps.executeQuery();

			while (rs.next()) {
				dto = new BankDTO();
				dto.setId(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setAge(rs.getString(3));
				dto.setTel(rs.getString(4));
				
				list.add(dto);

			}
			System.out.println("4. SQL문 전송 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public void update(String id, String tel) throws Exception {//정보수정

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 완료");
		String url = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 완료");

		String sql = "update member set tel=? where id=?";
		//delete from 테이블명 where = 조건;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);

		System.out.println("3. SQL문 객체화 완료");
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		System.out.println("회원정보 변경완료");
		
	}
	
	public void delete(String id) throws Exception { //정보삭제

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 완료");
		String url = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 완료");

		String sql = "delete from member where id=?";
		//delete from 테이블명 where = 조건;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL문 객체화 완료");
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		System.out.println("회원정보 삭제완료");
		
	}
	
	public void insert(BankDTO dto) throws Exception { //정보삽입

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 완료");
		
		String url = "jdbc:mysql://localhost:3306/bank";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 완료");

		String sql = "insert into member values(?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getName());
		ps.setString(3, dto.getAge());
		ps.setString(4, dto.getTel());
		System.out.println("3. SQL문 객체화 완료");
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		System.out.println("회원정보 추가완료");
	}
	
	public BankDTO select(String id) throws Exception {//정보검색
		//ID로 검색
		BankDTO dto = new BankDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 완료");
			String url = "jdbc:mysql://localhost:3306/bank";
			String user = "root";
			String password = "1234";

			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 완료");

			String sql = "select*from member where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. SQL문 객체화 완료");

			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 완료");

			if (rs.next()) {
				dto.setId(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setAge(rs.getString(3));
				dto.setTel(rs.getString(4));
			} else {
				System.out.println("검색 결과가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("오류발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e2) {
				System.out.println("자원해제 중 에러발생");
				e2.printStackTrace();
			}
		}
		return dto;
	}
}
