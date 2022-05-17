<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BeanAction</title>
</head>
<body>

<h3>Check...</h3>
<jsp:useBean id="userBean" class="ai.jobiak.webapp.User" scope="request"></jsp:useBean>
<jsp:setProperty name="userBean" property="fname" param="fname"/>
<jsp:setProperty name="userBean" property="email" param="email"/>
<jsp:setProperty name="userBean" property="mobile" param="mobile"/>
<hr>
<h3> 
</h3>
<hr>
<jsp:forward page="ShowBeanData.jsp"></jsp:forward>
<hr>


</body>
</html>
