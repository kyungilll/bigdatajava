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

	<%
		ProductDAO dao = new ProductDAO();

		String id = request.getParameter("id");
		dto = null;
		dto = dao.select(id);
	%>
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
			<td>
				<li>상품정보</li>
				<li>ID : <%=dto.getId()%></li>
				<li>상품명 : <%=dto.getTitle()%></li>
				<li>설명 : <%=dto.getContent()%></li>
				<li>가격 : <%=dto.getPrice()%></li>
			</td>
		</tr>
	</table>
	<a href="selectAll.jsp">목록으로</a>
	<a
		href="update.jsp?id=<%=dto.getId()%>&title=<%=dto.getTitle()%>&content=<%=dto.getContent()%>&price=<%=dto.getPrice()%>">수정하기</a>
</body>
</html>