package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationToAppleMusicPageTest extends BasePage {



    @Test
    public void NavigationTest()
    {
        HomePage homePage= new HomePage();
        homePage.NavigateToAppleMusicPage();
        String ex= driver.getCurrentUrl();
        Assert.assertEquals(ex, "https://www.verizon.com/solutions-and-services/apple-music/");
    }
}
