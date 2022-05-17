package com.jobiak.java8;

import java.lang.reflect.Method;

interface Test{
	
	public void print();
	
}


interface Test2{
	
	public void add(int a,int b);
	
} 
public class TestLambdas{
	
	public static void main(String[] args) {
		
		Test test=()->{
			
			System.out.println("from print.....printing");
	};
		test.print();
		Test2 test2=(int a,int b)->{
			int c=a+b;
			System.out.println(c);
			
		};
		test2.add(10,20);
		
		Runnable r=new Runnable(){
			public void run()
			{
				System.out.println("from run method..");
				
			}
		};
		Thread thread=new Thread(r);
		thread.start();
		Runnable r1=()->{System.out.println("from()->run method...");};
		thread =new Thread(r1);
		thread.start();
		
		
	}
}