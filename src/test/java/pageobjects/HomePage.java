package pageobjects;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class HomePage extends Common {
    public HomePage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /*****
     * Locators
     */
    //login button
    @FindBy(className = "button-m__type4__3WG12")
    public WebElement loginbutton;

    /*******
     * Actions
     */

    public void Login(){
        loginbutton.click();
    }

}
