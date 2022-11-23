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
				<form action="../addRstrController" method="post">
					<table width=300 align=center>
						<tr>
							<td colspan=2 align=center><h3>餐廳資料</h3>
						<tr>	
							<td width=100 align=center>餐廳名稱
							<td width=250><input type="text" name="rstrName">
						<tr>
							<td colspan=2 align=center>
							<input type="submit" value="ok">
					</table>
				</form>
		<tr height=50>
			<td align=center><jsp:include page="../end.jsp"/>
	</table>
</body>
</html>