package jdbcday24;
import java.sql.*;
public class TestResultSet2 {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/world";
		
		System.out.println("connected to db....");
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String selectSQL="select*from customer";
		ResultSet rs=st.executeQuery(selectSQL);
		if(rs.next())
		{
			
			rs.absolute(5);
			rs.deleteRow();
			System.out.println(rs.getInt(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
		}




	}

}
