<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 액션태그 -->
	<jsp:useBean id="dto" class="bean.MemberDTO">	</jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	
	<!-- 변수호출 세 가지 방법 -->
	<br>
	<jsp:getProperty property="id" name="dto"/>
	
	<br>
	${dto.id}
	
	<br>
	<%= dto.getId() %>
	
	
</body>
</html>