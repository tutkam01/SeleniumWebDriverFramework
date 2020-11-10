package assertions.homePage;

import org.testng.Assert;

import assertions.AbstractAssertions;
import pages.homepage.HomePage;

public class HomePageAssertions extends AbstractAssertions<HomePage> {
	
	public HomePageAssertions assetHomePageTitle() {
		Assert.assertEquals(page.getPageTitle(), "My Store");
		return this;
	}
	
}
