package com.javafortesters.chap006domainentities.examples;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafortesters.domainentities.User;



public class UserTest {
	
	@Test 
	
	 public void userHasDefaultUsernameAndPassword(){

		User user = new User();
		
		user.username = "bob";


		assertEquals(" default username expected", "bob", user.getUsername()); 
		
		assertEquals(" default password expected", "password", user.getPassword());

		
		
     }
	
}