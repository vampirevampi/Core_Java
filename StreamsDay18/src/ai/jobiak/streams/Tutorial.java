package ai.jobiak.streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

import java.util.stream.IntStream;


public class Tutorial {

public static void main(String[] args) throws IOException {

System.out.println("---------------Example 1----------");
IntStream.range(1, 10).forEach(System.out::print);
System.out.println();
;

System.out.println("---------------Example 1.1----------");

IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));

System.out.println("---------------Example 2----------");

/*
* IntStream.range(1, 10) .skip(4) .sum() // terminal statement cannot
* be followed by anything .forEach(System.out::print);
*/

Integer in = IntStream.range(1, 10).skip(4).sum(); // or
System.out.println(IntStream.range(1, 10).skip(4).sum());

System.out.println("---------------Example 3----------");

Stream.of("Mango", "Berry", "Tango", "Cherry", "Leach", "blackberry").sorted().findFirst()
.ifPresent(System.out::print);
System.out.println();

System.out.println("---------------Example 4----------");

Stream.of("Mango", "Berry", "Tango", "Cherry", "Leach", "blackberry").map(String::toLowerCase).sorted()
.filter(x -> x.endsWith("go"))
// .ifPresent(System.out::print);
.sorted().forEach(System.out::print);
System.out.println();

System.out.println("---------------Example 5----------");

String colors[] = { "orange", "pink", "yellow", "green", "blue", "black" };
Stream<String> stream = Arrays.stream(colors);
Arrays.stream(colors).filter(x -> x.startsWith("b")).sorted().forEach(System.out::print);

System.out.println();

System.out.println("---------------Example 6----------");

Arrays.stream(new int[] { 2, 4, 6, 8 }).map(x -> x * x).average().ifPresent(System.out::print);

System.out.println("\n---------------Example 7----------");

List<String> people = Arrays.asList("Tom", "dick", "harry", "whinny", "poo", "bugs");

people.stream().map(String::toLowerCase).forEach(System.out::println);

System.out.println("\n ---------------Example 8 Reading from files using Stream----------");

Stream<String> bands = Files.lines(Paths.get("C:/Users/Fresher/Downloads/bands.txt"));

bands.sorted().filter(x -> x.length() > 1).forEach(System.out::println);

bands.close();

System.out.println("\n---------------Example 9 Reading from files using Stream and collecting----------");

//@SuppressWarnings("unchecked")
List<String> list = (List<String>) Files.lines(Paths.get("C:/Users/Fresher/Downloads/bands.txt")).filter(x -> x.contains("es"))
.collect(Collectors.toList());

list.forEach(System.out::println);

System.out.println(
"\n---------------Example 10 Reading from , seperated file using Stream and using count func ----------");

Stream<String> stream2 = Files.lines(Paths.get("C:/Users/Fresher/Downloads/data2.txt"));
int rowCount = (int) stream2.map(x -> x.split(",")).filter(x -> x.length == 3).count();
System.out.println(rowCount);

System.out.println(
"\n---------------Example 11 Reading from , seperated file using Stream and compare the value of col 2 > 15----------");

Stream<String> rows = Files.lines(Paths.get("C:/Users/Fresher/Downloads/data2.txt"));
rows.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[2]) > 15)
.forEach(x -> System.out.println(x[0] + ":" + x[1] + " : " + x[2]));

System.out.println(
"\n---------------Example 12 Reading from , seperated file using Stream and compare the value of col 2 > 15 and store in Map----------");

stream = Files.lines(Paths.get("C:/Users/Fresher/Downloads/data2.txt"
		));
Map<String, Integer> map = new HashMap<>();
map = stream.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[2]) > 15)
.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[2])));
stream.close();

for (String key : map.keySet()) {

System.out.println(key + " and " + map.get(key));
}

// TO CONVERT A MAP TO STREAM<Map.Entry<K,V>>

Stream mapStream = map.entrySet().stream();

mapStream.forEach(System.out::println);
/*
* b=20 c=19 d=18
*/
// To convert a Map to Key stream

Stream keyStream = map.keySet().stream();
keyStream.forEach(System.out::println);

// To convert a Map to values stream

Stream valueStream = map.values().stream();
valueStream.forEach(System.out::println);

System.out.println("\n---------------Example 13 Reduction sum----------");
Double total = Stream.of(9.3, 1.5, 4.8).reduce(0.0, (Double a, Double b) -> (a + b));
System.out.println(total);

System.out.println("\n---------------Example 14 Reduction summary statistics----------");


IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
System.out.println(summary);

}

}

 class Tutorial1 {
	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<String>();
		list.add("Hello");
		list.add("HOla");
		list.add("Banjure");
		list.add("Buneos Dias");
		Iterator<String>itr=list.iterator();
		
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
			
		}
		
		list.stream().forEach(System.out::println);
		Consumer<String> consumer=(String str)->{System.out.println(str);};
		list.stream().forEach(consumer);
		long count=list.stream().count();
		System.out.println(count);
		List<String>letterBlist=list.stream().filter(e->(e.charAt(0)=='B')).collect(Collectors.toList());
		System.out.println(letterBlist);
	   list.stream();
	   
	   // filter method()---even num
	   System.out.println("----------prints even number---------");
	   
	   List<Integer> ar=new ArrayList<Integer>();
	   ar.add(2);
	   ar.add(4);
	   ar.add(5);
	   ar.add(2);
	   ar.add(10);
	   List<Integer> ar1=new ArrayList<Integer>();
	  ar1=ar.stream().filter(n->n%2==0).collect(Collectors.toList());
	   System.out.println(ar1);
	   System.out.println();
	   
	   //forEach()-prints value directly after filter()
	   System.out.println("---------printing value directly after fliter method---------");
	   
	   ar.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	   
	   //replacing the lambda expression to print output
	   
	   ar.stream().filter(n->n%2==0).forEach(System.out::println);
	   
	   // multiple conditions in filter()
	   System.out.println("----------multiple conditions in filter method---------");
	   
	   List<String>name=Arrays.asList("hemaLatha","anusha","vikas","vijay","lavanya");
	   System.out.println(name.stream().count()); // prints 5
	   List<String>longnames=new ArrayList<String>();
	   longnames= name.stream().filter(str->str.length()>6&&str.length()<8).collect(Collectors.toList());
	   System.out.println(longnames);
	   System.out.println();
	   System.out.println();
	   
	   //passing Object type in filter() method and forEach() method
	   System.out.println("----------filter method and forEach method---------");
	   
	   List<Employee>Ar2=new ArrayList<Employee>();
	   Ar2.add(new Employee("Hema",25000,"Vizag"));
	   Ar2.add(new Employee("Latha",55000,"Vizag"));
	   Ar2.add(new Employee("Lavanya",75000,"Hyd"));
	   Ar2.stream().filter(p->p.salary>50000).forEach(p->System.out.println(p.name));
	   
	   // using map() method and collect() method
	   System.out.println("----------using map method and collect method---------");
	   
	   List<String>ar3=new ArrayList<String>();
	   ar3=name.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
	   System.out.println();
	   System.out.println(ar3);
	   
	   // finding length of Strings in the list using map method
	   System.out.println("----------using map method and finding lenght---------");
	 
	
	   name.stream().map(n->n.length()).forEach(System.out::println);
	   
	   // sorted () method
	   System.out.println("----------sorted method---------");
	   List<Integer> result=new ArrayList<Integer>();
	   
	   result=ar.stream().sorted().collect(Collectors.toList());
	   System.out.println();
	   System.out.println(result);
	   
	   //reduce() method
	   System.out.println("----------reduce method---------");
	   System.out.println();
	   
	   int evenSum=ar.stream().filter(n->n%2==0).reduce(0,(ans,i)->ans+i);
	   System.out.println(evenSum);
	   
	   //findFirst
	   System.out.println("----------findFirst method---------");
	   System.out.println();
	   name.stream().filter(p->p.matches("vikas")).findFirst().ifPresent(System.out::print);
	   System.out.println();
	   System.out.println();
	   
	   
	  // toArray()
	   System.out.println("----------toArray method---------");
	   
	List<String> sr=Arrays.asList("a","b","c");
	Object[] arr=sr.stream().toArray();
	System.out.println(arr.length);
	   
	   //map()
	System.out.println("----------map method---------");
	   
	   ar.stream().map(n->n*3).forEach(System.out::println);
	   
	   
	   //filter()->map()
	   System.out.println("----------filter method and map method---------");
    	   List<Integer> Ar5=new ArrayList<Integer>();
	 Ar5=  Ar2.stream().filter(e->e.salary>50000).map(e->e.salary).collect(Collectors.toList());
	 System.out.println(Ar5);
	 
	//flatMap() - when you have complex data
	 System.out.println("----------flatMap method---------");
	 
	 
	 List<Integer>l1=Arrays.asList(1,2);
	 List<Integer>l2=Arrays.asList(3,4);
	 List<Integer>l3=Arrays.asList(5,6);
	 List<List<Integer>>finalList=Arrays.asList(l1,l2,l3);
	
	 List<Integer>l4 = finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
	 System.out.println(l4);
	   
	 // distinct()
	 System.out.println("----------distinct method---------");
	 
	List<Integer> distinctObj=ar.stream().distinct().collect(Collectors.toList());
	System.out.println(distinctObj);
	
	//count() 
	System.out.println("----------count method---------");
	
	System.out.println(distinctObj.stream().count());
	
	//limit()
	System.out.println("----------limit method---------");
	
	name.stream().limit(3).forEach(System.out::println);
	
	//min()
	System.out.println("----------min method---------");
	Optional<Integer>min= ar.stream().min((val1,val2)->{
		return val1.compareTo(val2);
	});
	System.out.println(min.get());
	
	// reduce()--combines into single object
	System.out.println("----------reduce method---------");
	
	List<String> strlist=Arrays.asList("a","b","c","d");
	Optional<String> reduce=strlist.stream().reduce((val1,val2)->{return val2+val1;});
	System.out.println(reduce.get());
	
	//sorted()
	System.out.println("----------sorted method---------");
	List<Integer> AR=Arrays.asList(3,4,1,8,3);
	List<Integer> sortedlist=AR.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist); //ascending order
	
	
	List<Integer> sortedlist1=AR.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(sortedlist1);  //descending order
	
	
	// anyMatch()
	System.out.println("----------anyMatch method---------");
boolean b=list.stream().anyMatch(value->{return value.startsWith("He");});
System.out.println(b);


//allMatch()
System.out.println("----------allMatch method---------");
boolean C=list.stream().allMatch(value->{return value.startsWith("He");});
System.out.println(C);

//nonMatch()
System.out.println("----------nonMatch method---------");

boolean d=list.stream().noneMatch(value->{return value.startsWith("He");});   //non element should be starting with "he"---true
System.out.println(d);//false

// findAny()
System.out.println("----------findAny method---------");

Optional<String> o=list.stream().findAny();
System.out.println(o.get());

//findFirst()
System.out.println("----------findFirst method---------");

Optional<String> obj=list.stream().findFirst();
System.out.println(obj.get());

// concat two streams
System.out.println("-----------concatination of streams-----------");
Stream <String> stream1=list.stream();
Stream <String> stream2=name.stream();
List<String> finalstream=Stream.concat(stream1,stream2).collect(Collectors.toList());
System.out.println(finalstream);


}
	
}

