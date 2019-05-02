package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
// import java.sql.*; 위 세 개를 한꺼번에 올려줌

public class Db테스트 {
public static void main(String[] args) throws Exception {
	
//	1.드라이버(커넥터)설정
	Class.forName("com.mysql.jdbc.Driver");  // >클래스파일을 찾아서 이용함
	// 자바이외의 프로그램 사용시 예외처리
	System.out.println("1. 드라이버 설정 완료");
	
//	2.DB연결 (db명, id, pw)
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user = "root";
	String password = "1234";
	
	Connection con = DriverManager.getConnection(url, user, password);
	System.out.println("2. DB연결 성공");
	
		
//	3.SQL결정
	String sql = "insert into member values('win','win','win','win')"; // "...." 만 바꿔서 반복
	PreparedStatement ps = con.prepareStatement(sql); //	객체화
	System.out.println("3. SQL문 결정완료");
	
//	String url = "http://www.naver.com";
//	URL url2 = new URL(url);
	
	
//	4.SQL전송
	
	ps.executeUpdate();
	System.out.println("4. SQL전송완료");
	
}
}
