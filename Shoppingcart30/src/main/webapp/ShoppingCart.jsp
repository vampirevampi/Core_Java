<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util. *" import="java.io. * " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
public class Product {

	

	private String productId;
	private String description;
	private double price;
	
public Product() {
	
}

public Product(String productId, String description, double price) {
	super();
	this.productId = productId;
	this.description = description;
	this.price = price;
}

public String getProductId() {
	return productId;
}

public void setProductId(String productId) {
	this.productId = productId;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Product [productId=" + productId + ", description=" + description + ", price=" + price + "]";
}
}

%>
<%
for(int i=1;i<=10;i++) {
out.println("<a href = 'shoppingcart.jsp?item="+i+"'>Add Items</a><br>");


}
String quertString = request.getQueryString();
String productId=null;

//out.println(quertString);
if(quertString!=null)
{
String splitArray[]=quertString.split("=");
 productId=splitArray[1];

}
ArrayList<Product>itemList = null;

HttpSession shoppingCart = request.getSession();

if(shoppingCart.isNew()) {
itemList = new ArrayList<>();

shoppingCart.setAttribute("items", itemList);


}
else {
	if(itemList!=null)
	{
	itemList = (ArrayList<Product>)shoppingCart.getAttribute("items");
	itemList.add( new Product(productId, "Laptop",87000));
	
	shoppingCart.setAttribute("items", itemList);
	}
	
}
if(itemList!=null)
{

for(Product product : itemList) {
	out.println(" "+product.getProductId()+"::"+product.getDescription()+"<br>");
}
out.println(" No of items in cart"+itemList.size());
}


%>
</body>
</html>