package ai.jobiak.webapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DectoBin
 */
public class DectoBin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DectoBin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		int v1=Integer.parseInt(request.getParameter("val1"));
		int binary[]=new int[40];
		int index=0;
		while(v1>0)
		{
			binary[index++]=v1%2;
			v1=v1/2;
		}
		for(int i=index-1;i>0;i--) {
			
			response.getWriter().println(binary[i]);
			
			
		}
		
		
		
		
		
		
		
	}

}
