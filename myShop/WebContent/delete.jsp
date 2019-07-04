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
	<div>
		<table>
			<tr>
				<form action="delete2.jsp">
					<input type="text" id="id" name="id"><br>
					<button id="delete" type="submit">삭제하기</button>
				</form>
			</tr>
		</table>
	</div>
</body>
</html>