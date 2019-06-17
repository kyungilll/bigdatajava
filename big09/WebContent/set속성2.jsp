<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	

	세션값 출력 : ${id}
	<br> 어플값 출력 : ${count}
	<br>
	<hr>
	<%
		int c = (int) application.getAttribute("count");
		// 포장클래스 > 랩핑클래스
		int total = c + 1;
		application.setAttribute("count", total);
		
	%>
	<a href="set속성3.jsp">set속성3</a>
</body>
</html>