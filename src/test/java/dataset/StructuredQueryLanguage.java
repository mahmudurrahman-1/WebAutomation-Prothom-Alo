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
    @Step("Login")
    @DataProvider(name = "login")
    public static Object[][] login() {
        Object[][] data = {{"mahmudur.rahman.seebpmmpo@gmail.com", "014125678Mr"}};
        return data;
    }
    @Step("Search")
    @DataProvider(name = "searchdata")
    public static Object[][] search() {
        Object[][] data = {{"জম্মু"},{"পদ্মাসেতু"},{"লক্ষীপুর"},{"রামগঞ্জ"},{"ভোলা"},{"বরিশাল"},{"pakistan"},{"afganistan"},{"bangladesh"},{"Islam"},{"india"},{"al saudia"}};
        return data;
    }
}
