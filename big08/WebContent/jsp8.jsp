<%@page import="java.util.Enumeration"%>
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
	Enumeration<String> headers = request.getHeaderNames();
	//형변환이 필요하지 않을 때 <>
	
	while(headers.hasMoreElements()){
		// 값이 있을때까지 돌아감
		String s = headers.nextElement();
		out.write(s + "<br>");
		
	}
	%>
</body>
</html>