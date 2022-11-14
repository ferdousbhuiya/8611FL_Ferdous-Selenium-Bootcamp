package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageChangeTest extends BasePage {

    @Test
    public void changingLanguageTest()
    {
        HomePage homePage = new HomePage();
        homePage.ChangelanguageToSpanish();
        String txt = homePage.EnglishPageIndication.getText();
        Assert.assertEquals(txt, "In English");
    }
}
