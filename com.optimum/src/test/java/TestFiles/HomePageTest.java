package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {

    @Test
    public void registerToTheSiteTest()
    {
        HomePage homePage = new HomePage();
        homePage.RegisterTo();
    }

    @Test
    public void SearcingLocationTest()
    {
        HomePage homePage = new HomePage();
        homePage.searchForVisitLocation();

    }


}
