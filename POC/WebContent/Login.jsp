<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body style="background-color: #5B6FDD;">
	${msg}
	<div align="center">
		<form action="ls.do" method="post">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Spring MVC Form Demo -
							Registration</h2></td>
				</tr>
				<tr>
					<td>UserName :</td>
					<td><input type="text" id="username" name="username"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" id="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Login" /></td>
				</tr>
				<tr>
					<td><a href="Register.jsp">Register</a></td>
				</tr>
				<tr>
					<td><a href="forgotPassword.jsp">Forget Password</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>