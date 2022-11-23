<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="Model.member"%>
<%
member m = (member) session.getAttribute("M");
%>
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
				<form action="finish1.jsp" method="post">
				<table width=500 align=center>
					<tr>
						<td colspan=3 align=center>
						<h3>請點餐</h3>
					<tr>
						<td colspan=3 align=center>
						<hr>
					<tr>
						<td colspan=4 align=center>
						會員編號
						<input type="text" name="memberId">
					<tr>
						<td colspan=4 align=center>
						<hr>
					<tr>
						<td valign="top">
						漢堡<br>
						<img  alt="漢堡" src="pic\1.png">
						<br>
						<select name="hamburger">
							<option value="0">0
							<option value="1">1
							<option value="2">2
							<option value="3">3
							<option value="4">4
							<option value="5">5
							<option value="6">6
						
						</select>
						
						<td valign="top">
						披薩<br>
						<img  alt="披薩" src="pic\2.jpg">
						<br>
						<select name="pizza">
							<option value="0">0
							<option value="1">1
							<option value="2">2
							<option value="3">3
							<option value="4">4
							<option value="5">5
							<option value="6">6
						
						</select>
						
						<td valign="top">
						湯品<br>
						<img  alt="湯品" src="pic\3.jpg">
						<br>
						<select name="soup">
							<option value="0">0
							<option value="1">1
							<option value="2">2
							<option value="3">3
							<option value="4">4
							<option value="5">5
							<option value="6">6
						
						</select>
					<tr>
						<td colspan=3 align=center>
						<hr>
					<tr>
						<td colspan=3 align=center>
						<input type="submit" value="確定">
				</table>
				</form>
		<tr height=50>
			<td align=center><jsp:include page="../end.jsp"/>
	
	</table>
</body>
</html>