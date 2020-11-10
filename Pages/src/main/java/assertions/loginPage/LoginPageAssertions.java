package assertions.loginPage;

import org.testng.Assert;

import assertions.AbstractAssertions;
import pages.loginpage.LoginPage;

public class LoginPageAssertions extends AbstractAssertions<LoginPage> {
	
	public LoginPageAssertions assertFaillureMessage() {
		Assert.assertEquals(page.getAuthenticationFailureMessage(), "Authentication failed.");
		return this;
	}

}
