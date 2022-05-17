package ai.jobiak.otherclasses;

public class Trapezium extends Shape {
	int Tr_side1=12;
	int Tr_side2=16;
	int Tr_height=10;
	int Tr_side3=8;
	int Tr_side4=8;

	@Override
	public double area() {
		double area=((Tr_side1+Tr_side2)*Tr_height)/2;
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter=Tr_side1+Tr_side2+Tr_height+Tr_side3+Tr_side4;
		return perimeter;
	}

}
