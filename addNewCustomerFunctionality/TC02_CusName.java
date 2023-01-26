package addNewCustomerFunctionality;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.clickNewCustomer;

public class TC02_CusName {

	WebDriver NCdriver;

	@BeforeTest
	public void setUp() {
		clickNewCustomer driClass = new clickNewCustomer();
		driClass.clicNewCustomer();
		NCdriver = clickNewCustomer.getWebNCDriver();
	}

	@Test
	public void nameWithNumbers() {

		NCdriver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("Mm22");

		String errorMessage = NCdriver
				.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/label")).getText();

		assertEquals(errorMessage, "Numbers are not allowed");
	}

}
