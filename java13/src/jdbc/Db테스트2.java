package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
// import java.sql.*; 위 세 개를 한꺼번에 올려줌

import javax.swing.JOptionPane;

public class Db테스트2 {
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
	String id = JOptionPane.showInputDialog("ID입력");
	String pw = JOptionPane.showInputDialog("PW입력");
	String name = JOptionPane.showInputDialog("이름입력");
	String tel = JOptionPane.showInputDialog("번호입력");
	
//	String sql = "insert into member values('" + id + "','" + pw + "','" + name + "','" + tel + "')"; // "...." 만 바꿔서 반복
	String sql = "insert into member values(?,?,?,?)"; // 
	// DB는 위치값 1부터 시작함 , 물음표는 기호 '' 붙이지 않음
	
	
	System.out.println(sql);
	PreparedStatement ps = con.prepareStatement(sql); //	객체화
	ps.setString(1, id); //1번위치에  ID를
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
}
