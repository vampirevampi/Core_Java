package com.jobiak.ioc;

public class NewConnection {
	public NewConnection getConnection() {
		System.out.println("providing the new connection");
		return new NewConnection();
		
	}

}
