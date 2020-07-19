package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public abstract class Page {
	protected WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver, 30); 
		PageFactory.initElements(ajaxElementLocatorFactory, this);
	}
	
	public Page(WebDriver driver, String url){
		this(driver);
		driver.get(url);
	}
}
