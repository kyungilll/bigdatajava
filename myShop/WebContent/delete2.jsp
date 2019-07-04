<%@page import="product.ProductDAO"%>
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
	<jsp:useBean id="dto" class="product.ProductDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto" />
	<div>
		<table>
			<tr>
				<td id="menu" class="top"><a href="insert.jsp">등록하기</a></td>
				<td id="menu" class="top"><a href="select.jsp">검색/수정</a></td>
				<td id="menu" class="top"><a href="delete.jsp">삭제</a></td>
			</tr>
		</table>
	</div>
	<table>
		<tr>
			<%
				ProductDAO dao = new ProductDAO();
				String id = request.getParameter("id");

				dao.delete(id);
			%>
			<p>삭제성공</p>
			<a href="selectAll.jsp">목록으로</a>
		</tr>
	</table>
</body>
</html>