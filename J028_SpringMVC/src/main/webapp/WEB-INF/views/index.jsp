<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</head>
<body>
<div class="container">
			<h1  class="bg-danger text-center" >Library Management</h1>
			<div class="row">
			<div class="col-md-4">
			<h1 class="bg-success text-center">Add Book</h1>
			<form:form action="addBook" method="post" modelAttribute="book">
			
			
			
			<form:hidden path="id"/>
			<div class="form-group">
			<form:errors path="name"></form:errors>
			<form:label path="name">Book Name</form:label>
			<form:input path="name" class="form-control"/>
			</div>
			<div class="form-group">
			<form:label path="price">Book Price</form:label>
			<form:input path="price" class="form-control"/>
			</div>
			<div class="form-group">
			<form:label path="qty">Book qty</form:label>
			<form:input path="qty" class="form-control"/>
			</div>
			
			<div class="form-group">
			<input type="submit" class="btn btn-success form-control">
			</div>
			</form:form>
			</div>
			<div class="col-md-8">
			<h1 class="bg-success text-center">Book Details</h1>
			<div class="form-group">
			<input type="search" id="search" onkeyup="searchBook(value)" placeholder="Search book ...." class="form-control">
			</div>
			<table class="table">
			<thead class="thead-dark">
			<tr>
			<th>Id</th>
			<th>Book name</th>
			<th>Book Price</th>
			<th>Book Qty</th>
			<th colspan="3">Action</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="dt" items="${data}">
			<tr>
			<td>${dt.getId()}</td>
			<td>${dt.getName() }</td>
			<td>${dt.getPrice() }</td>
			<td>${dt.getQty()}</td>
			<td><a href="delete?did=${dt.getId()}" class="btn btn-danger">delete</a></td>
			<td><a href="edit?did=${dt.getId()}" class="btn btn-primary">Edit</a></td>
			</tr>
			</c:forEach>
			</tbody>
			</tbody>
			</table>
			
			</div>
			</div>
			</div>
</body>
</html>