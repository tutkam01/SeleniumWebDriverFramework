package assertions.homePage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import assertions.AbstractAssertions;
import pages.homepage.HomePage;

public class HomePageAssertions extends AbstractAssertions<HomePage> {
	private static final Logger logger = LogManager.getLogger(HomePageAssertions.class);	
	
	public HomePageAssertions assetHomePageTitle() {
		Assert.assertEquals(page.getPageTitle(), "My Store");
		logger.info("Successfuly verified page title.");
		return this;
	}
	
}
