package tests;

import homepage.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends SeleniumTest{
	
	@Test
	public void shouldLogInSuccessfully(){
		String authenticationFailureMessage = new HomePage(driver).clickSignIn()
			.setEmail("lebrosso@poczta.fm")
			.setPassword("Talentlink.1")
			.clickSubmitLoginAndFail()
			.getAuthenticationFailedBox()
			.getText()
			.trim();
							
		Assert.assertEquals(authenticationFailureMessage, "Authentication failed.");
	}

}
