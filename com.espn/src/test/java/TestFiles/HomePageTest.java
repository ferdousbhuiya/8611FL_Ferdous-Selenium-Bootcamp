package TestFiles;

import PageLibrary.FantasyPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class HomePageTest extends BasePage {
//FantasyPage fantasyPage= new FantasyPage();
@Test
public void validateNavigationToFantasyPage()
    {
        HomePage homePage= new HomePage();
        homePage.navigateToFantasyHome();
        assertTrue(isElementVisible(FantasyPage.FantasyLogo));

    }

}
