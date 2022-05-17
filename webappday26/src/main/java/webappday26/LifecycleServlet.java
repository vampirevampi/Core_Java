package webappday26;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifecycleServlet implements Servlet {

	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			System.out.println("entered init()...");
			FileOutputStream fos=new FileOutputStream("Hello.txt");
			fos.write("this is added in init() to demonstrate the timing of the init method..".getBytes());
		    fos.close();
		    System.out.println("exiting init()...");
		}catch(IOException e) {
			e.printStackTrace();
			
		}

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.getWriter().println("this is from service()..");

	}
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			System.out.println("entered destroy()..");
			FileOutputStream fos=new FileOutputStream("Hello.txt");
			fos.write("this is added in destroy() to demonstrate the timing of the destroy method..".getBytes());
		    fos.close();
		    System.out.println("exiting destroy()..");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	

}
