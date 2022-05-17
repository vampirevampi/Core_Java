<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<h3>Fibonacci Application</h3>
Enter the a number to find fibonacci  series:
<input type="text" name="num1"><br><br>
<input type="submit"><br><br>
<hr/><hr/>

<%

int n1=Integer.parseInt(request.getParameter("num1"));
int t1=0,t2=1,nt=t1+t2;

while (nt<= n1) {
    out.println(nt);
    t1 = t2;
    t2 = nt;
    nt = t1 + t2;
}




%>
</form>

</body>
</html>