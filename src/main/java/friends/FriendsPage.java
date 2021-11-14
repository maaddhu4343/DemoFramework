package friends;

import genericLib.Browser;
import genericLib.WebDriverCommonLib;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FriendsPage extends WebDriverCommonLib {
    static Logger log = LogManager.getLogger(Browser.class.getName());

    By suggestion = By.xpath("//span[contains(text(),'Suggestions')]");


    public void clickOnSuggestions() {
        log.info("***clickOnSuggestions**");
        try {
            WebElement ele = findWebElement(suggestion);
            waitForElementClickable1(suggestion);
            ele.click();
        }catch (Exception e){
            log.error("Failed click on Suggetion "+e.getMessage());
        }
    }
}