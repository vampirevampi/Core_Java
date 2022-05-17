package ai.jobiak.state;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter out=response.getWriter();
	int count=0;
	int begining=0;
	if(begining==0) {
		Cookie counterCookie=new Cookie("visit",count+"");
		response.addCookie(counterCookie);
		begining++;
	}
		Cookie cookies[]=request.getCookies();
		if(cookies!=null) {
			System.out.println(cookies[0]);
			for(int i=0;i<cookies.length;i++) {
				if(cookies[i].getName().equals("visits")) {
					int cookieCounter=Integer.parseInt(cookies[i].getValue());
					System.out.println(cookieCounter);
					count=++cookieCounter;
				}
			}
			
			
			Cookie counterCookie=new Cookie("visits",count+"");
			response.addCookie(counterCookie);
			out.println("<h2>count="+count+"</h2>");
		}
	
	
	}

}
