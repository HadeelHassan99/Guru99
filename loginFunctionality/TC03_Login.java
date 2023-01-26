package loginFunctionality;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.DriverClass;
import pom.LoginPage;

public class TC03_Login {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		DriverClass driClass = new DriverClass();
		driClass.setUp();
		driver = DriverClass.getWebDriver();
	}

	@Test
	public void loginFunction() {

		LoginPage LP = new LoginPage();
		LP.Login("mngr473677", "Utedaha");

		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();

		String welcomeMessage = driver
				.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();

		assertEquals(welcomeMessage, "Welcome To Manager's Page of Guru99 Bank");
	}
}