package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Common;

public class HomePage extends Common {
    /*****
     * Locators
     */
    //login button
    @FindBy(id="paloash_ct")
    public WebElement closepopup;
    @FindBy(className="button-m__type4__3WG12")
    public WebElement loginbutton;

    /*******
     * Actions
     */
    public void Login(){
        closepopup.click();
        loginbutton.click();
    }
}
