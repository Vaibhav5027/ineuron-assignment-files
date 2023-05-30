<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blogs</title>
</head>
<body>
<h1 style="text-align: center">All Blog Posts</h1>
<c:set var="count" value="1" />
 <c:forEach items="${bloglist}" var="blog">
   <h2 style="color:red;text-align: center">${count}.${blog.title}</h2>
   <p style="text-align: center">${blog.discription}</p>
   <p style="text-align: center">${blog.content}</p>   
   <c:set var="count" value="${count + 1}" />
 </c:forEach>
</body>
</html>