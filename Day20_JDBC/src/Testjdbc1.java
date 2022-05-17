import java.sql.*;


public class Testjdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/world";
		try {
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected to db....");
			Statement st=con.createStatement();
			String selectSQL="select*from country";
			ResultSet rs=st.executeQuery(selectSQL);
			while(rs.next()) {               
				System.out.println(rs.getString(1)+"::"+rs.getString(2));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
