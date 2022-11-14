package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThingsToDoTest extends BasePage {

    @Test
    public void thingsToDoTest()
    {
        HomePage homePage = new HomePage();
        String txt = homePage.ThingsTodo().TextOfSubheading();
        Assert.assertEquals(txt, "Top 10 things to do");

    }
}
