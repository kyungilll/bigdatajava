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
		
		String dbId = "root";
		String dbPw = "1234";
		
		if((id.equals(dbId)) && (pw.equals(dbPw))){
			session.setAttribute("id", id);
			// setAttrubute 속성의 이름은 STRING 타입
			// session 속성값은 object타입
			// 값은 아무타입이나 가능(형변환, 업캐스팅)
			
		}else{
			response.sendRedirect("login.jsp");
		}
	%>
	
	${id}<br>
	
	<%= session.getAttribute("id") %><br>
	
	<%
	String sId = (String)session.getAttribute("id");
	//꺼낼 때는 다운캐스팅 해줘야함 / object로 꺼내면 다른 곳에서 쓸 수 없음
	%>
</body>
</html>