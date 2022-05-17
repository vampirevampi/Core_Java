package ai.jobiak.otherclasses;

public class Rhombus extends Shape {
	double r_diagnol1=15;
	double r_diagnol2=15;
	int r_side=39;

	@Override
	public double area() {
		double area=(r_diagnol1*r_diagnol2)/2;
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter=4*r_side;
		return perimeter;
	}

}
