package ai.jobiak.counter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CounterServlet
 */
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CounterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		int counter=1;
		if (session.isNew())
			
		{
			
			session.setAttribute("visits", counter + "");

		}
		
		else
		{
			String counterStr=(String)session.getAttribute("visits");
		counter=Integer.parseInt(counterStr);
		counter++;
		session.setAttribute("visits", counter+"");  //1.the user identity or token 2. it could be shopping cart
			
		}
		response.setContentType("text/html");
		out.println(counter+"<h3> times you visited.."+"</h3>");
		out.println("<h3>SessionId"+session.getId()+"</h3>");
		out.println("<h3>SessionMaxIntervel"+session.getMaxInactiveInterval()+"</h3>");
		out.println("<h3>Last Access Time"+session.getLastAccessedTime()+"</h3>");
		out.println("<h3><a href='signout'>Signout</a>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { // TODO Auto-generated
		 * method stub doGet(request, response); }
		 */

}
