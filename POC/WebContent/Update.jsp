<%@page import="com.jspider.poc.dto.RegisterDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
	<div align="center">
		<form action="up.do" method="post">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Spring MVC Form Demo -
							Registration</h2></td>
				</tr>
				<tr>
					<td>UserName :</td>
					<td><input type="text" id="username" name="username"
						value="${regdto.username}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="text" id="password" name="password"
						value="${regdto.password}"></td>
				</tr>
				<tr>
					<td>PhoneNumber :</td>
					<td><input type="number" id="phoneNumber" name="phoneNumber"
						value="${regdto.phoneNumber}"></td>
				</tr>
				<tr>
					<td>Country :</td>
					<td><input type="text" id="country" name="country"
						value="${regdto.country}"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Update" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>