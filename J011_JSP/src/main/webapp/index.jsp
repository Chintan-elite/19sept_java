
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="true" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<%!public int r; %>
			<%
			r = 50;
			int a = 10;
			int b = 20;
			
			
			%>
			<%=a+b %>
			
			<span>${msg}</span>
			<span>abc</span>
			<spna>${sdss}</spna>
			
			
			<%
			int a1 = 10;
			int b1	 = a/0;
			
			%>
</body>
</html>