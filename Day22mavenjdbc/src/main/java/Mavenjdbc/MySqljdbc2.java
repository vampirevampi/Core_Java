package Mavenjdbc;
import java.sql.*;

public class MySqljdbc2 {

	public static void main(String[] args) throws SQLException{
		
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/hema";
		
			Connection con=DriverManager.getConnection(url,userName,password);
			
			
			Statement st=con.createStatement();
			
		//String insertSQL="insert into worker values('1','Kim','Namjoon','28','M','South Korea')";
	    // String insertSQL="insert into worker values('2','Emir','Ahmed','30','M','Dubai')";	
		//String insertSQL="insert into worker values('3','Lee','Bronson','25','M','Kuwait')";	
		 // String insertSQL="insert into worker values('4','Riko','Yuki','22','M','Japan')";	
		//String insertSQL="insert into worker values('5','Ali','Abdallah','28','M','Saudi Arabia')";
		//String insertSQL="insert into worker values('6','Sebastin','Jhon','25','M','German')";
		//String insertSQL="insert into worker values('7','Carlos','David','28','M','Mexico')";
			//String insertSQL="insert into worker values('8','Francisco','Heitor','22','M','Brazil')";
			//String insertSQL="insert into worker values('9','Copper','Thomas','28','M','Austraila')";
			//String insertSQL="insert into worker values('10','Matteo','Nathen','26','M','Switzerland')";
			//String insertSQL="insert into worker values('11','Mi','Young','21','F','South Korea')";
			//String insertSQL="insert into worker values('12','Mujadid','Yasmin','24','F','Dubai')";
			//String insertSQL="insert into worker values('13','Suhair','Shakira','27','F','Kuwait')";
			//String insertSQL="insert into worker values('14','Emi','Hana','28','F','Japan')";
			//String insertSQL="insert into worker values('15','Olsen','Linda','29','F','Saudi Arabia')";
			//String insertSQL="insert into worker values('16','Mila','Emma','24','F','German')";
			//String insertSQL="insert into worker values('17','Camila','Sofia','21','F','Mexico')";
			//String insertSQL="insert into worker values('18','Fernanda','Maria','27','F','Brazil')";
			//String insertSQL="insert into worker values('19','Centaine','Yara','21','F','Australia')";
			//String insertSQL="insert into worker values('20','Madlaina','Lucy','24','F','Switzerland')";
			
		  //st.executeUpdate(insertSQL);
			System.out.println("Table after inserting vales...");
			System.out.println("Updating values...");
			
			/*
			 * String updateSQL="update worker set F_Name='Woo' where Wk_id='1'";
			 * st.execute(updateSQL); System.out.println("\n updated...");
			 */
			
		
			
		
		
}


		
		
		
	
		
		
		

	}


