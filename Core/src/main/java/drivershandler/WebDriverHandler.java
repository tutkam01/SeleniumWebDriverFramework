package drivershandler;

import java.io.File;

public class WebDriverHandler {

	public static void loadGeckoDriver() {
		File file = new File(System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		System.out.println("Webdriver gecko driver location: " + file.getAbsolutePath());
	}
}
