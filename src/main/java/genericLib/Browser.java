package genericLib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    static Logger log = LogManager.getLogger(Browser.class.getName());

    public static WebDriver driver;
    static {
        driver = getBrowser();
    }
    public static WebDriver getBrowser(){
        try {
            if (Constants.browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "Resorces\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                log.info("Chrome Browser Launched");
            } else if (Constants.browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.geckodriver.driver", "Resorces\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }catch (Throwable e){
            log.error("Failed to launch Browser :::::"+e.getMessage());
        }
        driver.manage().window().maximize();
        return driver;
        
        //DEMO COmmt
    }


}
