package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    WebDriver driver;

    public HomePage (WebDriver driver){ this.driver = driver;}

    public WebElement appliancesCategoryLocation() {
        return driver.findElement(By.xpath("//a[@title='Appliances'][@target='_self']"));}
}

