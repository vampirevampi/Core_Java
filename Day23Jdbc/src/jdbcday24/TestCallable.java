package jdbcday24;
import java.sql.*;
public class TestCallable {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="Hema@6594";
		String url="jdbc:mysql://localhost:3306/world";
		
		System.out.println("connected to db....");
		Connection con=DriverManager.getConnection(url,userName,password);
		//callable stms ->executing->functions,procedures and REF cusorsdb objects
        // procedure updateBalance(cusid,amount)update the balance of the customer
		/*
		 * CallableStatement cs=con.prepareCall("{CALL updateBalance(?,?)}");
		 * cs.setInt(1, 105); cs.setDouble(2, 700); //cs.registerOutParameter(1,
		 * Types.DOUBLE); boolean result=cs.execute(); System.out.println(result);
		 */
		CallableStatement smt2=con.prepareCall("{?=call addbalance(?,?)");
		smt2.registerOutParameter(1,Types.BOOLEAN);
		smt2.setInt(1,112);
		smt2.setDouble(3, 700);
		smt2.execute();
		System.out.println(smt2.getBoolean(1));

	}

}
