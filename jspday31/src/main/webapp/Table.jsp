<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication</title>
</head>
<body>
<form >
Enter the number to Generate table :
<input type="number" name="num"><br><br>
<input type="submit"><br><br>
<hr/><hr/>
<%
try{
int n1=Integer.parseInt(request.getParameter("num"));
for(int i=1;i<=10;i++)
{
	out.println(n1+" * "+i+" = "+n1*i+"<br><br>");
	
}
}catch(Exception e){
	e.printStackTrace();
}

		%>
</form>

</body>
</html>