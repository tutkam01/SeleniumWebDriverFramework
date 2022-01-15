package pages.homepage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import assertions.homePage.HomePageAssertions;
import pages.loginpage.LoginPage;
import pages.pagefactory.Page;

public class HomePage extends Page {
	private static final Logger logger = LogManager.getLogger(HomePage.class);	
	@FindBy(className="login")
	private WebElement signInButton;
	
	public HomePage(WebDriver driver) {
		super(driver, "http://automationpractice.com");
		logger.info("Opening homepage");
	}
	
	public LoginPage clickSignIn(){
		signInButton.click();
		return new LoginPage(driver);
	}
	
}
