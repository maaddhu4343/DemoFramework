package home;

import genericLib.Browser;
import genericLib.Constants;
import genericLib.WebDriverCommonLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOrSignInPage extends WebDriverCommonLib {

    @FindBy(id="email") private WebElement ele_userName;
    @FindBy(id="pass") private WebElement ele_password;
    @FindBy(name="login") private WebElement ele_loginBtn;


    public void login(){
        waitForPageToLoad();
        Browser.driver.get(Constants.url);
        sendDataToTextBox(ele_userName,Constants.userName);
        sendDataToTextBox(ele_password,Constants.password);
        clickOnElement(ele_loginBtn);
    }




}
