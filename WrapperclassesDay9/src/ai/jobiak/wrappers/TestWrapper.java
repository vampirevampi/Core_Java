package ai.jobiak.wrappers;

public class TestWrapper {

	public static void main(String[] args) {
		//StringWrapper obj=new StringWrapper ("HEMA");
		//System.out.println(obj);
		String str1=" Andhra Pradesh ";
		String str2="Vizag";
		System.out.println("lenth of string is: "+str1.length());  //length of str1
		System.out.println("character at given index is : "+str1.charAt(3));  //char at given index in str1
		System.out.println("after replacing the new string is: "+str1.replace(str1,str2));  // replaces old string with new string
		System.out.println(str1); 
		System.out.println("converts Str1 to lower case: "+str1.toLowerCase());  //converts to lower case
		System.out.println("converts Str1 to upper case: "+str1.toUpperCase());  // converts to upper case
		System.out.println("compares str1 and str2: "+str1.compareTo(str2)); //compares str1 and str2;
		System.out.println("after trimming spaces:"+str1.trim()); //trims the space at start and end of the string
		String str3=str1.concat(str2);
		System.out.println(str3); // Concatenation of str1 and str2;
		String str4="100";
		int num=Integer.parseInt(str4);
		System.out.println("after converting string to int:"+num); //converting string to integer
		StringBuffer sb= new StringBuffer("java");
		System.out.println("appending the string: "+sb.append("wecome"));
		System.out.println("inserting: "+sb.insert(3,'h'));
		System.out.println("delete the characters mensionded: "+sb.delete(3, 5));
		System.out.println("reverse: "+sb.reverse());
		System.out.println("replace: "+sb.replace(0, 2,"hqq"));
		System.out.println("sub string: "+sb.substring(3));
		System.out.println("sub sequence: "+sb.subSequence(0, 5));
		
		
		}

	
	}


