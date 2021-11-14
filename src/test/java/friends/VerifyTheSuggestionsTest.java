package friends;

import genericLib.Browser;
import genericLib.CustomReport;
import home.LoginOrSignInPage;
import home.WelcomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VerifyTheSuggestionsTest {


    Logger LOG = LogManager.getLogger(VerifyTheSuggestionsTest.class.getName());
    @Test
    public void verifyFriendsSuggestion(){
        LoginOrSignInPage loginPage = PageFactory.initElements(Browser.driver, LoginOrSignInPage.class);
        loginPage.login();
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickOnFriends();
        FriendsPage friendsPage = new FriendsPage();
        friendsPage.clickOnSuggestions();


    }
    @AfterTest
    public void closDriver(){
        Browser.driver.quit();
    }
}
