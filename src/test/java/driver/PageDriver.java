package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;

public class PageDriver {
    private PageDriver(){
        //empty because of privacy
    }

    //creating Pagedriver instance in the sameclass
    private static PageDriver currentpagedriver =null;
    //Threadlocal class is used to create thread local varibales to read and write by the same thread
    private static final ThreadLocal<WebDriver> webdriver = new ThreadLocal<WebDriver>();
    //now pagedriver instance under getinstacemethod
    public static PageDriver getinstance(){
        if(currentpagedriver==null){
            currentpagedriver=new PageDriver();
        }
        return currentpagedriver;
    }
    /*********
     * Threadlocal set
     */
    public void setdriver(WebDriver driver){
        webdriver.set(driver);
    }
    /*********
     * Threadlocal get
     */
    public WebDriver getdriver(){
        return webdriver.get();
    }
    /************
     * get current driver and static to access directly
     */
    public static WebDriver getCurrentDriver(){
        return getinstance().getdriver();
    }

}
