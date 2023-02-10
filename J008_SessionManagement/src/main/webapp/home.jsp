<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		<%
		String uname = (String)session.getAttribute("uname");
		if(uname==null)
		{
			request.setAttribute("err", "Please login first");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		
		}
		%>
	
<h1>Welcome, ${uname}</h1>
<h2><a href="logout">Logout</a></h2>
</body>
</html>