package TestFiles;

import PageLibrary.GetYourQuotePage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestGetQuote extends BasePage {
    @Test
    public void testGetQuote() throws SQLException, SQLException {
        HomePage homePage = new HomePage();
        GetYourQuotePage customizePage = homePage.clickBuildYourOwnLink().clickSelect().clickCustomizeThisBuild().customizeCar();
        switchToTab();
        customizePage.fillOutTheForm();

    }

}
