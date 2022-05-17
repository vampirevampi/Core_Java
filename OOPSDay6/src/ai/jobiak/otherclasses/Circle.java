package ai.jobiak.otherclasses;
import java.lang.Math;

public class Circle extends Shape {
	int C_radius=4;
	

	@Override
	public double area() {
		double area=Math.PI*(Math.pow(C_radius, C_radius));
		return area;
	}
	public void circumference()
	{
		double circumference=2*Math.PI*C_radius;
    	System.out.println("circle circumference: "+circumference);
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}


}
