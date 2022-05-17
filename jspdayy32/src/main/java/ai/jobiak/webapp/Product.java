package ai.jobiak.webapp;



public class Product {
	private String ProductId;
	private String description;
	private double price;
	public Product() {
		
	}
	public Product(String productId, String description, double price) {
		this.ProductId = productId;
		this.description = description;
		this.price = price;
	}
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		this.ProductId = productId;
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
		return "Product [productId=" + ProductId + ", description=" + description + ", price=" + price + "]";
	}
	

}