package ai.jobiak.cart;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/cart1")
public class ShoppingCartServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		for(int i=1;i<=10;i++) {
		out.println("<a href='cart1?item="+i+"'>Add Item="+i+"</a><br>");
		}
		String queryStr=request.getQueryString();
		//System.out.println(queryStr);
		String splitArray[]=queryStr.split("=");
		String productId=splitArray[1];
		//System.out.println(productId);
		ArrayList<Product>itemsList=null;
		HttpSession shoppingCart=request.getSession();
		
		if(shoppingCart.isNew()) {
			itemsList=new ArrayList<>();
			shoppingCart.setAttribute("items",itemsList);
			
		}else {
			itemsList=(ArrayList<Product>)shoppingCart.getAttribute("items");
			itemsList.add(new Product(productId,"abc",79.00));
			shoppingCart.setAttribute("items", itemsList);
		}
	
		for(Product p: itemsList) {
			out.println(p.getProductId()+"::"+p.getDescription()+"::"+p.getPrice()+"<br/>");
		}
		out.println("<h3>Items in the cart: "+itemsList.size());
			}
		
		
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
