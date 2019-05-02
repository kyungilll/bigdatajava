package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
// import java.sql.*; 위 세 개를 한꺼번에 올려줌

public class Db처리 {
	//멤버변수
	Connection con;
	PreparedStatement ps;
	
	String url;
	String user;
	String password;
	
	//멤버메소드
	
public void insert(String id, String pw, String name, String tel) throws Exception {
	//응집도 : 하나의 기능에 집중해서 만드는 정도
	
//	1.드라이버(커넥터)설정
	Class.forName("com.mysql.jdbc.Driver");  // >클래스파일을 찾아서 이용함
	// 자바이외의 프로그램 사용시 예외처리
	System.out.println("1. 드라이버 설정 완료");
	
//	2.DB연결 (db명, id, pw)
	 url = "jdbc:mysql://localhost:3306/bigdata";
	 user = "root";
	 password = "1234";
	
	con = DriverManager.getConnection(url, user, password);
	System.out.println("2. DB연결 성공");
	
		
//	3.SQL결정
	String sql = "insert into member values(?,?,?,?)"; // "...." 만 바꿔서 반복
	ps = con.prepareStatement(sql); //	객체화 , 위 내용을 문법으로 인식
	ps.setString(1, id);
	ps.setString(2, pw);
	ps.setString(3, name);
	ps.setString(4, tel);
	System.out.println("3. SQL문 결정완료");
	
//	String url = "http://www.naver.com";
//	URL url2 = new URL(url);
	
	
//	4.SQL전송
	
	ps.executeUpdate();
	System.out.println("4. SQL전송완료");
	
}

public void update(String fid, String ctel) throws Exception {
	//응집도 : 하나의 기능에 집중해서 만드는 정도
	
//	1.드라이버(커넥터)설정
	Class.forName("com.mysql.jdbc.Driver");  // >클래스파일을 찾아서 이용함
	// 자바이외의 프로그램 사용시 예외처리
	System.out.println("1. 드라이버 설정 완료");
	
//	2.DB연결 (db명, id, pw)
	 url = "jdbc:mysql://localhost:3306/bigdata";
	 user = "root";
	 password = "1234";
	
	con = DriverManager.getConnection(url, user, password);
	System.out.println("2. DB연결 성공");
	
		
//	3.SQL결정
	String sql = "update member set tel=? where id=?";
	ps = con.prepareStatement(sql); //	객체화 , 위 내용을 문법으로 인식
	ps.setString(1, ctel);
	ps.setString(2, fid);
//	String url = "http://www.naver.com";
//	URL url2 = new URL(url);
//	4.SQL전송
	ps.executeUpdate();
	
}

}
