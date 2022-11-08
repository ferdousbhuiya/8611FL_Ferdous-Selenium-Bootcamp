package TestFiles;

import PageLibrary.FollowUsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FollowUsPageTest extends BasePage {

    @Test
    public void NavigateToFacebookPage()
    {
        FollowUsPage followUsPage = new FollowUsPage();
        followUsPage.moveToTheEnd();
        switchToTab();
        String facebookurl = driver.getCurrentUrl();
        Assert.assertEquals(facebookurl, "https://www.facebook.com/investingdotcom");
    }

    @Test
    public void NavigateToTwitterPage()
    {
        FollowUsPage followUsPage = new FollowUsPage();
        followUsPage.moveToTwitter();
        switchToTab();
        String actual = driver.getCurrentUrl();
        String twitterURL = "https://twitter.com/investingcom";
        Assert.assertEquals(actual, twitterURL);
    }
}
