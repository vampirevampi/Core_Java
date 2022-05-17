 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2" align="center">
	<fa>Exponent</fa>
	<fa>2^Exponent</fa>
	<%
	
	for(int i=0;i<10;i++)
	{
		%>
		<tr>
		<td><%= i%></td>
		<td><%= Math.pow(2,i) %></td>
		</tr>
		
				
		
	<% }
	
	%>
	 

</table>
</body>
</html>