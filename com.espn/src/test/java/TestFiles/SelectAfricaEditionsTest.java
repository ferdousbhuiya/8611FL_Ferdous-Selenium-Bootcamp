package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SelectAfricaEditionsTest extends BasePage {
    @Test
    public void CountryEditionSelection() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.CountryEditionSelection();
        assertEquals("Edition: UK",homePage.EditionListInSignInContainer.get(1).getText());

    }

    @Test
    public void NFLVideoTest()
    {
        HomePage homePage = new HomePage();
        homePage.singIn();
        homePage.NFLVideoPlayTest();
    }

}
