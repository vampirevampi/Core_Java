package ai.jobiak.com;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	

	public static void main(String[] args) {
		Student s=new Student();
		s.name="hema";
		s.age=21;
		
		Student s1=new Student();
		s1.name="lavanya";
		s1.age=20;
		
		Student s2=new Students();
		s2.name="Latha";
		s2.age=23;
		
	    ArrayList <Student> list=new ArrayList<>(); 
		list.add(s);
		list.add(s1);
		list.add(s2);
		System.out.println("before using comparable");
		System.out.println("age name");
		list.forEach(x->{System.out.println(x.age+" "+x.name);});
		
		// they can be sorted based on name or age
		Collections.sort(list);
		System.out.println("after sorting ....");
		System.out.println("age name");
		list.forEach(x->{System.out.println(x.age+" "+ x.name);});
		
		
		
		
		
	}

}
