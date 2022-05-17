package ai.jobiak.pacticeservlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/date")

public class PresentDate implements Servlet{
	
	ServletConfig config;
	
	public void init(ServletConfig config) {    //accepts a single parameter 
		this.config=config;
	}
	
	public void service(ServletRequest request,ServletResponse response) throws IOException {      
		
		PrintWriter pw=response.getWriter();
		pw.println("time: "+java.time.LocalDate.now());
	
		
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
	
