package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.NflPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class NBAScoreTest extends BasePage {
    @Test
    public void testNflScore(){
        HomePage homePage = new HomePage();
        homePage.NBAScoreTesting();
        assertTrue(isElementVisible(NflPage.nflScoreText));
    }

}
