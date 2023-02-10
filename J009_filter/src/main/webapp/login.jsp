<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
		<form action="login" method="post">
		<span style="color: red;">${err}</span>
		<input type="text" name="username" placeholder="Enter username">
		<input type="text" name="password" placeholder="Enter password">
		<input type="submit">
		</form>
		<a href="home">Home</a>
</body>
</html>