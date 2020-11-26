package drivers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

public class WebDriverHandler {

	public static void loadGeckoDriver() {
		System.out.println(System.getProperty("user.dir"));
		System.out.println(WebDriverHandler.class.getClassLoader().getResource("drivers/geckodriver.exe").getPath());
		String pathToGeckoDriver = WebDriverHandler.class.getClassLoader().getResource("drivers/geckodriver.exe").getPath();
		System.setProperty("webdriver.gecko.driver", pathToGeckoDriver);
	}
}
