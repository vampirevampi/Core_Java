package ai.jobaik.streams;

import java.util.ArrayList;

public class Employeemain {
	public static void main(String args[]) {
		Employee emp1=new Employee(1,"Hema",45000.00);
		Employee emp2=new Employee(2,"Lavanya",55000.00);
		Employee emp3=new Employee(3,"Sushmitha",50000.00);
		Employee emp4=new Employee(4,"Hemima",65000.00);
		ArrayList<Employee>emplist=new ArrayList<>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.stream().filter(emp->emp.salary>50000.00).forEach(emp->System.out.println(emp.id+" "+emp.name+" "+emp.salary));
		
		
	}

}
