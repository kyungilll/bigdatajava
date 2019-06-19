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
		//받기전 받을 형식 설정 UTF8
		request.setCharacterEncoding("utf-8"); // ★
		//post방식일 경우 한글 처리를 별도로 해주어야 한다.
		String find = request.getParameter("find");
	%>
</body>
검색요청된 스트링 : <%=find%>
</html>