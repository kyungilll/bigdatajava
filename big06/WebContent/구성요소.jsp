<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 선언문 -->
<%! 
	String name; //전역변수는 자동초기화 null들어있음
	public String test(){
		return 1000 + "원";
	}
%>
<!-- 스크립트릿 -->
<% 
	String test=""; //지역변수는 자동으로 null들어가있지 않음
// PrintWriter out = new PrintWriter();
out.print("OK !!! <br>");
out.print(100+200 +"<br>");
%>
<!-- 표현식 세미콜론 쓰지않음-->
<%= 100+200 %><br>
<%= name %><%= test %><br>

<%= test() %>

</body>
</html>