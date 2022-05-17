package ai.jobiak.webapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
        
        
        
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	

			String oper=request.getParameter("operator");
			int v1=Integer.parseInt(request.getParameter("val1"));
			int v2=Integer.parseInt(request.getParameter("val2"));
			switch(oper) {
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
