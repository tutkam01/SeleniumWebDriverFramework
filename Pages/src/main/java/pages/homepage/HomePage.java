package pages.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.loginpage.LoginPage;
import pages.pagefactory.Page;

public class HomePage extends Page {
	
	@FindBy(className="login")
	private WebElement signInButton;
	
	public HomePage(WebDriver driver) {
		super(driver, "http://automationpractice.com");
	}
	
	public LoginPage clickSignIn(){
		signInButton.click();
		return new LoginPage(driver);
	}
	
}
