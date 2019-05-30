<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div id="total">
		<div id="top">
			<div id="content">
				<ul>
					<li><a href="css1.html">회사소개</a></li>
					<li><a href="css1.html">회사제품</a></li>
					<li><a href="css1.html">게시판</a></li>
					<li><a href="css1.html">회사연락처</a></li>
				</ul>
			</div>

			<div id="top2">
				<div id="content2">
					<ul>
						<li><a href="css1.html">회사소개</a></li>
						<li><a href="css1.html">회사제품</a></li>
						<li><a href="css1.html">게시판</a></li>
						<li><a href="css1.html">회사연락처</a></li>
					</ul>
				</div>
			</div>

			<div id="content" border="1">
				<center>
						<table>
							<tr>
								<td class="t1">아이디</td>
								<td class="t2">${param.id}</td>
							</tr>

							<tr>
								<td class="t1">패스워드</td>
								<td class="t2">${param.pw}</td>
							</tr>

							<tr>
								<td class="t1">이름</td>
								<td class="t2">${param.name}</td>
							</tr>

							<tr>
								<td class="t1">전화번호</td>
								<td class="t2">${param.tel}</td>
							</tr>

							<tr>
								<td class="t3" colspan="2"><input type="button"
									value="뒤로가기"><a href="css8.html"></a></td>
							</tr>

						</table>
					</form>
				</center>


			</div>
		</div>
	</div>
</body>
</html>