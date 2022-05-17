package ai.jobiak.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Util{
	public Util()
	{
		System.out.println("from default cons()");
	}
	
	void method()
	{
		System.out.println("from instance method");
	}
	static void method2()
	{
		System.out.println("from static method");
	}
	
}

interface TestRef{
	void substitution();
}

public class TestOptional {

	public static void main(String[] args) {
		String str=null;
		String str2="hema";
		//Optional op=Optional.of(str);
		Optional op2=Optional.of(str2);
		System.out.println(op2.get());
		Optional op=Optional.ofNullable(str);
		//if(op.isPresent()) 
		System.out.println(op.orElse("string is empty"));
		//System.out.println(op.get());
		Util obj=new Util();
		TestRef ref=obj::method;  //instace method
		ref.substitution();
		
		TestRef ref2=Util::method2;  //static method
		ref2.substitution();
		
		TestRef ref3=Util::new;  //def constructor is called
		ref3.substitution();
		
		List<Integer> list=Arrays.asList(1,2,3,4,45,55);  // making code consized
		list.stream().forEach(System.out::println);
		
		
		

	}

}
