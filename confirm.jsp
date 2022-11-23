<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="Model.porder"%>
<%
	request.setCharacterEncoding("utf-8");
	int memberId = Integer.parseInt(request.getParameter("memberId"));
	int rstrId = Integer.parseInt(request.getParameter("rstrId"));
	int foodId = Integer.parseInt(request.getParameter("foodId"));
	
	porder p = new porder(memberId,rstrId,foodId);
	session.setAttribute("P", p); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認餐點</title>
</head>
<body>
	<table width=600 align=center border=1>
		<tr height=150>
			<td align=center><jsp:include page="../title.jsp"/>
		<tr height=400>
			<td>
				<table width=300 align=center>
					<tr>
						<td colspan=2 align=center>
						<h3>你的餐點細目</h3>
					<tr>
						<td colspan=2 align=center>
						<hr>
					<tr>
						<td width=50 align=center>會員編號
						<td><%=p.getMemberId() %>
					<tr>
						<td width=50 align=center>餐聽
						<td><%=p.getRstrId() %>
					<tr>
						<td width=50 align=center>餐點
						<td><%=p.getFoodId() %>
					<tr>
						<td width=50 align=center>
						<td>
					<tr>
						<td colspan=2 align=center>
						<hr>
					<tr>
						<td colspan=3 align=center>
						<a href="addOrder.jsp">重填</a>
						<a href="finish.jsp">確定</a>
				
				</table>
			
		<tr height=50>
			<td align=center><jsp:include page="../end.jsp"/>
	
	</table>
</body>
</html>