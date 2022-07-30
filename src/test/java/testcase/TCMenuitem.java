package testcase;

import driver.BaseDriver;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.HomePage;

import utilities.Screenshots;

public class TCMenuitem extends BaseDriver {
    @Test(description = "Checking menu button")
    @Step("Click menu button and scroll")
    public void Menu(){
        /***********
         * All Instances of Classes
         */
        HomePage homepage = new HomePage();
        SoftAssert softly = new SoftAssert();

        /***********
         * All action goes here
         */
        homepage.waitForPageLoad();
        homepage.Menubar();
        Screenshots.screenshotForAllure("Menubar");
        //inside religion scroll down to last container and check headlines equality with assertion
        homepage.ThirdContainer();
        softly.assertEquals(homepage.Secondlink,homepage.textTwo);
    }
}
