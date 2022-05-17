package ai.jobiak.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class ShoppingCartServlet
 */
@WebServlet("/cart3")
public class ShoppingCartServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws SQLException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
  private String[] getProductIds() throws SQLException {  
    String url="jdbc:mysql://localhost:3306/world";
	String uname="root";
	String pass="Hema@6594";
	String productIds[]=new String[10];
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection	con = DriverManager.getConnection(  
				url,uname,pass);

	String selectSQL="select Brand from mobiles";
	
	Statement	st = con.createStatement();
		ResultSet rs1 = st.executeQuery(selectSQL);
		int i=0;
		while(rs1.next())
		{
			productIds[i]=rs1.getString(1);
			i++;
		}
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	

	
	return productIds;

    
  }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String productIds[] = null;
		try {
			productIds = getProductIds();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//int n;
		response.setContentType("text/html");
		for(int i=0;i<productIds.length;i++) {
		out.println("<a href = 'cart3?item="+productIds[i]+"'>Add Items " +productIds[i]+"</a><br>");
		
		
		}
		String quertString = request.getQueryString();
		//out.println(quertString);
		String splitArray[]=quertString.split("=");
		String productId=splitArray[1];
		
		
		ArrayList<Product>itemList = null;
		
		HttpSession shoppingCart = request.getSession();
		
		if(shoppingCart.isNew()) {
		itemList = new ArrayList<>();
		
		shoppingCart.setAttribute("items", itemList);
		
		
		}
		else {
			
			itemList = (ArrayList<Product>)shoppingCart.getAttribute("items");
			itemList.add( new Product(productId, "Laptop",50000));
			//itemList.add(p);
			shoppingCart.setAttribute("items", itemList);
			
			
		}
		for(Product product : itemList) {
			out.println(" "+product.getProductId()+"::"+product.getDescription()+"<br>");
		}
		out.println("<h3> No of items in cart </h3>"+itemList.size());
		}

}package ai.jobiak.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class ShoppingCartServlet
 */
@WebServlet("/cart3")
public class ShoppingCartServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws SQLException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
  private String[] getProductIds() throws SQLException {  
    String url="jdbc:mysql://localhost:3306/world";
	String uname="root";
	String pass="Hema@6594";
	String productIds[]=new String[10];
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection	con = DriverManager.getConnection(  
				url,uname,pass);

	String selectSQL="select Brand from mobiles";
	
	Statement	st = con.createStatement();
		ResultSet rs1 = st.executeQuery(selectSQL);
		int i=0;
		while(rs1.next())
		{
			productIds[i]=rs1.getString(1);
			i++;
		}
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	

	
	return productIds;

    
  }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String productIds[] = null;
		try {
			productIds = getProductIds();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//int n;
		response.setContentType("text/html");
		for(int i=0;i<productIds.length;i++) {
		out.println("<a href = 'cart3?item="+productIds[i]+"'>Add Items " +productIds[i]+"</a><br>");
		
		
		}
		String quertString = request.getQueryString();
		//out.println(quertString);
		String splitArray[]=quertString.split("=");
		String productId=splitArray[1];
		
		
		ArrayList<Product>itemList = null;
		
		HttpSession shoppingCart = request.getSession();
		
		if(shoppingCart.isNew()) {
		itemList = new ArrayList<>();
		
		shoppingCart.setAttribute("items", itemList);
		
		
		}
		else {
			
			itemList = (ArrayList<Product>)shoppingCart.getAttribute("items");
			itemList.add( new Product(productId, "Laptop",50000));
			//itemList.add(p);
			shoppingCart.setAttribute("items", itemList);
			
			
		}
		for(Product product : itemList) {
			out.println(" "+product.getProductId()+"::"+product.getDescription()+"<br>");
		}
		out.println("<h3> No of items in cart </h3>"+itemList.size());
		}

}