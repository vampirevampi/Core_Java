package ai.jobiak.task;

import java.util.ArrayList;
import java.util.Scanner;

public class BallsSegregation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int Rcount=0;
	ArrayList<String> list=new ArrayList<>(n);
    for(int i=1;i<=n;i++)
    {
    	String j=sc.nextLine();
    	list.add(j);
    	
    }
    System.out.println("....");
     String color=sc.nextLine();
     for(int i=0;i<list.size();i++) {
    	 if(color.equals(list.get(i))) {
    		 Rcount=Rcount+1;
    		 
    	 }
    	 
     }
     System.out.println(color+"="+Rcount);
    
		
	}

}
