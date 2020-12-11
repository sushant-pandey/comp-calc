<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color: red;
		position: relative;
		text-align: left;
		margin-left: 30px;
	}
</style>
<script type="text/javascript">

function validateInputNames(){
	var name1 = document.getElementById('name1').value;
	var name2 = document.getElementById('name2').value;
	if(name1.length < 3 || name1.length > 15){
		alert('Name should be between 3-15 characters !')
		return false;
	} else if (name2.length < 3 || name2.length > 15){
		alert('Name should be between 3-15 characters !')
		return false;
	} else {
		return true;
	}
}
</script>

</head>
<body>
	<h1 align="center">Compatibility Calculator</h1>
	<hr>
	<form:form action="./compResult" method="get" modelAttribute="names">
		<div align= "center">
		<div align= "center">
			<label for="name1"><b>Enter first person's name : </b></label>
			<form:input id = "name1" path = "name1"/>
			<form:errors path = "name1" cssClass="error"/>
			<br>
			<br>
			<div align= "center">
			<label for="name2"><b>Enter second person's name : </b></label>
			<form:input id = "name2" path = "name2"/>
			<form:errors path = "name2" cssClass="error"/>
			<br>
			<br>
			<p>
				<form:checkbox path="acceptTermsAndConditions"/>
				<label>Terms and Conditions : I agree that this is just for fun.</label>
				<form:errors path="acceptTermsAndConditions" cssClass="error"/>
			</p>
			<br>
			<br>
			<input type = "submit" value = "Calculate"/>
		</div>
	</form:form>
</body>
</html>