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
@WebServlet("/read")

/**
 * Servlet implementation class ReadServlet
 */
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int RollNo=Integer.parseInt(request.getParameter("rollno"));
		try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			  
			  String userName="root"; String password="Hema@6594"; 
			  String url="jdbc:mysql://localhost:3306/hema"; 
			  Connection con=DriverManager.getConnection(url,userName,password);
			  Statement st=con.createStatement();
			  String query="select * from marks where st_ID="+RollNo;
			  ResultSet rs=st.executeQuery(query);
			  rs.next();
				  PrintWriter pw=response.getWriter();
				  pw.println("................................");
				  pw.println("RollNO: "+rs.getInt(1));
				  pw.println("Name: "+rs.getString(2));
				  pw.println("Telugu: "+rs.getInt(3));
				  pw.println("English: "+rs.getInt(4));
				  pw.println("Maths: "+rs.getInt(5));
				  pw.println("Science: "+rs.getInt(6));
				  pw.println("Social: "+rs.getInt(7));
				  pw.println("Percentage: "+rs.getDouble(8));
				  pw.println("Grade: "+rs.getString(9));
				  pw.println("................................");
			  
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
