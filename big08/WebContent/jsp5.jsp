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
		response.sendRedirect("http://www.naver.com");
		//브라우저에게 명령 (주소를 넣어서 요청하라)
		//클라이언트가 요청한 내용은 주소에 남는다.
	%>
</body>
</html>