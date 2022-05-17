package ai.jobiak.otherclasses;

public class Rectangle extends Shape {
	
	int R_length=12;
	int R_breath=6;

	@Override
	public double area() {
		double area=R_length*R_breath;
		return area;
	}

    @Override
	public double perimeter() {

		double perimeter=2*(R_length*R_breath);
		return perimeter;
	}

}
