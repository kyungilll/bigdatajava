<%@page import="product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
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
	
	<div>
	<table>
	
	<%
	ProductDAO dao = new ProductDAO();
	ArrayList list=dao.selectAll();
	
	for(int i=0; i<list.size(); i++){
		dto = (ProductDTO)list.get(i);
		%>
			<td width="200px" style="float: left">
			<li>ID : <%=dto.getId()%></li>
			<li>이름 : <%=dto.getTitle()%></li>
			<li>설명 : <%=dto.getContent()%></li>
			<li>가격 : <%=dto.getPrice()%></li>
			<img alt="" src="1.png" width="100px" height="100px">
			</td>
		<% } %>
	</table>
		</div>
</body>
</html>