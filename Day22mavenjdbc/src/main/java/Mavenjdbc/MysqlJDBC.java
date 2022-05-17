package Mavenjdbc;
import java.sql.*;
public class MysqlJDBC {
	public static void main(String[] args) throws SQLException{
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/hema";
		
			Connection con=DriverManager.getConnection(url,userName,password);
			//System.out.println(con);
			
			Statement st=con.createStatement();
//			String insertSQL="insert into student values('12','Riya','EEE','9465670290')";
//			insertSQL="insert into student values('13','Lee Min Ho','EEE','9465670290')";
//			insertSQL="insert into student values('14','Kim Woobin','CSE','9465670290')";
//		    insertSQL="insert into student values('16','Tayhung','CSE','946566790')";
//			insertSQL="insert into student values('17','Kim Namjoon','CSE','9464321290')";
//			insertSQL="insert into student values('18','Yoongi','CSE','9469875490')";
//			
//          String insertSQL="insert into student values('15','Jung Kook','EEE','9465672900')";
            st.executeUpdate(insertSQL);
//			
			
			
			String updateSQL="update student set Phone_no='9116622896' where Std_Id='15'";
			
			
			st.execute(updateSQL);
			
			//long Count=st.executeUpdate(insertSQL);
			System.out.println("updated..");
			
			//System.out.println(Count);
		
		
		
}
}
