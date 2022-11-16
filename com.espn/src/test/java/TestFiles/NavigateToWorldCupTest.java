package TestFiles;

import PageLibrary.FifaWorldCupPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NavigateToWorldCupTest extends BasePage {

    @Test
    public void testNavigateToWorldCup() {
        HomePage homePage = new HomePage();
        homePage.navigateToSoccerPage().navigateToFifaWorldCupPage();
        String text = "fifa world cup";
        waitForThePresenceOfTheElement(By.xpath("//ul[@class='first-group']/li[1]/span/a/span[2]"));
        assertEquals(text.trim().toLowerCase(), FifaWorldCupPage.fifaWorldCupLink.getText().trim().toLowerCase());
    }

}
