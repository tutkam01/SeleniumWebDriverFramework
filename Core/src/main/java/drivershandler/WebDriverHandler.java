package drivershandler;

import java.io.File;

public class WebDriverHandler {

	public static void loadGeckoDriver() {
		System.out.println(System.getProperty("user.dir"));
		System.out.println(WebDriverHandler.class.getClassLoader().getResource("drivers/geckodriver.exe").getPath());
		String pathToGeckoDriver = WebDriverHandler.class.getClassLoader().getResource("drivers/geckodriver.exe").getPath();
		System.out.println("Path to geckodriver" + pathToGeckoDriver);
//		System.setProperty("webdriver.gecko.driver", pathToGeckoDriver);
		
		File file = new File(System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
//		System.out.println(System.getProperty("user.dir"));
		System.out.println("File from user dir" + file.getAbsolutePath());
	}
}
