<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="">
	<table width=600 align=center border=1>
		<tr height=150>
			<td align=center><jsp:include page="title.jsp"/>
		<tr height=400>
			<td>
				<form action="loginController" method="post">
					<table width=300 align=center>
						<tr>
							<td width=50 align=center>名稱
							<td width=250><input type="text" name="username">
						<tr>
							<td align=center>密碼
							<td><input type="password" name="password">
						<tr> 
							<td colspan=2 align=center>
							<input type="submit" value="ok">
					</table>
				</form>
		<tr height=50>
			<td align=center><jsp:include page="end.jsp"/>
	</table>
</body>
</html>