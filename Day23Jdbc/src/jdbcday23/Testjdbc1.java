package jdbcday23;
import java.sql.*;


public class Testjdbc1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
			
		
		
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/world";
		
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected to db....");
			Statement st=con.createStatement();
			String selectSQL="select*from customer where CusId=103";
			ResultSet rs=st.executeQuery(selectSQL);
			/*
			 * while(rs.next()) { System.out.println("data found");
			 * System.out.println(rs.getString(1)+"::"+rs.getString(2)); }
			 */
		ResultSetMetaData rsmd=	rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnName(2));
			System.out.println(rsmd.getColumnName(3));
			System.out.println(rsmd.getColumnTypeName(2));
			System.out.println(rsmd.getColumnTypeName(3));
			//System.out.println(rsmd.getSchemaName(1));
			System.out.println(rsmd.getTableName(1));
			System.out.println(rsmd.getCatalogName(1));
			System.out.println(rsmd.isNullable(1)); 
			System.out.println(rsmd.getPrecision(2));
			System.out.println(rsmd.getScale(1));
		
		}
		
		
	}

