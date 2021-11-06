package friends;

import genericLib.WebDriverCommonLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FriendsPage extends WebDriverCommonLib {

    By suggestion = By.xpath("//span[contains(text(),'Suggestions')]");


    public void clickOnSuggestions() {
        WebElement ele = findWebElement(suggestion);
        waitForElementClickable1(suggestion);
        ele.click();
    }
}