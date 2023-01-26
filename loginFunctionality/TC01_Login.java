package loginFunctionality;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.DriverClass;
import pom.LoginPage;

public class TC01_Login {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		DriverClass driClass = new DriverClass();
		driClass.setUp();
		driver = DriverClass.getWebDriver();
	}

	@Test
	public void blankPasswordField() {

		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).click();

		LoginPage LP = new LoginPage();
		LP.Login("mngr473677", "");

		String blankPasswordErrorMessage = driver.findElement(By.xpath("//*[@id=\"message18\"]")).getText();

		assertEquals(blankPasswordErrorMessage, "Password must not be blank");
	}
}
