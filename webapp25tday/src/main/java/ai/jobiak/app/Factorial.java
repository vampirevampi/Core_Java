package ai.jobiak.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class Factorial implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

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
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=res.getWriter();
		 
		 int n=5;
		 int fact=1;
		 for(int i=1;i<=n;i++)
		 {
			 fact*=i;
			 
		 }
	        out.println("The factorial of 5 is "+fact);
	        ArrayList<String> list=new ArrayList<>();
	        list.add("Red");
	        list.add("Blue");
	        list.add("Orange");
	        for(String color:list) {
	        	
	        out.println(color+"::"+color.length());
	        
	       
	        }
	        
	        HashMap<String,String> techInventers=new HashMap();
	        techInventers.put("Java","James Gosling");
	        techInventers.put("Cpp","Bjarne Stroustup");
	        techInventers.put("C","Dennis Ritchie");
	        techInventers.put("Linux","Linus Travold");
	        out.println(techInventers);
	        Set<String> keys=techInventers.keySet();
	        for(String key:keys) {
	        	out.println(techInventers.get(key)+" lenth of value is : "+techInventers.get(key).length());
	        }
	        
	      
	        
	        
	  
	        

	}

}
