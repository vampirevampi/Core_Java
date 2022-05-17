
public class ChocolateArray {
	 public static void main(String[] args)
	    {
	        Chocolate c1=new Chocolate("Snickers",30,50);
	        Chocolate c2=new Chocolate("Barone",10,44);
	        Chocolate c3=new Chocolate("Dairy Milk Silk",197,150);
	        Chocolate c4=new Chocolate("Perk",10,30);
	        Chocolate c5=new Chocolate("KitKat",10,38);
	        Chocolate c6=new Chocolate("FerreroRocher",545,100);
	        Chocolate c7=new Chocolate("Gems",10,10);
	        Chocolate c8=new Chocolate("Mars",75,60);
	        Chocolate c9=new Chocolate("Toblerone",240,20);
	        Chocolate c10=new Chocolate("Munch",10,5);
	        
	        Chocolate c[]=new Chocolate[10];
	        c[0]=c1;
	        c[1]=c2;
	        c[2]=c3;
	        c[3]=c4;
	        c[4]=c5;
	        c[5]=c6;
	        c[6]=c7;
	        c[7]=c8;
	        c[8]=c9;
	        c[9]=c10;
	        float max=0.0f;
	        float min=0.0f;
	        int temp1=0,temp2=0;
	        for(int i=0;i<10;i++)
	        {
	        
	         if(max<c[i].getChocolatePrice())
	          {
	            max=c[i].getChocolatePrice();
	            temp1=i;
	          }
	          if(min>c[i].getChocolateWeight())
	          {
	              min=c[i].getChocolateWeight();
	              temp2=i;
	          }
	        }
	        
			
			  System.out.println("Chocolate with highest price: "+c[temp1].ChocolateName);
			  System.out.println("Price: "+c[temp1].ChocolatePrice);
			  System.out.println("Chocolate with least Weight: "+c[temp2].ChocolateName);
			  System.out.println("Weight: "+c[temp2].ChocolateWeight);
			 
	        
	    }

}
