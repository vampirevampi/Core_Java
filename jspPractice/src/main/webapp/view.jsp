<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <%@ page import="java.sql.*"%>
<title>View Page</title>
</head>
<body>
<% 
try {
	Class.forName("com.mysql.cj.jdbc.Driver");


String userName="root";
String password="Hema@6594";
String url="jdbc:mysql://localhost:3306/hema";
Connection con=DriverManager.getConnection(url,userName,password);

Statement st2=con.createStatement();
ResultSet rs=st2.executeQuery("select * from contacts");
while(rs.next())
{
	out.println("Name::"+rs.getString(1)+" PhoneNo::"+rs.getString(2)+"Mail::"+rs.getString(3)+" Address::"+rs.getString(4));
}

}catch(Exception e){
	e.printStackTrace();
}

%>
</body>
</html>