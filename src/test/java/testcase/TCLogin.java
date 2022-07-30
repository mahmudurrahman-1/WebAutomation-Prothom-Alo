package testcase;

import dataset.StructuredQueryLanguage;
import driver.BaseDriver;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.HomePage;
import pageobjects.RegistrationPage;
import pageobjects.SigninPage;
import utilities.Screenshots;

public class TCLogin extends BaseDriver {
    @Test(description = "Log In testing", dataProvider = "login", dataProviderClass = StructuredQueryLanguage.class)

    @Step("Prthom alo login test case")
    public void login(String email, String pass) {

        /***********
         * All Instances of Classes
         */
        HomePage homepage = new HomePage();
        SigninPage login = new SigninPage();
        RegistrationPage registrationpage = new RegistrationPage();
        SoftAssert softly = new SoftAssert();

        /***********
         * All action goes here
         */
        homepage.waitForPageLoad();
        Screenshots.screenshotForAllure("Home Page");
        //Click login button top right corner
        homepage.Login();
        //wait for log in page load

        login.waitForPageLoad();
        //Softassert checks title equality
        softly.assertEquals(login.loginTitle.getText(),login.logintitletext);
        //fill login inputs and click captcha

        softly.assertTrue(login.loginprocess(email, pass));

        Screenshots.screenshotForAllure("login Done");
        login.loginbutton();


    }


}
