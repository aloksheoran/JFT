package com.javafortesters.domainentities;


public class User {
	
	public String username; 
	public String password; 
	
	public User(String username, String password){ 
		this.username = username; 
		this.password = password; 
		
	}


	public Object getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

}
