package ai.jobiak.pacticeservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/firstservlet")

public class FristServlet implements Servlet{
	
	ServletConfig config;
	
	public void init(ServletConfig config) {    //accepts a single parameter 
		this.config=config;
	}
	
	public void service(ServletRequest request,ServletResponse response) throws IOException {      //request obj gets the request from client and sends back the response
	//System.out.println("hello welcome to servlet");	                         //to client through response                        
		//prints in console   
		// pw is a class obj
		int ID=Integer.parseInt(request.getParameter("id")); //parsing
		String F_name=request.getParameter("fname");  //always reads String format so to convert it we should parse
		String L_name=request.getParameter("lname");
		String E_mail=request.getParameter("email");
		String Password=request.getParameter("password");
		
		
		
		PrintWriter pw=response.getWriter();
		pw.println("Hello"+" "+F_name+" "+"you're mail and password along with id is"+" "+E_mail+","+Password+","+ID); //ouput is printed in browser we can also use html tags here in " "
		
		}
	
	public void destroy() {
	}
	
	public ServletConfig getServletConfig() {
		return config;
		
	}
	
	public String getServletInfo() {        //to make this run we can manually add the content into web.xml file or we can use annotation
		                                    // like @WebServlet("url");
		return null;
	}
	
	}
	
