<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My App</title>
</head>
<body>
	<h1 style='color: red; text-align: center;'>Enter Login Details</h1>
	<form action="./verify" method="POST">
		<table>
			<tr>
			</tr>
			<td><label> username </label><input type="text" name="username"></td>
			</tr>
			</tr>
			<td><label> password </label><input type="password" name="password" ></td>
			</tr>
			
			<tr><td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>