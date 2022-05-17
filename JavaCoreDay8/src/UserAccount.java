
import java.util.Scanner;

public class UserAccount {
	String FirstName;
	String LastName;
	String DOB;
	String Gender;
	String MobileNo;
	int flag=0;
	public String EmailId;
	String password;
	Scanner sc=new Scanner(System.in);
	public void user()
	{
	System.out.println("First Name: ");
	FirstName=sc.nextLine();
	System.out.println("Last Name: ");
	LastName=sc.nextLine();
	System.out.println("Date Of Birth: ");
	DOB=sc.nextLine();
	System.out.println("Gender: ");
	Gender=sc.nextLine();
	System.out.println("Mobile Number: ");
	MobileNo=sc.nextLine();
	System.out.println("EmailID: ");
	EmailId=sc.nextLine();
	char letter[]=new char[EmailId.length()];
	EmailId.getChars(0, EmailId.length(), letter, 0);
	for(int i=0;i<EmailId.length();i++)
	{
		if((letter[i]==' ')||(letter[i]=='\'')||(letter[i]=='!')||(letter[i]=='#')||(letter[i]=='$')||(letter[i]=='%')||(letter[i]=='^')||(letter[i]=='&')||(letter[i]=='*')||(letter[i]=='\\')||(letter[i]=='-')||(letter[i]=='_')||(letter[i]==',')||(letter[i]=='/')||(letter[i]=='+')) {
			System.out.println("invalid syntax at line no "+i+" replace "+letter[i]);
			flag=1;
			
	}
	}
		if(flag==1)
		{
		
		System.out.println("EmailID: ");
		EmailId=sc.nextLine();
		}

	
	
	System.out.println("Password: ");
	password=sc.nextLine();
	if(password.length()<6)
	{
		System.out.println("Weak Password");
		System.out.println("Password: ");
		password=sc.nextLine();
		
		
	}
	else
	{
		System.out.println("Successfully Account created");
	}
			
	}
	  
	}
	
	


