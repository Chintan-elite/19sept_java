<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jstl</title>
</head>
<body>
	
		<%-- <c:set value="20" var="a"></c:set>
		<c:out value="${a}"></c:out>
		<c:if test="${a>10 }">
		<c:out value="a is gtraer"></c:out>
		</c:if> 
		
		<c:import url="https://www.javatpoint.com/jstl-core-import-tag" var="a"></c:import>
		<c:out value="${a}"></c:out>
		
		<c:set value="20" var="a"></c:set>
		<c:out value="${a}"></c:out>
		<c:remove var="a"/>
		<c:out value="${a}"></c:out>
		
		<c:catch var="ex">
		<%int a = 10/0; %>
		</c:catch>
		<c:out value="${ex}"></c:out>
		
		<c:forEach var="dt" begin="1" end="10">
		<c:out value="${dt }"></c:out>
		</c:forEach>
		
		
		<c:forTokens items="tops-tech-surat" delims="-" var="dt">
		<c:out value="${dt }"></c:out><br>
		</c:forTokens>
		--%>
		
		<c:url value="home.jsp" var="home">
		<c:param name="trackingId" value="786"/>  
 		<c:param name="user" value="Nakul"/>  
		</c:url>
		
		<a href="${home}">click me</a>
		
</body>
</html>