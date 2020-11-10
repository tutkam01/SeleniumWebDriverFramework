package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import drivers.WebDriverHandler;

/**
 * Parent for all selenium tests.
 *
 */
public class SeleniumTest {
   protected WebDriver driver;
   
   @BeforeMethod
   protected void setupTest() throws MalformedURLException{
	   String runDestination = System.getProperty("run", "locally");
	   
	   if("locally".equalsIgnoreCase(runDestination)){
		   WebDriverHandler.loadGeckoDriver();
//		   DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		   driver = new FirefoxDriver();
//		   driver = new FirefoxDriver(capabilities);
	   }else if("grid".equalsIgnoreCase(runDestination)){
		   DesiredCapabilities capabilty = DesiredCapabilities.firefox();
		   driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilty);
	   }else{
		   throw new IllegalArgumentException("Not supported run mode!");
	   }
	   
	   driver.manage().window().maximize();
   }
   
   @AfterMethod
   protected void tearDownDriver(){
		if(driver!=null){
			driver.quit();
		}
   }
}
