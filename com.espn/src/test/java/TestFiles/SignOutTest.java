package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;

public class SignOutTest extends BasePage {

    @Test
    public void testSignOut() throws SQLException {
        HomePage homePage = new HomePage();
        homePage.singIn().signOut();
        waitForVisibilityOfElement(HomePage.userIcon);
        retryingFindClick(By.id("global-user-trigger"));
        assertTrue(isElementVisible(HomePage.signInButton));

    }
}
