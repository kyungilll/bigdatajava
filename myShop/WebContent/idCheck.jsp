<%@page import="product.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="dto" class="product.ProductDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto" />
	
	<%
	ProductDAO dao = new ProductDAO();

	String id = request.getParameter("id");
	dto = dao.select(id);
	if (dto==null){
		%>
YES
		<%
	} else{
		%>
NO
		<%
	}%>

	
