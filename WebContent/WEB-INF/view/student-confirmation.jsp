<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>

<!DOCTYPE html>

<html>

	<head>
		<title>Student Form Page</title>
	</head>
	
	<body>
		The student ${student.firstName} ${student.lastName} is confirmed.
		<br>
		Course Code: ${student.courseCode}
		<br>
	</body>

</html>