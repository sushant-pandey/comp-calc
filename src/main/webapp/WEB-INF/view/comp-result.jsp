<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	The first name is ${names.name1} 
	<br/>
	The second name is ${names.name2}
	<br/><br/>
	The compatibility result is : ${names.compatibilityResult}
	<br/>
	<!-- <a href = "./sendEmail">Send mail to your email id</a> -->
	<a href="<c:url value = "./sendEmail"/>">Send mail to your email id</a>
</body>
</html>