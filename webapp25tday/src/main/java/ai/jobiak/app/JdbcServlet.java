package ai.jobiak.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class JdbcServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws Exception {
		PrintWriter out = res.getWriter();
		String url = "jdbc:mysql://localhost:3306/world";
		String user = "root";
		String pass = "Hema@6594";
	
				Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			out.println("Connect to DB...");
			Statement st=con.createStatement();
		String selectSQL="select*from city";
		ResultSet rs=st.executeQuery(selectSQL);
		while(rs.next()) {
			out.println(rs.getInt(1)+"."+rs.getString(2)+"	::"+rs.getString(3)+"	::"+rs.getString(4)+"	::"+rs.getInt(5));		}
			
			/*
			 * String selectSQL1="select*from country"; ResultSet
			 * rs1=st.executeQuery(selectSQL1); while(rs1.next()) {
			 * out.println(rs1.getString(1)+"."+rs1.getString(2));
			 * 
			 * }
			 */
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}