package pageobjects;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

import java.util.List;

public class SigninPage extends Common {
    public SigninPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /*****
     * Locators
     */

    /*****
     * Locators
     */
    @FindBy(className = "login-m__login-text__Byb8Q")
    public WebElement loginTitle;
    public String logintitletext = "Login";

    @FindBy(css = "input[name='email']")
    public WebElement email;
    @FindBy(css = "input[name='password']")
    public WebElement password;
    @FindBy(xpath = "//span[contains(text(),'LOGIN')]")
    public WebElement loginsubmitbutton;
    @FindBy(xpath = "//a[contains(text(),'Create an account')]")
    public WebElement createaccount;

    /*******
     * Actions
     */
    public Boolean loginprocess(String Email, String Password) {

        sendText(email, Email);
        sendText(password, Password);
        return true;
    }


    public void loginbutton() {
        loginsubmitbutton.click();
    }

    /*******
     * Actions for Create account
     */
    public void createac() {
        createaccount.click();
    }
}
