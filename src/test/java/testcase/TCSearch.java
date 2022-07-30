package testcase;

import dataset.StructuredQueryLanguage;
import driver.BaseDriver;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import utilities.Screenshots;

public class TCSearch extends BaseDriver {
    @Test(description = "Search Module",dataProvider = "searchdata",dataProviderClass = StructuredQueryLanguage.class)
    @Step("Checking by entering texts")
    public void search(String search){
        //Instances of Class
        HomePage home = new HomePage();
        //Actions of instances
        home.searchthingsbytexts(search);
        home.searchSubmit();
        Screenshots.screenshotForAllure("Search Results");
    }
}
