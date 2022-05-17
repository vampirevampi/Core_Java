package ai.jobiak.streams;

public class C extends A{
	int b;
	String Name;
	public C(int a, String s, int b, String name) {
		super(a, s);
		this.b = b;
		Name = name;
	}
	@Override
	public String toString() {
		return "C [b=" + b + ", Name=" + Name + ", a=" + a + ", s=" + s + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	

}
