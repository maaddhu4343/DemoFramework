package genericLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverCommonLib {


    public void waitForPageToLoad(){
        Browser.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void waitForElementsPresent(WebElement element){
        WebDriverWait driverWait = new WebDriverWait(Browser.driver,20);
        driverWait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForElementClickable(WebElement element){
        WebDriverWait driverWait = new WebDriverWait(Browser.driver,20);
        driverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void clickOnElement(WebElement element){
        waitForElementClickable(element);
        element.click();
    }
    public void sendDataToTextBox(WebElement element,String input){
        waitForElementsPresent(element);
        element.sendKeys(input);
    }
    public String getElementText(WebElement element){
        waitForElementsPresent(element);
        return element.getText();
    }
    //-------------------------------------------------------------------------------
    public void waitForElementClickable1(By object){
        WebDriverWait driverWait = new WebDriverWait(Browser.driver,20);
        driverWait.until(ExpectedConditions.elementToBeClickable(object));
    }
    public void waitForElementsPresent1(By object){
        WebDriverWait driverWait = new WebDriverWait(Browser.driver,20);
        driverWait.until(ExpectedConditions.visibilityOf(Browser.driver.findElement(object)));
    }
    public WebElement findWebElement(By object){
        waitForElementsPresent1(object);
        WebElement element = Browser.driver.findElement(object);
        return element;
    }

}
