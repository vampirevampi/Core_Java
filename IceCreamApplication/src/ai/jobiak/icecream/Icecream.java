package ai.jobiak.icecream;

public class Icecream {
  String Brand;
  String Flavour;
  boolean Sugarfree;
  double Weight;
  int Rating;
  double Cost;
  int count;
  String Description;
  
  
  public String getBrand() {
	return Brand;
}


public void setBrand(String brand) {
	Brand = brand;
}


public String getFlavour() {
	return Flavour;
}


public void setFlavour(String flavour) {
	Flavour = flavour;
}


public boolean isSugarfree() {
	return Sugarfree;
}


public void setSugarfree(boolean sugarfree) {
	Sugarfree = sugarfree;
}


public double getWeight() {
	return Weight;
}


public void setWeight(double weight) {
	Weight = weight;
}


public int getRating() {
	return Rating;
}


public void setRating(int rating) {
	Rating = rating;
}


public double getCost() {
	return Cost;
}


public void setCost(double cost) {
	Cost = cost;
}


public int getCount() {
	return count;
}


public void setCount(int count) {
	this.count = count;
}


public String getDescription() {
	return Description;
}


public void setDescription(String description) {
	Description = description;
}




public Icecream(String brand, String flavour, boolean sugarfree, double weight, int rating, double cost, int count,
		String description) {
	super();
	Brand = brand;
	Flavour = flavour;
	Sugarfree = sugarfree;
	Weight = weight;
	Rating = rating;
	Cost = cost;
	this.count = count;
	Description = description;
}


public void addtoCart() {
  
  
	}
}