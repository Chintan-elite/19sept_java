<%@page import="com.example.demo.model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
	
</head>
<body>
	
	<%
		p

				String email = (String)session.getAttribute("email");
			if(email==null)
			{
				request.setAttribute("msg", "please login first");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}
		%>

	<h1 align="center" class="text-success">Student List</h1> 
	<h2>Welcome, <%=t(ema%> | <a href="logout">Logout</a></h2>
	<table border="1" width="100%" class="table table-striped table-dark">
		<tr>
			<th>Id</th>
			<th>Firstname</th>
			<th>Lname</th>
			<th>Email</th>
			<th>Password</th>
			<th>Phno</th>
			<th colspan="2">Action</th>
		</tr>
	
	<%
		p

			ArrayList<Employee> st = (ArrayList) request.getAttribute("data");

			for (Employee s : st)
		%>
			<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getFname() %></td>
			<td><%=s.getLname() %></td>
			<td><%=s.getEmail() %></td>
			<td><%=s.getPass() %></td>
			<td><%=s.getPhno() %></td>
			<td><a href="delete?did=<%=s.getId()%>" class="btn btn-danger">Delete</a> </td>
			<td><a href="update?uid=<%=s.getId()%>" class="btn  btn-warning">Update</a> </td>
			
			</tr>
	<%}
	%>
</table>
</body>
</html>