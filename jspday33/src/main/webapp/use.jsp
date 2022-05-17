<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" info="demonstrates include directive vs standard action include"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>use</title>
</head>
<body>
<h3> I am using source.jsp
<jsp:include page="source.jsp"></jsp:include>
</h3>
<h2>
<jsp:include page="source.jsp"></jsp:include>
</h2>
<%@include file="source3.jsp" %>
</body>
</html>