<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/practice" user="root" password="" var="ds"/>
	<sql:query var="data" dataSource="${ds}">
	select * from employee
	</sql:query>

	<c:forEach var="dt" items="${data.rows}">
	<span>${dt.id}</span>
	<span>${dt.name}</span>
	<span>${dt.dpt}</span>
	<span>${dt.sal}</span><br>
	</c:forEach>



</body>
</html>