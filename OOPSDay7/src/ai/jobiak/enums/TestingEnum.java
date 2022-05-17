package ai.jobiak.enums;

public class TestingEnum {

	public static void main(String[] args) {
	  WeekDays wd=WeekDays.sunday;
	  switch(wd)
	  {
	  case sunday:System.out.println(wd+": holiday");
	  break;
	  case monday:System.out.println(wd+": working day");
	  break;
	  case tuesday:System.out.println(wd+": working day");
	  break;
	  case wednesday:System.out.println(wd+": working day");
	  break;
	  case thursday:System.out.println(wd+": working day");
	  break;
	  case friday:System.out.println(wd+": working day");
	  break;
	  case saturday:System.out.println(wd+": holiday");
	  break;
	  }
	  System.out.println("Date: "+WeekDays.sunday.date);
	 // Months m=Months.february;
	  if(Months.february.No_days==29)
	  {
		  System.out.println("feb has"+ Months.february.No_days+" days so 2022 is a leap year");
	  }
	  else
	  {
		  System.out.println("feb has "+Months.february.No_days+"so 2022 is not a leap year");
		  
	  }
	  
		System.out.println("Apple price: "+Mobile.Apple.price); 
		System.out.println("No of Dimonds is cards are: "+Cards.diamonds.num); 
		System.out.println("earth is the "+Planets.earth.order+" in the solar system"); 
		System.out.println("the level of measure is: "+Levels.high.measure);
		System.out.println("one season of india "+Seasons.rainy);
		System.out.println("Delhi is located in "+Directions.north+" India"); 
		
	}

}
