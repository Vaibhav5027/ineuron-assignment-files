<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create post</title>
</head>
<body>
	<center>
		<h1 style='color: red'>Enter Bolg Details</h1>
		<form action="./createpost" method="POST">
			<table>
				<tr >
					<label style=" margin-right: 45px; text-align:left;">Title </label>
					<input type="text" name="title"></input>
					</br>
					</br>
					</br>
				</tr>
				<tr >
					<label style=" margin-right: 10px; text-align:left;">Discription </label>
					<textarea type="text" name="discription" ></textarea>
					</br>
					</br>
				</tr>
				<tr >
					<label style=" margin-right: 40px; text-align:left;" >Context </label>
					<textarea type="text" name="content" align="center"></textarea>
					</br>
					</br>
					</br>
				</tr>
				<tr>
				<input type="submit" value="create"> </input>
				</tr>
			</table>


			</table>
		</form>
	</center>
</body>
</html>