package pom;

import org.openqa.selenium.By;

public class LoginPage {
	public void Login(String userID, String Password) {
		DriverClass.getWebDriver().findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"))
				.sendKeys(userID);
		DriverClass.getWebDriver().findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"))
				.sendKeys(Password);
	}
}
