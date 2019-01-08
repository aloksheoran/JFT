package javafortesters.javafortesters;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javafortesters.domainobject.TestAppEnv;

public class TestAppEnvironmentTest {
	
	@Test 
	
	public void canGetUrlStatically(){ 
		
		TestAppEnv.getUrl();

	}

	@Test 
	
	public void canGetDomainAndPortStatically()  { 
		
		assertEquals(" Just the Domain", "192.123.0.3", TestAppEnv.DOMAIN);
		
		assertEquals(" Just the port", "67" , TestAppEnv.PORT);


	}

	

}
