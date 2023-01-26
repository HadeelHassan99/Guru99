package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class clickNewCustomer {

	static WebDriver NCdriver;

	@BeforeTest
	public void clicNewCustomer() {

		DriverClass driClass = new DriverClass();
		driClass.setUp();
		NCdriver = DriverClass.getWebDriver();
		LoginPage LP = new LoginPage();
		LP.Login("mngr473677", "Utedaha");
		DriverClass.getWebDriver().findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		NCdriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();

	}

	public static WebDriver getWebNCDriver() {
		return NCdriver;
	}
}
