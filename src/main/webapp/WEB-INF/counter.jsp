<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	
	<h1>you have visited the site <c:out value="${count}"/>  times.</h1>
	<a href="/">Test another visit</a>
	<a href="/reset">reset the counter</a>
</body>
</html>