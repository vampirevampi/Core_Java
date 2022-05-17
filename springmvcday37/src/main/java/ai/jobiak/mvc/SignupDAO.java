package ai.jobiak.mvc;

import java.sql.*;

import java.sql.PreparedStatement;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class SignupDAO {
	

		//performs CRUD operation with the customer table, hence needs JdbcTemplate
		
		private JdbcTemplate mysqlTemplate;
		
		public JdbcTemplate getTemplate(){
			return mysqlTemplate;
			
		}
		public void setTemplate(JdbcTemplate mysqlTemplate) {
			this.mysqlTemplate=mysqlTemplate;
			
		}
		public boolean insertRow(String name,String email,String mobile) {
			
		String query="insert into signup values(?,?,?)";
		return mysqlTemplate.execute(query,new PreparedStatementCallback<Boolean>(){
			public Boolean doInPreparedStatement(PreparedStatement ps)
			throws SQLException,DataAccessException{
				ps.setString(1,name);
				ps.setString(2,email);
				ps.setString(3,mobile);
				return ps.execute();
			
			
			}
			
 
});

}
}