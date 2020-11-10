package assertions.myaccount;

import org.testng.Assert;

import assertions.AbstractAssertions;
import pages.myaccount.MyAccountPage;

public class MyAccountPageAssertions extends AbstractAssertions<MyAccountPage>{
	
	private static final String SUCCESSFUL_LOGIN_MESSAGE = "Welcome to your account. Here you can manage all of your personal information and orders.";
	
	public MyAccountPageAssertions assertLoginWasSuccessful() {
		Assert.assertEquals(page.getTextAfterSuccessfulLogin(), SUCCESSFUL_LOGIN_MESSAGE);
		return this;
	}

}
