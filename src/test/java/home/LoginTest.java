package home;

import genericLib.Browser;
import genericLib.WebDriverCommonLib;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends Browser {


    @Test
    public void loginTest(){
        try {
            LoginOrSignInPage loginPage = PageFactory.initElements(Browser.driver, LoginOrSignInPage.class);
            loginPage.login();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
