package ai.jobiak.enums;

public enum Planets {
 mercury(1),venus(2),earth(3),mars(4),jupiter(5),saturn(6),uranus(7),neptune(8);
	int order;
	Planets(int order)
	{
		this.order=order;
	}
}
