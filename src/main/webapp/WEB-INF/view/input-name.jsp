<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Compatibility Calculator</h1>
	<hr>
	<form:form action="./compResult" method="get" modelAttribute="names">
		<div align= "center">
		<div align= "center">
			<label for="name1"><b>Enter first person's name : </b></label>
			<form:input type = "text" id = "name1" path = "name1"/>
			<br>
			<br>
			<div align= "center">
			<label for="name2"><b>Enter second person's name : </b></label>
			<form:input type = "text" id = "name2" path = "name2"/>
			<br>
			<br>
			<input type = "submit" value = "Calculate"/>
		</div>
	</form:form>
</body>
</html>