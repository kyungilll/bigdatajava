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
		for (int i = 0; i < 10; i++) {
	%>
	<table border="1" bordercolor="red">
		<tr width="500" align="center">
			<td width="100" align="center">과목</td>
			<td width="200" align="center">점수</td>
			<td width="200" align="center">학점</td>
		</tr>
		
		<tr>
			<td>영어</td>
			<td>100</td>
			<td>A</td>
		</tr>

	</table>
	<br>
	<%
		}
	%>
</body>
</html>