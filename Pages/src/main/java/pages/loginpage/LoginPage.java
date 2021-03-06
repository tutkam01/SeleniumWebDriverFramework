package pages.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.homepage.HomePage;
import pages.myaccount.MyAccountPage;
import pages.pagefactory.Page;

public class LoginPage extends Page {
	
	@FindBy(id="email")
	private WebElement emailInput;
	
	@FindBy(id="passwd")
	private WebElement passwordInput;
	
	@FindBy(id="SubmitLogin")
	private WebElement submitLoginButton;
	
	@FindBy(css=".alert-danger ol>li")
	private WebElement authenticationFailedBox;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage setEmail(String emailAddress){
		emailInput.sendKeys(emailAddress);
		return this;
	}
	
	public LoginPage setPassword(String password){
		passwordInput.sendKeys(password);
		return this;
	}
	
	public MyAccountPage clickSubmitLogin(){
		submitLoginButton.click();
		return new MyAccountPage(driver);
	}
	
	public LoginPage clickSubmitLoginAndFail(){
		submitLoginButton.click();
		return new LoginPage(driver);
	}
	
	public String getAuthenticationFailureMessage() {
		return authenticationFailedBox.getText().trim();
	}

}
