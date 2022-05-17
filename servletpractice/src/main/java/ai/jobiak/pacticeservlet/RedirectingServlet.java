package ai.jobiak.pacticeservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectingServlet
 */
@WebServlet("/redirect")
public class RedirectingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		System.out.println("print");
		int v1=Integer.parseInt(request.getParameter("cn1"));
		int v2=Integer.parseInt(request.getParameter("cn2"));
		String op1=request.getParameter("op");
		
		switch(op1) {
		case "+":
			int sum=v1+v2;
			response.getWriter().println("The sum of two numbers is "+sum);
		break;
		case "-":
			int sub=v1-v2;
			response.getWriter().println("The Difference of two numbers is "+sub);
			break;
		case "*":
			long mul=v1*v2;
			response.getWriter().println("The Multiplication of two numbers is "+mul);
			break;
		case "/":
			double div=v1/v2;
			response.getWriter().println("The Division of two numbers is "+div);
			break;
		case "^":
			double exp=Math.pow(v1, v2);
			response.getWriter().println("The Exponential of two numbers is "+exp);
			break;
			
		
		}
			
			
		}
		
	

	
		
	}


