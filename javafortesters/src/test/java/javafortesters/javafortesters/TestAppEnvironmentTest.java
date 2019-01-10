package javafortesters.javafortesters;
import org.junit.Assert;
import org.junit.Test;
import com.javafortesters.domainobject.TestAppEnv;

public class TestAppEnvironmentTest {
	
	@Test 
	
	public void canGetUrlStatically(){ 
		
		Assert.assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.getUrl() );

	}

	@Test 
	
	public void canGetDomainAndPortStatically()  { 
		
		Assert.assertEquals(" Just the Domain", "192.123.0.3", TestAppEnv.DOMAIN);
		
		Assert.assertEquals(" Just the port", "67" , TestAppEnv.PORT);

	}

}
