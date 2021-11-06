package home;

import genericLib.WebDriverCommonLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WelcomePage extends WebDriverCommonLib {


    By homeLink = By.xpath("//a[@aria-label='Home']/span");
    By friendsLink = By.xpath("//a[@aria-label='Friends']/span");
    By groupsLink = By.xpath("//a[@aria-label='Groups']/span");


    public void clickOnFriends(){
        WebElement ele = findWebElement(friendsLink);
        waitForElementClickable1(friendsLink);
        ele.click();
    }

}
