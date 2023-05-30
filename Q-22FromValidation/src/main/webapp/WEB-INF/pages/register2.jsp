<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert data</title>
</head>
<body>

	<form action="./save" method="POST">
		<table>
			<tr>
			<h1 style="color: green">User Avilable register with different username and password</h1>
			</tr>
			<td><label> username </label><input type="text" name="username"></td>
			</tr>
			</tr>
			<td><label> password </label><input type="password" name="password" ></td>
			</tr>
			</tr>
			<td><label> address </label><input type="text" name="address"></td>
			</tr>
			<tr><td><input type="submit" value="register"></td>
			</tr>
		</table>
	</form>
</body>
</html>