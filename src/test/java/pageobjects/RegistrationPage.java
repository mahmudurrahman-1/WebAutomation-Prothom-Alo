package pageobjects;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class RegistrationPage extends Common {
    public RegistrationPage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /*****
     * Locators
     */
    @FindBy(className = "signup-m__signup-text__2pxoM")
    public WebElement registrationTitle;
    public String registrationtitletext = "Create an account";
    @FindBy(css = "input[name='name']")
    public WebElement name;
    @FindBy(css = "input[name='email']")
    public WebElement email;
    @FindBy(css = "input[name='password']")
    public WebElement password;
    @FindBy(css = "input[name='confirmPassword']")
    public WebElement confirmPassword;
    @FindBy(className = "button-m__type3__3Bn4T")
    public WebElement registrationbutton;
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public WebElement loginbutton;
//rc-anchor-checkbox-holder
    /**********
     * Actions
     */
    public Boolean registrationprocess(String Name, String Email, String Password, String ConfirmPassword) {
        sendText(name, Name);
        sendText(email, Email);
        sendText(password, Password);
        sendText(confirmPassword, ConfirmPassword);
        return true;
    }

    public void registrationbuttontrigger() {
        registrationbutton.click();
    }
    public void Proceedlogin() {
        loginbutton.click();
    }
}













