package ai.jobiak.enums;

public enum WeekDays {
	sunday("2/2/2022"),monday,tuesday("4/2/2022"),wednesday("5/2/2022"),thursday("6/2/2022"),friday("7/2/2022"),saturday("8/2/2022");
	String date;
	WeekDays(String date)
	{
		this.date=date;
	}
	WeekDays()
	{
		date="3/2/2022";
		
	}

}
