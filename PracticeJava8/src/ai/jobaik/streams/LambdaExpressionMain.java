package ai.jobaik.streams;

import java.util.ArrayList;

public class LambdaExpressionMain {
	public static void main(String args[]) {
		ArrayList<Object>list=new ArrayList<Object>();
		list.add(1);
		list.add("Justin");
		list.add(89000.00);
		list.forEach(x->System.out.println(x));
		
	}

}
