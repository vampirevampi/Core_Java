package ai.jobiak.streams;
import java.util.Scanner;
		public class FreqChars{
		public static void main(String[] args){
		final int SIZE=26;
	
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String str=sc.nextLine();
			int[] decArr= new int[SIZE];
			char[] chArr=str.toCharArray();
			for( int i=0;i<str.length();i++)
			{
			if(chArr[i]>='a' && chArr[i]<='z')
			{
			decArr[chArr[i]-'a']++;

			}
			 if(chArr[i]>='A' && chArr[i]<='Z')
			{
			decArr[chArr[i]-'A']++;
			}
			}
				for(int i=0;i<=SIZE;i++)
				{ 
			      
					System.out.println(chArr[i]+"-"+decArr[i]);
				}
				
				
		}

		}
		
		



		
		
