package com.jobaik.ioc2;
import com.jobiak.ioc.*;

public class UserConnection {

	public UserConnection() {
		NewConnection con=new NewConnection();
		con.getConnection();
		System.out.println("Connection obtained in"+this.getClass());
	}
}
