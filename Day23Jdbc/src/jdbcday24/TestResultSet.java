package jdbcday24;
import java.sql.*;
public class TestResultSet {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/world";
		
		System.out.println("connected to db....");
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String selectSQL="select*from customer";
		ResultSet rs=st.executeQuery(selectSQL);
		//while(rs.next()) {
			rs.afterLast();//enter which record to see (4)go to 4th record(1) go to first record
			rs.previous();
			System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
			/*
			 * rs.first();
			 * System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3))
			 * ; rs.next();
			 * System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3))
			 * ; rs.absolute(4);
			 * System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3))
			 * ;
			 */
		    
	//}
			
		
		
		
	




	}

}
