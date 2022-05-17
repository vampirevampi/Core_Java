package ai.jobiak.collection;
import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet colors=new HashSet();
		colors.add("blue");
		colors.add("red");
		colors.add("purple");
		colors.add("pink");
		colors.add("green");
		colors.add("red");
		System.out.println(colors);
		System.out.println(colors.size());
		System.out.println(colors.contains("purple"));
		for(Object obj:colors)
		{
			System.out.println(obj);
		}
	}

}
