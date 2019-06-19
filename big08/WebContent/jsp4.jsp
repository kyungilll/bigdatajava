<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 106, 108페이지 -->
	요청방식 :
	<%=request.getScheme()%><br>
	<%=request.getServerName()%><br>
	<%=request.getLocalAddr()%><br>
<hr>

<%= request.getRequestURI() %> <!-- 요청한 페이지 --><br>
<%= request.getRequestURL() %> <br>
<%= request.getContextPath() %> <br><!-- project = context = application 같은 뜻 -->

</body>
</html>