package com.javafortesters.domainentities;


public class User {
	
	public String username; 
	public String password; 
	
	public User(String username1, String password1){ 
		this.username = username1; 
		this.password = password1; 
		
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
