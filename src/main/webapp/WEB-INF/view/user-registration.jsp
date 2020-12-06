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
	<h1 align="center">Register Here</h1>
	<div align="center">
		<form:form action= "registrationSuccess" method="get"   modelAttribute="registration">
			<label>Name</label>
			<label>:</label>
			<form:input path="name"/>
			<br><br>
			<label>User Name</label>
			<label>:</label>
			<form:input path="userName"/>
			<br><br>
			<label>Password</label>
			<label>:</label>
			<form:password path="password"/>
			<br><br>
			<label>Country : </label>
			<form:select path="countryName">
				<form:option value="IND" label = "India"/>
				<form:option value="USA" label = "United States of America"/>
				<form:option value="UK" label = "United Kingdom"/>
				<form:option value="JAP" label = "Japan"/>
				<form:option value="AUS" label = "Australia"/>
			</form:select>
			<br><br>
			<label>Hobbies : </label>
			<span>Cricket</span><form:checkbox path="hobbies" value = "cricket"/><br>
			<span>Movies</span><form:checkbox path="hobbies" value = "movies"/><br>
			<span>Meditation</span><form:checkbox path="hobbies" value = "meditation"/><br>
			<span>Reading</span><form:checkbox path="hobbies" value = "reading"/>
			<br><br>
			<label>Gender : </label>
			<span>Male</span><form:radiobutton path="gender" value = "male"/>
			<span>Female</span><form:radiobutton path="gender" value = "female"/>
			<br><br>
			<input type="submit" value = "Register"/>
		</form:form>
	</div>
</body>
</html>