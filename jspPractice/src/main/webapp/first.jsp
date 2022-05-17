<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First</title>
</head>
<body>
<%! int count=0;
    void counter(){
    count++;
   }

%>

<%

counter();

%>
<h1> This site is visited <%=count %> times</h1>



</body>
</html>