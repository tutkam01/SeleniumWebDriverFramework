package tests;

import homepage.HomePage;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicMainPageLoadTest extends SeleniumTest {
	
	@Test
	public void shouldNavigateToMainPage() throws MalformedURLException{
	  
	  new HomePage(driver);
	  
	  Assert.assertEquals(driver.getTitle(), "My Store");
	}
	
	

}
