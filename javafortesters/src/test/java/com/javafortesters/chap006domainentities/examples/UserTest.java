package com.javafortesters.chap006domainentities.examples;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafortesters.domainentities.User;



public class UserTest {
	
	@Test
	
	public void canConstructWithUsernameAndPassword(){ 
		User user = new User(); 
		
		user.setPassword("Alok1234");
		
	//	assertEquals(" getter username expected", "admin", user.getUsername()); 
		
		assertEquals(" setter password expected", "Alok1234", user.setPassword()); 
		
	
	}


	
}