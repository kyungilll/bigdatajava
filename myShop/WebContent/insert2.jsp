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
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String price = request.getParameter("price");
	String check = request.getParameter("check");
	
	if(id=="" || title=="" || content=="" || price=="" || check.equals("1")){
		out.write("입력되지 않았거나 ID가 중복체크가 완료되지 않았습니다.");
		%>
		<a href="insert.jsp">돌아가기</a>
		<%
	} else{
	dto.setId(id);
	dto.setTitle(title);
	dto.setContent(content);
	dto.setPrice(price);
	
	dao.insert(dto);
	%>
	
	<p>등록완료</p>
	<a href="selectAll.jsp">상품목록으로</a>
	<% } %>
	
</body>
</html>