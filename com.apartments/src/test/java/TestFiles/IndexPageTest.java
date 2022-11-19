package TestFiles;

import PageLibrary.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class IndexPageTest extends BasePage {

    @Test
    public void navigateToNewAccountPageTest()  {
        IndexPage indexPage = new IndexPage();
        NewAccountPage newAccountPage = new NewAccountPage();
        indexPage.CreateNewAccount();
        waitForVisibilityOfElement(newAccountPage.CreateAccontHeading);
        assertTrue(newAccountPage.CreateAccontHeading.isDisplayed());
    }

    @Test
    public void validateNavigationToHelpCenter()
    {
        HelpCenterPage helpCenterPage= new HelpCenterPage();
        IndexPage indexPage = new IndexPage();
        boolean flag = indexPage.navigeteToHelpCenter().HelpCenterLogo.isDisplayed();
        waitForVisibilityOfElement(helpCenterPage.HelpCenterLogo);
        assertTrue(flag);
    }

    @Test
    public void validationOfMoreApptPage()
    {
        IndexPage indexPage = new IndexPage();
        AppartmentResultsPage appartmentResultsPage= new AppartmentResultsPage();
        indexPage.searchMoreAppartment();
        String actual = (appartmentResultsPage.MoreAppartment.getText());
        String actu = actual.substring(actual.indexOf("")+6);
        Assert.assertEquals(actu, "Apartments Available");
    }

    @Test
    public void changingLanguageToSpanish()
    {
        IndexPage indexPage= new IndexPage();
        EspanolPage espanolPage = new EspanolPage();
        indexPage.changeLanguage();
        String text = espanolPage.EspanolLanguage.getText();
        Assert.assertEquals(text, "Español");

    }
}
