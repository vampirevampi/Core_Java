<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp@Hema</title>
</head>
<body>
<%! int a=10;

public int cube(int n){
	return n*n*n;
}

ArrayList<String>topics=new ArrayList<>();

 %>



<h1>
<%=new String("Welcome to jobiak+Hulks")+a %>
</h1>
<h2>
<%out.println("you can write java in tags-which are known as scriptlets/expressions/declarations/comments"); %>
out.println(a);
</h2>
<h3>5^3 is :<%=cube(5) %></h3>
<h3>
<% 

topics.add("html,css,js");
topics.add("Typescript and Angular 10");
topics.add("Spring,SpringBoot,Hibernate&jpa");
topics.add("GIT,JENKINS,JUNIT & AWS");

for(String topic:topics){
out.println(topic+"<br/>");

}
%>
<h3>Elements in arraylist<%=topics.size() %></h3>
</h3>

</body>
</html>