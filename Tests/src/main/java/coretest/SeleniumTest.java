package coretest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.PackageUtils;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import drivershandler.WebDriverHandler;



/**
 * Parent for all selenium tests.
 *
 */
public class SeleniumTest {
   protected WebDriver driver;
   
   @BeforeMethod(alwaysRun = true)
   public void setupTest() throws MalformedURLException{
	   System.out.println("From SeleniumTest");
	   String runDestination = System.getProperty("run", "locally");
	   System.out.println(runDestination);
	   
	   if("locally".equalsIgnoreCase(runDestination)){
		   System.out.println("load gecko");
		   WebDriverHandler.loadGeckoDriver();
		   driver = new FirefoxDriver();
		   System.out.println("Po inicjalizacji drivera");
	   }else if("grid".equalsIgnoreCase(runDestination)){
		   DesiredCapabilities capabilty = DesiredCapabilities.firefox();
		   driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilty);
	   }else{
		   throw new IllegalArgumentException("Not supported run mode!");
	   }
	   
	   driver.manage().window().maximize();
	   System.out.println("koniec setup test");
   }
   
   @AfterMethod
   public void tearDownDriver(){
		if(driver!=null){
			driver.quit();
		}
   }
   
  
}
