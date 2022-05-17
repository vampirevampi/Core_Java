package jdbcday23;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;



public class Testjdbc3 {

	public static void main(String[] args) throws Exception {
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("connected to db....");
		Connection con1=DriverManager.getConnection(url,userName,password);
		System.out.println("connected to db....");
		DatabaseMetaData dmd=(DatabaseMetaData)con1.getMetaData();
		System.out.println(dmd.getDriverName());
		System.out.println(dmd.getDriverVersion());
		System.out.println(dmd.getDatabaseProductName());
		System.out.println(dmd.getDriverMinorVersion());
		

	}

}
