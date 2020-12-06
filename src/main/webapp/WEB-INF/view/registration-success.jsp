<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration Success!!!</h1>
	User : ${registration.name} <br>
	User Name : ${registration.userName}<br>
	Hobbies : 
	
	<c:forEach items = "${registration.hobbies}" var = "hobby">
		${hobby } <span> </span>
	</c:forEach><br>
	Gender : ${registration.gender}
</body>
</html>