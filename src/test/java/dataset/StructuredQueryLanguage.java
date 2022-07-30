package dataset;

import io.qameta.allure.Step;
import org.testng.annotations.DataProvider;

import java.rmi.registry.Registry;

public class StructuredQueryLanguage {

    @Step("Registry")
    @DataProvider(name="registration")
    public static Object[][] registration(){
        Object[][] data ={{}};
        return data;
    }
}
