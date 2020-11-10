package pages.myaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.pagefactory.Page;

public class MyAccountPage extends Page {
	
	@FindBy(className = "info-account")
	private WebElement accountInfoLabel;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public String getTextAfterSuccessfulLogin() {
		return accountInfoLabel.getText().trim();
	}

}
