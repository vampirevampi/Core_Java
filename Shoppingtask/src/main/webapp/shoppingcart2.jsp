<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="ai.jobiak.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%!
private ArrayList<Product> getProductIds()
{
		String userName = "root";
		String password = "Hema@6594";
		String url = "jdbc:mysql://localhost:3306/world";
		Connection con=null;
		ArrayList<Product> productList=new ArrayList<>();
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

<% 
   double pr=0.0;
    int s=0;
	ArrayList<Product> itemsList=null;
		itemsList=getProductIds();
		
		for(int i=0;i<itemsList.size();i++){
			out.println("<a href='shoppingcart2.jsp?item="+itemsList.get(i).getProductId()+"'>Add Items:"+itemsList.get(i).getProductId()+"</a></br>");
			out.println("<a href='shoppingcart2.jsp?item="+"delID"+"'>Del Items  :"+itemsList.get(i).getProductId()+"</a></br>");
		
		}	
	     HttpSession shoppingcart1=request.getSession(); 
	 	ArrayList<Product> selectedItemsList=null;
	 	Product delID=null;
	 	
	     if(shoppingcart2.isNew()) {
	    	 selectedItemsList=new ArrayList<>(); 
		 shoppingcart2.setAttribute("items",selectedItemsList );
		 }
	     else if (request.getQueryString()!=null) 
	      {
			 String queryStr=request.getQueryString();
				String splitArray[]=queryStr.split("=");
				String ProductId=splitArray[1];
				
				
		   for(int i=0;i<itemsList.size();i++) {
			 
				      if(itemsList.get(i).getProductId().equals(ProductId)) {
				 		selectedItemsList=(ArrayList<Product>)shoppingcart2.getAttribute("items");
				 		selectedItemsList.add(itemsList.get(i));		
				 		     shoppingcart2.setAttribute("items", selectedItemsList);
				 		     
				 		  if(selectedItemsList!=null) 
				 	         for(Product p:selectedItemsList){
				 				out.println(p.getProductId()+"::"+p.getDescription()+"::"+p.getPrice()+"</br>");
				 				pr+=p.getPrice();
				 				s=selectedItemsList.size();
				 	         } 
				 		     break;
				 		     
				 		     
			   } 
				      
				      
				      else {
				    	  selectedItemsList=(ArrayList<Product>)shoppingcart2.getAttribute("items");
				    	   delID=itemsList.get(i);
				    	   selectedItemsList.remove(delID);
				      }
	      }
		   
	      }
	   
	     /* if(selectedItemsList!=null) 
         for(Product p:selectedItemsList){
			out.println(p.getProductId()+"::"+p.getDescription()+"::"+p.getPrice()+"</br>");
			pr+=p.getPrice();
			s=selectedItemsList.size();
		}   
	      */
%>
    <%

	     out.println("<h3>Items in the cart: "+s);//selectedItemsList.size()//
	     out.println("<h3>Total value of cart is: "+pr+"</br>");

	     %> 


</body>
</html>