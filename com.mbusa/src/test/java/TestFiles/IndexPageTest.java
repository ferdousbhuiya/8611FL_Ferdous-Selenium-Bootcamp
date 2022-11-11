package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.IndexPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class IndexPageTest extends BasePage {

    @Test
    public void DealerLocationTest()
    {
        HomePage homePage = new HomePage();
        homePage.dealerSearch();
        String ext = driver.getCurrentUrl();
        //https://www.mbusa.com/en/dealers/searchLocation-33065/searchByType-zip/filter-mbdealer
        Assert.assertEquals(ext, "https://www.mbusa.com/en/dealers/searchLocation-"+
                (excel.readStringArrays("Sheet2")[5][0])+"/searchByType-zip/filter-mbdealer");
    }

    @Test
    public void SubscriptionTest() throws InterruptedException {
        IndexPage indexPage = new IndexPage();
        boolean flag = indexPage.subscriptionbyEmail().ThankYouNotice.isDisplayed();
        assertTrue(flag);

    }

    @Test
    public void visitingToYoutubePageTest()
    {
        IndexPage indexPage = new IndexPage();
        indexPage.visitTheYoutubePage();
        String text = driver.getCurrentUrl();
        Assert.assertEquals(text, "https://www.youtube.com/mbusa");
    }

    @Test
    public void visitingTheChargingInstructionPageTest()
    {
        IndexPage indexPage = new IndexPage();
        String text = indexPage.visitTheChargingInstruction().ShowingTheSubHeading();
        Assert.assertEquals(text, "How to Start a Charging Session");
    }



}
