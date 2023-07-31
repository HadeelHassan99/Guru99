package Actions;

import Locators.AppliancesCategoryPage;
import Locators.CheckOutPage;
import Locators.HomePage;
import org.openqa.selenium.support.ui.Select;
import static TestBase.testBase.driver;



public class actions {
    HomePage homePage = new HomePage(driver);
    AppliancesCategoryPage categoryPage = new AppliancesCategoryPage(driver);
    CheckOutPage checkOutPage = new CheckOutPage(driver);

    public void selectAppliancesCategory() {homePage.appliancesCategoryLocation().click();}
    public void selectItem() {categoryPage.itemSelectedLocation().click();}
    public void addItemToCard() {categoryPage.addToCardLocation().click();}
    public void proceedToCheckOut() {checkOutPage.proceedToCheckOutButtonLocation().click();}
    public void enterEmailAddress(String username) {checkOutPage.emailAddressTextBoxLocation().sendKeys(username);}
    public void enterFirstName(String firstName) {checkOutPage.firstNameTextBoxLocation().sendKeys(firstName);}
    public void enterLastName(String lastName) {checkOutPage.lastNameTextBoxLocation().sendKeys(lastName);}
    public void selectState(String value) {
        new Select(checkOutPage.stateDropDownLocation()).selectByValue(value);
        }
    public void enterCity(String city) {checkOutPage.cityTextBoxLocation().sendKeys(city);}
    public void enterStreetAddress(String streetAddress) {checkOutPage.streetAddressTextBoxLocation().sendKeys(streetAddress);}
    public void enterPhoneNumber(String phoneNumber) {checkOutPage.phoneNumberTextBoxLocation().sendKeys(phoneNumber);}
    public void selectPaymentMethod() {checkOutPage.paymentMethodsButtonLocation().click();}




}
