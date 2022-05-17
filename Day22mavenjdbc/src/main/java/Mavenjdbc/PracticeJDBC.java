package Mavenjdbc;
import java.sql.*;
public class PracticeJDBC {
	public static void main(String[] args) throws SQLException{
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/hema";
		
			Connection con=DriverManager.getConnection(url,userName,password);
			//System.out.println(con);
			
			Statement st=con.createStatement();
		    String insertSQL1="insert into bts values('1','Kim','Namjoon','Seoul','South Korea')";
		    st.executeUpdate(insertSQL1);
		    String insertSQL2="insert into bts values('2','Jung','Seok-jin','Gwacheon','South Korea')";
		    st.executeUpdate(insertSQL2);
			String insertSQL3="insert into bts values('3','Jung','Kook','Busan','South Korea')";
			st.executeUpdate(insertSQL3);
		    String insertSQL4="insert into bts values('4','Kim','Tai Hung','Seo','South Korea')";
		    st.executeUpdate(insertSQL4);
		    String insertSQL5="insert into bts values('5','Min','Yoongi','Daugy','South Korea')";
		    st.executeUpdate(insertSQL5);
		    String insertSQL6="insert into bts values('6','Jung','Ho-Seok','Gwangju','South Korea')";
		    st.executeUpdate(insertSQL6);
		    String insertSQL7="insert into bts values('7','Jung','Seok-jin','Gwacheon','South Korea')";
		    st.executeUpdate(insertSQL7);
			System.out.println("all 7 members details are added into the table");
		  //  String updateSQL="update student set FirstName='Kim' where PersonID='2'";
//		    st.execute(updateSQL);
//		    System.out.println("Sucessfully updated");
		
		
		
}
}
