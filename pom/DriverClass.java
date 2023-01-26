package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
	static WebDriver driver;

	public void setUp() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://www.demo.guru99.com/V4/index.php");
	}

	public static WebDriver getWebDriver() {
		return driver;
	}
}
