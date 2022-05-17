<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="ai.jobiak.webapp.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%!
private ArrayList<Product> getProductIds()
{
		String userName = "root";
		String password = "Hema@6594";
		String url = "jdbc:mysql://localhost:3306/hema";
		Connection con=null;
		ArrayList<Product> productList=new ArrayList<Product>();
		try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				 con = DriverManager.getConnection(url,userName, password);
					Statement st=con.createStatement();
					String sql="select *from products";
					ResultSet rs=st.executeQuery(sql);
	while(rs.next())
	{
	Product p=new Product(rs.getString(1),rs.getString(2),rs.getDouble(3));
	productList.add(p);
	} 
	}catch (Exception e) { 
		 e.printStackTrace(); 
		 }
		finally {
			if(con!=null){
				try{
					con.close();
				}catch (Exception e) { 
					 e.printStackTrace(); 
					 }
			}
		}
		return productList;
	}
%>
	<hr/>
<% 
	ArrayList<Product> itemsList=null;
		itemsList=getProductIds();
	
		for(int i=0;i<itemsList.size();i++){
			out.println("<a href='shoppingCart.jsp?item="+itemsList.get(i).getProductId()+"'>Add Items  :"+itemsList.get(i).getProductId()+"</a></br>");
		}	
	     HttpSession shoppingCart=request.getSession(); 
	 	ArrayList<Product> selectedItemsList=null;
	     if(shoppingCart.isNew()) {
	    	 selectedItemsList=new ArrayList<Product>(); 
		 shoppingCart.setAttribute("items",selectedItemsList );
		 }
	     else if (request.getQueryString()!=null) //to avoid NullPointer Exception
	      {
			 String queryStr=request.getQueryString();
				String splitArray[]=queryStr.split("=");
				String ProductId=splitArray[1];
	      
		   for(int i=0;i<itemsList.size();i++) {
			   if(itemsList.get(i).getProductId().equals(ProductId)) {
		selectedItemsList=(ArrayList<Product>)shoppingCart.getAttribute("items");
		selectedItemsList.add(itemsList.get(i));		
		     shoppingCart.setAttribute("items", selectedItemsList);
	     break;
			   }
	      }
	      }
	     if(selectedItemsList!=null) //to avoid NullPointer Exception
	     {	
	    	 double sum=0;
 for(Product p:selectedItemsList){
	        sum=sum+p.getPrice();
			out.println(p.getProductId()+"::"+p.getDescription()+"::"+p.getPrice()+"</br>");
			  
		}
         out.println("<h3> total sum of price"+sum);
	     }
	     
	     
 
%>	    
<hr/>

<%
		out.println("<h3>Total Items in the cart"+selectedItemsList.size());
      
%>
</body>
</html>