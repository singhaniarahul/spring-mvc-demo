<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

	<head>
		<title>Student Form Page</title>
		<style>
			.error {color: red}
		</style>
	</head>
	
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName" />
			<br><br>
			Last Name (*): <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error"/>
			<br><br>
			Course Code: <form:input path="courseCode" />
			<form:errors path="courseCode" cssClass="error"/>
			<br><br>
			<input type="submit" value="Submit"/>
			<br><br>
		</form:form>
	</body>

</html>