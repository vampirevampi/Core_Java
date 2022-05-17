package ai.jobiak.com;

public abstract class Students implements Comparable<Student>{
String name;
int age;

		  @Override public int compareTo(Student o) {
		  
		  return (this.age-o.age); }
		 

}
