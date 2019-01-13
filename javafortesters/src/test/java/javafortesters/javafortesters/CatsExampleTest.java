package javafortesters.javafortesters;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatsExampleTest {
	
	@Test
	
	public void ifAddHttp() {
		
		String url = "www.seleniumsimplified.com";
		if(!url.startsWith("http")) {
			
			url = addHttp(url);
		}
		
		assertTrue(url.startsWith("http://"));
		
		assertEquals("http://www.seleniumsimplified.com",url);
		
	}

	private String addHttp(String url) {
		String fullurl = "http://"+url;
		return fullurl;
	}
	
	
	
	

}
