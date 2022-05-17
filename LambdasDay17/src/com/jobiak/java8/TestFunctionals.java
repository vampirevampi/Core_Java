package com.jobiak.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> lenghtFunction=(String str)->{return str.length();};
		int result=lenghtFunction.apply("jobiak.com");
		System.out.println(result);
	
Predicate<Boolean>predicate=(Boolean)->{return true;};
System.out.println(predicate.test(true));
	Consumer<String>consumer=(String str)->{System.out.println(str);};
	consumer.accept("jobiak.ai");
	}

}
