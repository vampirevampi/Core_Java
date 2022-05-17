
import java.sql.*;

public class PracticeJDBC {
	
     public static void main(String[] args) {
			// TODO Auto-generated method stub

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			String userName="root";
			String password="Hema@6594";
			String url="jdbc:mysql://localhost:3306/hema";
			try {
				Connection con=DriverManager.getConnection(url,userName,password);
				System.out.println("connected to db....");
				Statement st=con.createStatement();
				
				
				String selectSQL="INSERT INTO `hema`.`Student` (`Std_Id`, `Std_Name`, `Branch`, `Phone_no`) VALUES ('6', 'RAM', 'CSE', '9283720020')";
				
				st.execute(selectSQL);
//				while(rs.next()) {
//					System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getString(4));
//					
//				}
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		}

	}



