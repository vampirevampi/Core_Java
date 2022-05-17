package ai.jobiak.otherclasses;
import java.lang.Math;

public class Cylinder extends Shape {
	double radius=6;
	double height=12;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void surface_area()
	{  
	double area=2*Math.PI*radius*height+Math.PI*Math.pow(radius, 2);
	System.out.println("Surface area of Cylinder: "+area);
		
	}
	public void volume()
	{  
	double volume=Math.PI*Math.pow(radius, 2)*height;
	System.out.println("Volume of Cylinder: "+volume);
		
	}

}
