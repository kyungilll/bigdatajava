<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
	<!-- 액션태그 -->
	<jsp:setProperty property="*" name="dto" />
	<!-- 모든변수의 파라메터를 받아 DTO에 넣어줌 -->
	
	<h3>DTO에 들어간 값 출력</h3>
	<hr color="green">
	id:
	<%=dto.getId()%><br>
</body>
</html>