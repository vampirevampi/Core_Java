<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="jspPractice.ContactInf"%>
  <%@ page import="java.sql.*,jspPractice.ContactInf"%> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
</head>
<body>


<% 
try {
	Class.forName("com.mysql.cj.jdbc.Driver");


String userName="root";
String password="Hema@6594";
String url="jdbc:mysql://localhost:3306/hema";
	Connection con=DriverManager.getConnection(url,userName,password);
	Statement st=con.createStatement();
	// directly created a table in workbench

String Name=request.getParameter("name");
String Phoneno=request.getParameter("phoneno");
String Mail=request.getParameter("mail");
String Address=request.getParameter("address");

String insertsql="insert into contacts(name,phoneno,mail,address)values(?,?,?,?)";
PreparedStatement p=con.prepareStatement(insertsql);
p.setString(1,Name);
p.setString(2,Phoneno);
p.setString(3,Mail);
p.setString(4,Address);
p.execute();
out.println("done...");

}catch(Exception e){
	e.printStackTrace();
}

%>

<jsp:forward page="view.jsp"></jsp:forward>


</body>
</html>