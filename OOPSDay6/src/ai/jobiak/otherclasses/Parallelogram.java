package ai.jobiak.otherclasses;

public class Parallelogram extends Shape {
	int P_base=12;
	int P_height=7;
	int P_side=5;

	@Override
	public double area() {
		double area=P_base*P_height;
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter=2*(P_side+P_base);
		return perimeter;
	}

}
