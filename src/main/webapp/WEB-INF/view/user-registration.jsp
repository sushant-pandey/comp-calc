<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error {
		color: red;
		position: fixed;
		text-align: left;
		margin-left: 30px;
		
	}
	
	.txtBox{
		position: fixed;
	}
</style>
</head>
<body>
	<h1 align="center">Register Here</h1>
	<div align="center">
		<form:form action= "registrationSuccess" method="get"   modelAttribute="registration">
			<label>Name</label>
			<label>:</label>
			<form:input path="name"/>
			<form:errors path="name" cssClass="error" />
			<br><br>
			<label>User Name</label>
			<label>:</label>
			<form:input path="userName"/>
			<form:errors path="userName" cssClass="error" />
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
			<div align = "center" style="txtBox">
				<label>Age : </label>
				<form:input path="age"/>
				<form:errors path = "age" cssClass="error"/>
			</div>
			<br><br>
			<h3 align="center">Communication Details</h3>
			<div>
				<label>Email : </label>
				<form:input path="communicationDto.email"/>
				<form:errors path = "communicationDto.email" cssClass="error"/>
			</div>
			<br><br>
			<label>Phone : </label>
			<form:input path="communicationDto.phone"/>
			<form:errors path = "communicationDto.phone"/>
			<form:errors path = "communicationDto.phone.countryCode"/>
			<form:errors path = "communicationDto.phone.phoneNumber"/>
			<br><br>
			<input type="submit" value = "Register"/>
		</form:form>
	</div>
	
	
</body>
</html>