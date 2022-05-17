package ai.jobiak.pacticeservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServlet
 */
@WebServlet("/config1")
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		
		  ServletConfig confi=getServletConfig(); 
		  String val1=confi.getInitParameter("val1"); 
		  String val2=confi.getInitParameter("val2");
		  pw.println(val1);
		  pw.println(val2);
		  
		  
		 
		  
		  int cv1=Integer.parseInt(request.getParameter("cn1")); int
		  cv2=Integer.parseInt(request.getParameter("cn2"));
		 

		RequestDispatcher rd=request.getRequestDispatcher("redirect");
		rd.forward(request, response);
		
		
	}

}
