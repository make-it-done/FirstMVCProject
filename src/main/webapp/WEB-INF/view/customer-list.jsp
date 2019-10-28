<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>List of Customers</title>
</head>
<body>
	<c:forEach var="customer" items="${customers}">
		<c:out value="${customer}"></c:out>
		<br>
	</c:forEach>

</body>
</html>