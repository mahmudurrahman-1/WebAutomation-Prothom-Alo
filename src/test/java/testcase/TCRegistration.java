package testcase;

import dataset.StructuredQueryLanguage;
import driver.BaseDriver;
import io.qameta.allure.Step;
import org.asynchttpclient.util.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.HomePage;
import pageobjects.RegistrationPage;
import pageobjects.SigninPage;
import utilities.Screenshots;

import java.security.Signature;

public class TCRegistration extends BaseDriver {
    @Test(description = "Registration testing", dataProvider = "registration", dataProviderClass = StructuredQueryLanguage.class)

    @Step("Prthom alo registation test case")
    public void registration(String name, String email, String pass, String cpass) throws InterruptedException {

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
        //click on create an account button bottom of log in module
        login.createac();
        //Wait for registration page
        registrationpage.waitForPageLoad();
        //Softassert checks title equality
        softly.assertEquals(registrationpage.registrationTitle.getText(),registrationpage.registrationtitletext);
        //fill registration inputs and click captcha

        softly.assertTrue(registrationpage.registrationprocess(name, email, pass, cpass));
        //Wait for 10 seconds
        Thread.sleep(10000);
        Screenshots.screenshotForAllure("Registration Done");
        registrationpage.registrationbuttontrigger();
        registrationpage.Proceedlogin();

    }
}
