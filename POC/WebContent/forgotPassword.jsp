<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password Page</title>
</head>
<body>
	${msg}
	<form action="fp.do" method="post">
		UserName : <input type="text" name="userName" required="required"><br> <input
			type="submit" value="submit">
	</form>
</body>
</html>