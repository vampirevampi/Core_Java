package ai.jobiak.pacticeservlet;
import java.sql.*;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ins")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		
		
		
		
		
		  int SNo=Integer.parseInt(request.getParameter("sno")); 
		  String FirstName=request.getParameter("fname");
		  String LastName=request.getParameter("lname"); 
		  String Gender=request.getParameter("gender"); 
		  String Email=request.getParameter("email");
		  String Password=request.getParameter("password"); 
		  String PhoneNo=request.getParameter("phoneno"); 
		  String Address= request.getParameter("address");
		 
		
		  
		  //connecting with JDBC
		  
		  try {
		  
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  String userName="root"; String password="Hema@6594"; 
		  String url="jdbc:mysql://localhost:3306/hema"; 
		  Connection con=DriverManager.getConnection(url,userName,password);
		  Statement st=con.createStatement(); 
		
		  String sql="insert into registration values("+SNo+",'"+FirstName+"','"+LastName+"','"+Gender+"','"+Email+"','"+Password+"','"+PhoneNo+"','"+Address+"')"; 
		  st.executeUpdate(sql);
		  PrintWriter pw=response.getWriter();
		  pw.println("record is inserted...");
		  
		  }catch(Exception e) { e.printStackTrace(); }
		  
		  
		  
		 
	}

}
