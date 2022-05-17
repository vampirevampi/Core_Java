package ai.jobiak.otherclasses;

public class Triangle extends Shape {
	
	int side1=12;
	int side2=6;
	int base=14;
	int height=5;

	@Override
	public double area() {
		double area=(base*height)/2;
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter=base*side1+side2;
		return perimeter;
	}

}
