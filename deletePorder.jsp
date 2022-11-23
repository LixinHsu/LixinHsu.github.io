<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="Dao.porderDao"
    import="Model.porder"
    import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>取消餐點</title>
</head>
<body>
	<table width=600 align=center border=1>
		<tr height=150>
			<td align=center><jsp:include page="../title.jsp"/>
		<tr height=400>
			<td>
			<form action="../deletePorderController" method="post">
				<table width=500 align=center  border=0>
					<tr>
						<td align=center>
						id
						<input type="text" name="id" size=5>
						
						<input type="submit" value="ok">						
				
				</table>
			
			</form>
			<hr>
				<table width=500 align=center border=0>
					<tr align=center>
						<td>PorderId<td>MemberId<td>RstrId<td>FoodId
					<%
						
						List<porder> l=new porderDao().queryAll();
						for(porder p:l)
						{
							out.println("<tr align=center><td>"+p.getPorderId()+
									"<td>"+p.getMemberId()+
									"<td>"+p.getRstrId()+
									"<td>"+p.getFoodId());
						}
					%>
				<tr>
					<td colspan=6 align=center>
					<hr>
				<tr>
					<td colspan=6 align=center>
					<a href="../member/loginSuccess.jsp">回訂單頁</a>
				</table>
				
			
		<tr height=50>
			<td align=center><jsp:include page="../end.jsp"/>
	
	</table>
</body>
</html>