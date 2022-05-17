package jdbcday23;
import java.sql.*;

public class TestConnection {

	public static void main(String[] args) throws Exception {
		
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		//String names[]= {"Li","Xi","Xing","Lee","Pie","Poo","Woo","Wan","Zang","Chifu"};
		//double deposits[]= {200,340,650,730,400,500,653,490,100,700};
		//for(int i=1;i<names.length;i++) {
		//	PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?)");
		//	pstmt.setInt(1, i+102);
		//	pstmt.setString(2, names[i]);
		//	pstmt.setDouble(3, deposits[i]);
		//	int count=pstmt.executeUpdate();
		//	System.out.println(count+"record inserted");
		/*
		 * PreparedStatement pstmt=con.prepareStatement("update customer set balance=balance+? where CusId=?");
		 * pstmt.setDouble(1,222); pstmt.setDouble(2,111); int
		 * count=pstmt.executeUpdate(); System.out.println(count+"records updated");
		 */
		
		PreparedStatement pstmt=con.prepareStatement("delete from customer where CusId=?");
		
		pstmt.setInt(1,111);
		int count=pstmt.executeUpdate();
		System.out.println(count+"records updated");
		
		
		
		}
	}


