package ai.jobiak.enums;

public enum Levels {
	high(1),medium(0.5f),low(0);
	float measure;
	Levels(float measure)
	{
		this.measure=measure;
	}

}
