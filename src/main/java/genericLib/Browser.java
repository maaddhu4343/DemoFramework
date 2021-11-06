package genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    public static WebDriver driver;
    static {
        driver = getBrowser();
    }
    public static WebDriver getBrowser(){
        if (Constants.browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\prath\\IdeaProjects\\DemoFramwork\\Resorces\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (Constants.browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.geckodriver.driver","C:\\Users\\prath\\IdeaProjects\\DemoFramwork\\Resorces\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        return driver;
    }


}
