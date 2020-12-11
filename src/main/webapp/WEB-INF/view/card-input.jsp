<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Credit Card Information</h1>
<hr/>
<div align="center">
	<form:form action="./carddisplay" method="get" modelAttribute="billInfo">
		<label>Credit Card : </label>
		<form:input path="creditCard"/>
		<br><br>
		<label>Expiry Date : </label>
		<form:input path="date"/>
		<br><br>
		<%-- <label>Currency : </label>
		<form:input path="currency"/>
		<br><br> --%>
		<label>Currency : </label>		
		<form:select path="currency">
			<c:forEach items="${billInfo.currencyOptions}" var="currencyOption">
				<form:option value="${currencyOption}">${currencyOption.displayName}</form:option>
			</c:forEach>
		</form:select>		
		<br><br>
		<label>Amount : </label>
		<form:input path="amount"/>
		<br><br>
		<input type="submit" value="Pay Bill"/>
	</form:form>
</div>
</body>
</html>