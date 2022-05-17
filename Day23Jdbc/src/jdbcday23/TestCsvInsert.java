package jdbcday23;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class TestCsvInsert {

	public static void main(String[] args) throws Exception {
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url,userName,password);
		String FilePath="courseList.csv";
		int batchSize=10;
		String sql="insert into courselist(CourseName,StudentName)"+"values(?,?)";
		PreparedStatement statement=con.prepareStatement(sql);
		BufferedReader lineReader=new BufferedReader(new FileReader(FilePath));
		String lineText=null;
		int count=0;
		lineReader.readLine();
		while((lineText=lineReader.readLine())!=null) {
			String[] data=lineText.split(",");
			String CourseName=data[0];
			String StudentName=data[1];
			
			statement.setString(1,CourseName);
			statement.setString(2,StudentName);
			statement.addBatch();
			if(count%batchSize==0);{
				statement.executeBatch();
			}
		}
		lineReader.close();
		statement.executeBatch();
		System.out.println("values Inserted");
		con.close();
			
	}
			
		
		
		
	}


