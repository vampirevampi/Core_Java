package ai.jobiak.otherclasses;

public class Cuboid extends Shape {
	int lenght=4;
	int width=2;
	int Height=2;

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
		long area=2*(lenght*width*Height);
		System.out.println("Surface area of cuboid: "+area);
	}
	public void volume()
	{
		long volume=lenght*width*Height;
		System.out.println("volume of cuboid: "+volume);		
	}

}
