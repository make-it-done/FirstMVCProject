<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<body>

	<form:form action="create-update-customer" modelAttribute="customer" method="POST">
		<form:hidden path="id"/>
		FirstName: <form:input path="firstName"/>
		<br><br>
		LastName:  <form:input path="lastName"/>
		<br><br>
		Email:     <form:input path="email"/>
		<br><br>
		<input type="submit" value="Submit">

	</form:form>

</body>
</html>