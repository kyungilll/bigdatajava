<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript" src="insert.js">
		</script>
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
<form action="insert2.jsp">

ID : <input type="text" id="id" name="id"><button id="idchk">중복체크</button><br>
제목 : <input type="text" name="title"><br>
설명 : <input type="text" name="content"><br>
가격 : <input type="text" name="price"><br>
<input type="hidden" id="check" name="check" value="1">
<button type="submit">등록하기</button>
</form>
</body>
</html>