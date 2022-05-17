package jdbcday23;

import java.sql.*;
import java.util.Scanner;

public class JobiakInbox {

	public static void main(String[] args) throws Exception {
		String userName = "root";
		String password = "Hema@6594";
		String url = "jdbc:mysql://localhost:3306/hema";
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println(".......Welcome to JobiakInbox.......");
		Statement st = con.createStatement();
		
		  
		  String createSQL="CREATE TABLE `hema`.`mailbox` (\r\n" +
		  "  `mailno` INT NOT NULL,\r\n" + "  `from` VARCHAR(100) NULL,\r\n" +
		  "  `subject` VARCHAR(150) NULL,\r\n" + "  `content` VARCHAR(500) NULL,\r\n" +
		  "  `size` INT NULL,\r\n" + "  PRIMARY KEY (`mailno`),\r\n" +
		  "  UNIQUE INDEX `mailno_UNIQUE` (`mailno` ASC) VISIBLE);";
		  st.executeUpdate(createSQL);
		  
		  String insertsql="insert into mailbox values(?,?,?,?,?)"; 
		  PreparedStatement pst=con.prepareStatement(insertsql); String frm[]=
		  {"Lavanya@gmail","Roopa@gmail","Anil@gmail","Chandini@gmail"};
		  String Sub[]={"SickLeave","UpdateTask","TaskResults","Doubts"};
		  String cnt[]={"i am suffering from Fever so taking leave today"
		  ,"can you please update me about the task?","youre score is average"
		  ,"Can you explain me jdbc?"}; 
		  int sze[]= {20,30,40,25};
		  
		  for (int i=0;i<4;i++) 
		  { pst.setInt(1, i);
		    pst.setString(2, frm[i]);
		    pst.setString(3, Sub[i]); 
		    pst.setString(4, cnt[i]);
		    pst.setInt(5, sze[i]);
		    pst.executeUpdate();
		  
		  }
		 
		System.out.println("choose one of the following....");
		System.out.println(" 1.First" + "\n 2.Next" + "\n 3.previous" + "\n 4.last" + "\n 5.Goto" + "\n 6.exit");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
			Statement st1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql = "select * from mailbox";
			ResultSet rs = st1.executeQuery(sql);
			rs.first();
			System.out.println("no: " + rs.getInt(1) + " from: " + rs.getString(2) + " sub: " + rs.getString(3)
					+ " content: " + rs.getString(4) + " size: " + rs.getInt(5));

			break;
		case 2:
			Statement st2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql2 = "select * from mailbox";
			ResultSet rs2 = st2.executeQuery(sql2);
			rs2.first();
			rs2.next();
			System.out.println("no: " + rs2.getInt(1) + " from: " + rs2.getString(2) + " sub: " + rs2.getString(3)
					+ " content: " + rs2.getString(4) + " size: " + rs2.getInt(5));

			break;
		case 3:

			Statement st3 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql3 = "select * from mailbox";
			ResultSet rs3 = st3.executeQuery(sql3);
			rs3.first();
			rs3.next();
			rs3.previous();
			System.out.println("no: " + rs3.getInt(1) + " from: " + rs3.getString(2) + " sub: " + rs3.getString(3)
					+ " content: " + rs3.getString(4) + " size: " + rs3.getInt(5));

			break;
		case 4:

			Statement st4 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql4 = "select * from mailbox";
			ResultSet rs4 = st4.executeQuery(sql4);
			rs4.last();

			System.out.println("no: " + rs4.getInt(1) + " from: " + rs4.getString(2) + " sub: " + rs4.getString(3)
					+ " content: " + rs4.getString(4) + " size: " + rs4.getInt(5));
			break;
		case 5:

			Statement st5 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql5 = "select * from mailbox";
			ResultSet rs5 = st5.executeQuery(sql5);
			System.out.println("enter the mail no you wanted to view: ");
			int num2 = sc.nextInt();
			rs5.absolute(num2);

			System.out.println("no: " + rs5.getInt(1) + " from: " + rs5.getString(2) + " sub: " + rs5.getString(3)
					+ " content: " + rs5.getString(4) + " size: " + rs5.getInt(5));
			break;
		case 6:
			System.out.println("Exited from the mailbox....");
			break;
		default:
			System.out.println("you have given wrong number...");
			break;

		}

	}

}
