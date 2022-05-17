package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TestStreams {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<>();
		list.add("Apple"); list.add("Banana"); list.add("Almond"); list.add("Orange");
		
		List<String>letterBList=list.stream().map(e->(e.concat("hello"))).collect(Collectors.toList());
		 System.out.println(letterBList);
		 
		        List list1=new ArrayList();
		 		
		 		list1.add(200);
		 		list1.add(122);
		 		list1.add(22);
		 		list1.add(22);
		 		
		 		
		 	list1.stream().distinct().forEach(System.out::println);

		 	}

		 

	}

