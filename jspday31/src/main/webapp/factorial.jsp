<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial Jsp</title>
</head>
<body>
<h4>
<form >
<h3 >Factorial Application</h3>
Enter  Number :	<input type="text" name="num"><br><br>
<input type="submit" value="Show Factorial" >
</form>
</h4>
<%!
String str;
int result, n;
    int fact(int n)
    {
        if (n == 1) {
            return n;
        }
        else {
            return n * fact(n - 1);
        }
    }
    %>
    <%
try{
	if(request.getParameter("num")!=null)
str = request.getParameter("num");    
n = Integer.parseInt(str);   
result = fact(n);
int n1=Integer.parseInt(request.getParameter("num"));
}catch (Exception e){}
%>
<%
        out.println("The factorial :"+ result);
  %>
</body>
</html>