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
	
		<label>Credit Card : </label>
		${billInfo.creditCard}
		<br><br>
		<label>Expiry Date : </label>
		${billInfo.date}
		<br><br>
		<label>Currency : </label>
		${billInfo.currency.displayName}
		<br><br>
		<label>Amount : </label>
		${billInfo.amount}
		<br><br>
		
	
</body>
</html>