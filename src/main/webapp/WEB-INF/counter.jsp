<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Home page</title>
</head>
<body>
		<% Integer count = (Integer) session.getAttribute("counter"); %>
	<h1> you have visited <a href="/">http://localhost:8080/</a>  <%= count %> times </h1>
	<a href="/">Test another Visit?</a>
	
</body>
</html>