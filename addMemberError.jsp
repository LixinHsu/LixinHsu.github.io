<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>註冊失敗</title>
</head>
<body>
		<table width=600 align=center border=1>
		<tr height=150>
			<td align=center><jsp:include page="../title.jsp"/>
		<tr height=400>
			<td>
			<h3>註冊失敗，此帳號已有人使用</h3>
			<a href="addMember.jsp">請重新註冊</a>
		<tr height=50>
			<td align=center><jsp:include page="../end.jsp"/>
	</table>
</body>
</html>