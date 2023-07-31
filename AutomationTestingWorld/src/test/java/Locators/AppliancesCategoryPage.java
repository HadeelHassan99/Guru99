package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppliancesCategoryPage{

    public static WebDriver driver = null;

    public AppliancesCategoryPage (WebDriver driver){ AppliancesCategoryPage.driver = driver;}
    public WebElement itemSelectedLocation() {
        return driver.findElement(By.xpath("//a[@class='product-item-link']"));}

    public WebElement addToCardLocation() {
        return driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));}
}

