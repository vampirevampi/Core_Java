<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Error Page</title>
</head>
<body>
<h2>An unexpected event prevented you're content being rendered</</h2>
<h3><%out.println(exception.getLocalizedMessage()); %>
</body>
</html>