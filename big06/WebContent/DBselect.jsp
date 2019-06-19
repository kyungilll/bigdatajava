<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		try {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");

			Class.forName("com.mysql.jdbc.Driver");
			out.write("1. 드라이버 설정 완료" + "<br>");

			String url = "jdbc:mysql://localhost:3306/bigdata";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "select*from member where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			ps.executeUpdate();
			out.write("DB입력 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
</body>
</html>