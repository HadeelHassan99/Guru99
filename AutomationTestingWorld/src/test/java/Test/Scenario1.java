package Test;

import Actions.actions;
import Locators.CheckOutPage;
import TestBase.testBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Scenario1 {
    public static class SelectItemThenCheckOutTest extends testBase{
        static WebDriverWait wait;
        @Test
        public static void selectAppliancesCategory() throws InterruptedException {

           actions action = new actions();
            action.selectAppliancesCategory();
            action.selectItem();
            action.addItemToCard();
            Thread.sleep(9000);
            action.proceedToCheckOut();
            action.enterEmailAddress("slzzlmd778@qemail.org");
            action.enterFirstName("Testing");
            action.enterLastName("World");
            action.enterCity("6 October");
            action.enterStreetAddress("30.st");
            action.enterPhoneNumber("01111111111");
            Thread.sleep(10000);
            action.selectPaymentMethod();
            action.selectState("719");
        }
    }
}
