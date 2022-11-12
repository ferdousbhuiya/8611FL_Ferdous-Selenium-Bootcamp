package TestFiles;

import PageLibrary.AnalysisPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnalysisPageTest extends BasePage {

    @Test
    public void analysisPageTest()
    {
        AnalysisPage analysisPage=new AnalysisPage();
        HomePage homePage = new HomePage();
        homePage.Analysis();
        String actual = analysisPage.SubHeadingOfAnalysisPage.getText();
        System.out.println(actual);

        Assert.assertEquals(actual, "Analysis & Opinion");

    }
}
