package pages.pagefactory;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import assertions.AbstractAssertions;

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
	
	public  <P extends Page, A extends AbstractAssertions<P>> A check(Class<A> assertionClass) {
		try {
			A assertion = assertionClass.getConstructor().newInstance();
			assertion.setPage((P)this);
			return assertion;
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			throw(new RuntimeException(e));
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
