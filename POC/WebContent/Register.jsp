<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<div align="center">
		<form action="fs.do" method="post">
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
					<td>PhoneNumber :</td>
					<td><input type="number" id="phoneNumber" name="phoneNumber"></td>
				</tr>
				<tr>
					<td>Country :</td>
					<td><input type="text" id="country" name="country"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Register" /></td>
				</tr>
				<tr>
					<td><a href="Login.jsp">Login</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>