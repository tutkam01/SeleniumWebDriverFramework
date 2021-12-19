package tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import coretest.SeleniumTest;
import assertions.homePage.HomePageAssertions;
import pages.homepage.HomePage;

public class BasicMainPageLoadTest extends SeleniumTest {
	
	@Test
	public void shouldNavigateToMainPage() throws MalformedURLException{
		System.out.println("Thread id = " + Thread.currentThread().getId());
	  
	  new HomePage(driver)
	  	.check(HomePageAssertions.class)
	  		.assetHomePageTitle();
	  
	}
	
	

}
