package TestFiles;

import PageLibrary.SmallBusinessFinancialAdvicePage;
import PageLibrary.HomePage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class SmallBusinessFinancingTest extends BasePage {

    @Test
    public void testingFranchiseFinancing()  {
        HomePage homePage = new HomePage();
        SmallBusinessFinancialAdvicePage smallBusinessFinancialAdvicePage
        = new SmallBusinessFinancialAdvicePage();
        String actual = homePage.clickSmallBusinessLink().clickFranchiseFinancingLink().
                getTrimmedElementText(smallBusinessFinancialAdvicePage.BusinessPageHeading);
        Assert.assertEquals(actual, "Small Business Loans & Financing");
    }
}
