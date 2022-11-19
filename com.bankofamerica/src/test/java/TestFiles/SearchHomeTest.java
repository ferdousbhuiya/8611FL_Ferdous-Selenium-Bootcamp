package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SecurityPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class SearchHomeTest extends BasePage {

    @Test
    public void testSearchingHome()  {
        HomePage homePage= new HomePage();
        homePage.clickHomeLoanLink().searchingForHomeLoan();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Home Search - Find Real Estate for Sale from Bank of America | Real Estate Center | Homepage");
    }

    @Test
    public void SecurityPageTest()
    {
        HomePage homePage= new HomePage();
        homePage.NavigateToSecurityPage();
        SecurityPage securityPage = new SecurityPage();
        String actual = securityPage.SecurityPageHeading.getText();

        Assert.assertEquals(actual, "Online and Mobile Banking Security Guarantee");

    }
}
