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
String num1 = request.getParameter("num1");
int n1 = Integer.parseInt(num1);
String num2 = request.getParameter("num2");
int n2 = Integer.parseInt(num2);

int sum=0;
for(int i=n1; i<=n2; i++){
	sum = sum+i;
}
%>

n1부터 n2까지 합은 <%= sum %> 입니다.
</body>
</html>