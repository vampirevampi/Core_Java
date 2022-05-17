package ai.jobiak.otherclasses;
 

public class TestAbstract {

	public static void main(String[] args) {
		Shape s=new Circle();
		s.circumference();
		s.circumference();
		s=new Cube();
		s.surface_area();
		s.volume();
		s=new Cuboid();
		s.surface_area();
		s.volume();
		s=new Cylinder();
		s.surface_area();
		s.volume();
		s=new Parallelogram();
		System.out.println("area of Parallelogram: "+s.area());
		System.out.println("perimeter of Parallelogram:"+s.perimeter());
		s=new Rectangle();
		System.out.println("area of Rectangle: "+s.area());
		System.out.println("perimeter of Rectangle:"+s.perimeter());
		s=new Rhombus();
		System.out.println("area of Rhombus: "+s.area());
		System.out.println("perimeter of Rhombus:"+s.perimeter());
		s=new Square();
		System.out.println("area of Square:"+s.area());
		System.out.println("perimeter of Square:"+s.perimeter());
		s=new Trapezium();
		System.out.println("area of Trapezium :"+s.area());
		System.out.println("perimeter of Trapezium :"+s.perimeter());
		s=new Triangle();
		System.out.println("area of Triangle :"+s.area());
		System.out.println("perimeter of Triangle :"+s.perimeter());
		
	
	}

}
