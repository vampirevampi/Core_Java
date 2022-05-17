package ai.jobiak.otherclasses;
import java.lang.Math;

public class Square extends Shape {
	int S_side=4;

	@Override
	public double area() {
		double area=Math.pow(S_side,2);
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter= 4*S_side;
		return perimeter;
	}

}
