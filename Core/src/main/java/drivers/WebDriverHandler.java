package drivers;

import java.net.URISyntaxException;

public class WebDriverHandler {

	public static void loadGeckoDriver() {
		String pathToGeckoDriver;
		pathToGeckoDriver = WebDriverHandler.class.getClassLoader().getResource("drivers/geckodriver.exe").getPath();
		// System.setProperty("webdriver.firefox.marionette",
		// pathToGeckoDriver);
		System.setProperty("webdriver.gecko.driver", pathToGeckoDriver);

	}

}
