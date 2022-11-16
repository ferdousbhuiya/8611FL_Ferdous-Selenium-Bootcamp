package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.NflSchedulePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class NflScheduleTest extends BasePage {

    @Test
    public void testNflSchedule(){
        HomePage homePage = new HomePage();
        homePage.nflSchedule();
        assertTrue(isElementVisible(NflSchedulePage.nflScheduleText));
    }


}
