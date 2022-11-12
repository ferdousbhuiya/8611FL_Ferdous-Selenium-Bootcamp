package TestFiles;

import PageLibrary.EspanolPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageChangeTest extends BasePage {


    @Test
    public void LanguageChangingTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        EspanolPage espanolPage = new EspanolPage();
        homePage.changingLanguage();
        //fluentWait.until(ExpectedConditions.visibilityOf(espanolPage.SpanishPageText));
        String text = driver.getCurrentUrl();
        Assert.assertEquals(text, "https://www.verizon.com/");
    }
}
