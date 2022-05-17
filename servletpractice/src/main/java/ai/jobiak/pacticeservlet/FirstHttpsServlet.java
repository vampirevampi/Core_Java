package ai.jobiak.pacticeservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/http")
public class FirstHttpsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //instead of service we can use 
		                                                                                                                   //use doPost() ...doGet() both can be used
		
		int val1=Integer.parseInt(request.getParameter("val1"));
		int val2=Integer.parseInt(request.getParameter("val2"));
		int sum=val1+val2;
		PrintWriter pw=response.getWriter();
		pw.println("total sum is : "+sum);
		
		RequestDispatcher rd=request.getRequestDispatcher("");
		rd.forward(request, response);
		
	}

}
