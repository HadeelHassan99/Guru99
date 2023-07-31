package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage{
    static WebDriver driver;

    public CheckOutPage(WebDriver driver){ CheckOutPage.driver = driver;}
    public static WebElement proceedToCheckOutButtonLocation() {
        return driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']"));}

    public WebElement emailAddressTextBoxLocation() {
        return driver.findElement(By.xpath("//input[@name='username']"));}
    public WebElement firstNameTextBoxLocation() {
        return driver.findElement(By.xpath("//input[@name='firstname']"));}
    public WebElement lastNameTextBoxLocation() {
        return driver.findElement(By.xpath("//input[@name='lastname']"));}
    public WebElement stateDropDownLocation() {
        return driver.findElement(By.xpath("//select[@id='N4BQKGF']"));}
    public WebElement cityTextBoxLocation() {
        return driver.findElement(By.xpath("//input[@name='city']"));}
    public WebElement streetAddressTextBoxLocation() {
        return driver.findElement(By.xpath("//input[@name='street[0]']"));}
    public WebElement phoneNumberTextBoxLocation() {
        return driver.findElement(By.xpath("//input[@name='telephone']"));}
    public WebElement paymentMethodsButtonLocation() {
        return driver.findElement(By.xpath("//label[@for='cashondelivery']"));}
}
