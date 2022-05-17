package ai.jobiak.pacticeservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class FirstGenericServlet
 */
@WebServlet("/generic")

public class FirstGenericServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int val1=Integer.parseInt(request.getParameter("val1"));
		int val2=Integer.parseInt(request.getParameter("val2"));
		int sum=val1+val2;
		PrintWriter pw=response.getWriter();
		pw.println("total sum is : "+sum);
	}

}
