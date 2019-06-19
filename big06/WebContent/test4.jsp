<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dto" class="bean.bbsDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	
	<h3>출력</h3>
	<hr color="blue">
	ID : <%= dto.getId() %><br>
	TITLE : <%= dto.getTitle() %><br>
	CONTENT : <%= dto.getContent() %><br>
	WRITER : <%= dto.getWriter() %><br>
</body>
</html>