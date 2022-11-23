<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width=600 align=center border=1>
		<tr height=150>
			<td align=center><jsp:include page="../title.jsp"/>
		<tr height=400>
			<td>
			<table width=300 align=center>
				<tr>
					<td align=center><h3>您好,請選擇項目</h3>
				<tr>
					<td align=center><a href="../porder/addPorder.jsp">1)KFC</a>
				<tr>
					<td align=center><a href="../porder/addPorder.jsp">2)M</a>
				<tr>
					<td align=center><a href="../porder/addPorder.jsp">3)Sukiya</a>
			</table>
		<tr height=50>
			<td align=center><jsp:include page="../end.jsp"/>
	</table>
</body>
</html>