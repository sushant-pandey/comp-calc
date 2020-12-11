<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hi ${names.name1}</h2>
<h2>You can send the result to your email id</h2>
<form:form action="./emailSent" method="get" modelAttribute="emailDTO">
	<label>Enter you email id : </label>
	<form:input path="emailAddress"/>
	<input type="submit" value="Send">
</form:form>
</body>
</html>