package genericLib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverCommonLib {

    Logger log = LogManager.getLogger(WebDriverCommonLib.class.getName());

    public void waitForPageToLoad(){
        Browser.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void waitForElementsPresent(WebElement element){
        WebDriverWait driverWait = new WebDriverWait(Browser.driver,20);
        driverWait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForElementClickable(WebElement element){
        try {
            WebDriverWait driverWait = new WebDriverWait(Browser.driver, 20);
            driverWait.until(ExpectedConditions.elementToBeClickable(element));
        }catch (Exception e){
            log.error("Failed to wait for "+element  +":::::"+e.getMessage());
        }

    }
    public void clickOnElement(WebElement element){
        try {
            waitForElementClickable(element);
            element.click();
        }catch (Exception e){
            log.error("Failed to click on Element"+element +"   ::::::"+e.getMessage());
        }
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
