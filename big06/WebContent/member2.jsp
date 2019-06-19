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
		String name = request.getParameter("name");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String gender = request.getParameter("gender");
		String mail = request.getParameter("mail");
		String phone = request.getParameter("phone");
	%>
	ID :
	<%=id%><br> PW :
	<%=pw%><br> NAME :
	<%=name%><br> YEAR :
	<%=year%><br> MONTH :
	<%=month%><br> DAY :
	<%=day%><br> GENDER :
	<%=gender%><br> MAIL :
	<%=mail%><br> PHONE :
	<%=phone%><br>
	</form>
</body>
</html>