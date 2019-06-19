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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		String dbid = "root";
		String dbpw = "root";

		if (id.equals(dbid) && pw.equals(dbpw)) {
			response.encodeRedirectUrl("http://www.naver.com");
		} else {
			response.encodeRedirectUrl("jsp6.jsp");
		}
	%>
</body>
</html>