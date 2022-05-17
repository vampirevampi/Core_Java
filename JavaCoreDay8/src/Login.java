//import java.lang.Scanner;
public class Login extends UserAccount {
	String Nemailid;
	String Npassword;
	int j=0;
	//Scanner sc=new Scanner(System.in);
	int count=0;
	
	public void LoginDeatails()
	{
		
		System.out.println("log in");
		System.out.println();
		System.out.println("Emailid:");
		Nemailid=sc.nextLine();
	
		for(j=0;j<3;j++) {
		System.out.println("password: ");
			 Npassword=sc.nextLine();
			 if((Npassword).equals(password))
			 {
				 System.out.println("LOG IN SUCCESSFUL");
				 break;
				 
			 }
			 else
			 {
				 continue;
			 }
		}
			if(j==3)
			{
				System.out.println("perday limit is over");
		}
		
	
	}
	
}
