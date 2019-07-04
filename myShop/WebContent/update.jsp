<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div>
		<table>
			<tr>
				<td id="menu" class="top"><a href="insert.jsp">등록하기</a></td>
				<td id="menu" class="top"><a href="select.jsp">검색/수정</a></td>
				<td id="menu" class="top"><a href="delete.jsp">삭제</a></td>
			</tr>
		</table>
	</div>
<%
String id = request.getParameter("id");
String title = request.getParameter("title");
String content = request.getParameter("content");
String price = request.getParameter("price");
%>
<form action="update2.jsp">
<input type="text" value=<%=id%> name="id"><br>
<input type="text" value=<%=title%> name="title"><br>
<input type="text" value=<%=content%> name="content"><br>
<input type="text" value=<%=price%> name="price"><br>
<button type="submit" id="submit">수정</button>
</form>
</body>
</html>