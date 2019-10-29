<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>List of Customers</title>
</head>
<body>
	<table>
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="customer" items="${customers}" >
			<c:url var="update" value="updateCustomer"  >
				<c:param name="id" value="${customer.id}" ></c:param>
			</c:url>
			
			<c:url var="delete" value="deleteCustomer" >
				<c:param name="id" value="${customer.id}" ></c:param>
			</c:url>
		<tr>
			<td>${customer.firstName}</td>
			<td>${customer.lastName}</td>
			<td>${customer.email}</td>
			<td><a href="${update}">Update</a></td>
			<td><a href="${delete}">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<input type ="submit" value="Add Student" onclick="window.location.href='addNewCustomer'"> 


</body>
</html>