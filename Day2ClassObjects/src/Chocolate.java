
public class Chocolate {
	 String ChocolateName;
	   float ChocolatePrice;
	   float ChocolateWeight;
	   
	   
	   public Chocolate(String ChocolateName,float ChocolatePrice,float ChocolateWeight)
	   {
	       this.ChocolateName=ChocolateName;
	       this.ChocolatePrice=ChocolatePrice;
	       this.ChocolateWeight=ChocolateWeight;
	   }


	public String getChocolateName() {
		return ChocolateName;
	}


	public void setChocolateName(String chocolateName) {
		ChocolateName = chocolateName;
	}


	public float getChocolatePrice() {
		return ChocolatePrice;
	}


	public void setChocolatePrice(float chocolatePrice) {
		ChocolatePrice = chocolatePrice;
	}


	public float getChocolateWeight() {
		return ChocolateWeight;
	}


	public void setChocolateWeight(float chocolateWeight) {
		ChocolateWeight = chocolateWeight;
	}


	@Override
	public String toString() {
		return "Chocolate [ChocolateName=" + ChocolateName + ", ChocolatePrice=" + ChocolatePrice + ", ChocolateWeight="
				+ ChocolateWeight + "]";
	}


	
}
