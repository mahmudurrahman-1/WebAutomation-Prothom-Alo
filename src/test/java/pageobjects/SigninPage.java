package pageobjects;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class SigninPage extends Common {
    public SigninPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /*****
     * Locators
     */

    @FindBy(xpath = "//a[contains(text(),'Create an account')]")
    public WebElement createaccount;

    /*******
     * Actions
     */
    public void createac() {
        createaccount.click();
    }
}
