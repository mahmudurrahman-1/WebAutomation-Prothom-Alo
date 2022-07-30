package dataset;

import io.qameta.allure.Step;
import org.testng.annotations.DataProvider;

import java.rmi.registry.Registry;

public class StructuredQueryLanguage {

    @Step("Registry")
    @DataProvider(name = "registration")
    public static Object[][] registration() {
        Object[][] data = {{"Mahmudur Rahman", "mahmudur.rahman.seebpmmpo@gmail.com", "014125678Mr", "014125678Mr"}};
        return data;
    }
}
