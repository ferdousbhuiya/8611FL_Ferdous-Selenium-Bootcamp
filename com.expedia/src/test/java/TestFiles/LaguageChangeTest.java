package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LaguageChangeTest extends BasePage {

    @Test
    public void testSwitchCountryLanguage(){

        HomePage homePage =new HomePage();
        homePage.switchCountryLanguage();
        waitForVisibilityOfElement(HomePage.LanguageChange);
        assertTrue(HomePage.LanguageChange.isDisplayed());
    }
}
