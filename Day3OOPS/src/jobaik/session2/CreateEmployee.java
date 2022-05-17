package jobaik.session2;

import java.time.LocalDateTime;

public class CreateEmployee
{
	public static void main(String[] args)
 {
	 Address res1=new Address("156","Jublihills","Hyderabad");
	 Address off1=new Address("157","Gachibowli","Hyderabad");
	 Address com1=new Address("158","Gajuwaka","Visakhapatnam");
	 
	 Address res2=new Address("159","Charminar","Hyderabad");
	 Address off2=new Address("160","Kurmanpalem","Visakhapatnam");
	 Address com2=new Address("161","NAD","Visakhapatnam");
	 
	 Address res3=new Address("189","Jublihills","Hyderabad");
	 Address off3=new Address("100","Kurmanpalem","Visakhapatnam");
	 Address com3=new Address("151","Madhurvada","Visakhapatnam");
	 
	 Address res4=new Address("199","Attapur","Hyderabad");
	 Address off4=new Address("140","Kurmanpalem","Visakhapatnam");
	 Address com4=new Address("121","Steel Plant","Visakhapatnam");
	 
	 Employee emp1=new Employee(501,"Ram",LocalDateTime.now(),res1,off1,com1,1);
	 Employee emp2=new Employee(502,"Latha",LocalDateTime.now(),res2,off2,com2,1);
	 Employee emp3=new Employee(503,"Hema",LocalDateTime.now(),res3,off3,com3,2);
	 Employee emp4=new Employee(504,"Lavanya",LocalDateTime.now(),res4,off4,com4,2);
			 

	 System.out.println(emp1);
	 System.out.println(emp2);
	 System.out.println(emp3);
	 System.out.println(emp4);
	 Employee.setManagerID(123);
	 System.out.println(Employee.managerID);
	 
	 
	
	
			
 }
}