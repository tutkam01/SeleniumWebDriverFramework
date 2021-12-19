package tests;

import org.testng.annotations.Test;

import coretest.SeleniumTest;
import assertions.loginPage.LoginPageAssertions;
import assertions.myaccount.MyAccountPageAssertions;
import pages.homepage.HomePage;

public class LoginTest extends SeleniumTest{
	
	@Test
	public void shouldLogInFail(){
		System.out.println("Thread id = " + Thread.currentThread().getId());
		new HomePage(driver).clickSignIn()
			.setEmail("lebrosso@poczta.fm")
			.setPassword("Wrong.one")
			.clickSubmitLoginAndFail()
			.check(LoginPageAssertions.class)
				.assertFaillureMessage();
			
	}
	
	@Test
	public void shouldLogInSuccessfully(){
		System.out.println("Thread id = " + Thread.currentThread().getId());
		new HomePage(driver).clickSignIn()
			.setEmail("lebrosso@poczta.fm")
			.setPassword("P@ssword.1")
			.clickSubmitLogin()
			.check(MyAccountPageAssertions.class)
				.assertLoginWasSuccessful();
			
	}

}
