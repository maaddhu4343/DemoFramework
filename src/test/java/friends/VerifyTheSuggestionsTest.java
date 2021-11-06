package friends;

import genericLib.Browser;
import home.LoginOrSignInPage;
import home.WelcomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyTheSuggestionsTest {


    @Test
    public void verifyFriendsSuggestion(){
        LoginOrSignInPage loginPage = PageFactory.initElements(Browser.driver, LoginOrSignInPage.class);
        loginPage.login();
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickOnFriends();
        FriendsPage friendsPage = new FriendsPage();
        friendsPage.clickOnSuggestions();


    }
}
