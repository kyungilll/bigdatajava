<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! %> <!-- 전역변수 영역 / !=선언문 : 전역변수사용, 메소드정의 -->

<!-- 스크립트릿(let=작은 프로그램) : 자바코드가 들어가는 부분 service() 메소드 자동호출됨 / 지역번수 -->
<!-- 메소드 정의불가 / 전역변수 사용불가 /  -->
	<%
	//자바코드 입력하기 위함
	// request > 내장된 객체 (싱글톤)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String[] hobby = request.getParameterValues("hobby");
		
		String result = "";
		for(int i=0; i<hobby.length; i++){
			result = result + hobby[i] + " ";
		}
	%>
	<h3>당신이 입력한 정보는 아래와 같습니다.</h3>
	<hr color="blue">
	ID : 
	<%= id %><br> 
	PW :
	<%= pw %><br> 
	NAME :
	<%= name %><br> 
	TEL :
	<%= tel %><br>
	HOBBY : 
	<%= result %><br>
	<!-- 표현식 : 변수값출력, 연산결과, 메소드호출 반환값있을 떄 -->
	
	표현식 연산결과 출력 : <%= 100+200 %>
</body>
</html>