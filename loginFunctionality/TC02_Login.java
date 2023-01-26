package loginFunctionality;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.DriverClass;
import pom.LoginPage;

public class TC02_Login {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		DriverClass driClass = new DriverClass();
		driClass.setUp();
		driver = DriverClass.getWebDriver();
	}

	@Test
	public void blankUserIdField() {

		LoginPage LP = new LoginPage();
		LP.Login("", "Utedaha");

		String blankPasswordErrorMessage = driver.findElement(By.xpath("//*[@id=\"message23\"]")).getText();

		assertEquals(blankPasswordErrorMessage, "User-ID must not be blank");
	}
}
