package inheritance.session4;

import java.time.LocalDateTime;

public class TestInheritance {

	public static void main(String[] args) {
		Residence_Address res=new Residence_Address("Sri Kodanda Rama","powercity","10-5-2022","123","lakshmi","Visakhapatnam");
		Residence_Address res1=new Residence_Address("BlueRay","parawada","16-5-2022","123","Heven","Visakhapatnam");
		Residence_Address res2=new Residence_Address("Nandini Residence","Kurmanpalem","16-5-2022","123","Sri Nilayam","Visakhapatnam");
		Residence_Address res3=new Residence_Address("Sri Kodanda Rama","powercity","19-5-2022","123","Nandini","Visakhapatnam");
		
		Office_Address off= new Office_Address("#12435","Hema","Vizag",3807896540L,"bluesky","B2cellar");
		Office_Address off1= new Office_Address("#12439","Latha","Vizag",3807896740L,"GreenLand","B2cellar");
		Office_Address off2= new Office_Address("#12434","Priya","Vizag",3807854540L,"Vuda Phase","B2cellar");
		Office_Address off3= new Office_Address("#12433","Lavanya","Vizag",3804006540L,"Vuda Phase","B2cellar");
		
	    Employee emp=new Employee(101,"Lalitha",LocalDateTime.now(),res,off);
	    Employee emp1=new Employee(102,"Sri",LocalDateTime.now(),res1,off1);
	    Employee emp2=new Employee(103,"Vineetha",LocalDateTime.now(),res2,off2);
	    Employee emp3=new Employee(104,"Chandu",LocalDateTime.now(),res3,off3);
	    System.out.println(emp);
	    System.out.println(emp1);
	    System.out.println(emp2);
	    System.out.println(emp3);
	}
	
}
  
