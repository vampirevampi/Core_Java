package ai.jobiak.otherclasses;
import java.lang.Math;

public class Cube extends Shape {
    int Cb_side=4;
   
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
		double Surface_area=6*Math.pow(Cb_side,2);
		System.out.println("Surface_area of cube: "+Surface_area);
	}
	public void volume()
	{
		double volume=Math.pow(Cb_side, 3);
		System.out.println("Volume of cube: "+volume);
	}
	
	

}
