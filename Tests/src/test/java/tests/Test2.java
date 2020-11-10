package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import drivers.WebDriverHandler;
import pages.homepage.HomePage;

public class Test2 {
	
	@Test
	public void shouldNavigateToMainPage() throws MalformedURLException{
//	  WebDriverHandler.loadGeckoDriver();
//	  DesiredCapabilities capabilty = DesiredCapabilities.firefox();
	  DesiredCapabilities capabilty = DesiredCapabilities.chrome();
//	  capabilty.setBrowserName("firefox");
//	  capabilty.setCapability("browserVersion", "52.0.1");
	  capabilty.setPlatform(Platform.LINUX);	  
//	  WebDriver driver = new RemoteWebDriver(new URL("http://10.0.2.15:5566/wd/hub"), capabilty);
	  WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilty);
//	  driver.get("http://automationpractice.com");
	  //patrick moore lebrosso@poczta.fm Talentlink.1
	  
	  new HomePage(driver);
	}

}
