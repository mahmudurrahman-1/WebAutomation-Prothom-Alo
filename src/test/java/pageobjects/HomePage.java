package pageobjects;

import driver.PageDriver;
import io.qameta.allure.Step;
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
    @FindBy(className = "hamburger-m__hamburger__2Oc5s")
    public WebElement menubutton;
    @FindBy(className = "verticalMenubar-m__navbar-container__2TSE0")
    public WebElement scrollContainer;

    @FindBy(xpath = "//a[contains(text(),'ধর্ম')]")
    public WebElement religion;
    @FindBy(className = "stories2AdWithLoadMore-m__wrapper__2Nvc4")
    public WebElement insideRel;

    @FindBy(xpath = "//a[contains(text(),'বায়তুল মোকাররমে ঈদের প্রথম জামাত অনুষ্ঠিত')]")
    public WebElement Secondlink;
    public String textTwo="বায়তুল মোকাররমে ঈদের প্রথম জামাত অনুষ্ঠিত";

    /***** Search Module locators ******/
    @FindBy(className = "search-icon-wrapper")
    public WebElement searchButton;
    @FindBy(id="searchForm")
    public WebElement searchInput;
    @FindBy(className = "navbarSearch-m__search__form-submit__1OukE")
    public WebElement searchSubmit;
    /*******
     * Actions
     */

    @Step("Search by texts")
    public void searchthingsbytexts(String text){
        searchButton.click();
        sendText(searchInput,text);
    }
    public void searchSubmit(){
       searchSubmit.click();
    }
    /*******
     * Actions
     */

    public void Login(){
        loginbutton.click();
    }
    @Step("Checking menubar")
    public void Menubar(){
        menubutton.click();
        scrollToElement(religion);
        religion.click();
    }
    @Step("scroll down inside religion")
    public void ThirdContainer(){
        scrollToElement(insideRel);
    }

}
