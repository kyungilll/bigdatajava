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
		String location = request.getParameter("location");
		
		String count = request.getParameter("count");
		int n = Integer.parseInt(count);
		String ment="";
	if(n<3){
		ment = location + "으로 여행가셔도 되겠군요";
	} else{
		ment = location + "으로의 여행을 그만 가셔야 되겠군요";
	}
	
	%>
	
<%= ment %>
	
</body>
</html>