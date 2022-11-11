package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.IndexPage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BasePage {

    @Test
    public void LoginTesting()
    {
        HomePage homePage = new HomePage();
        IndexPage indexPage = new IndexPage();
        String username = excel.readStringArrays("Sheet1")[0][1];
        String paswd = excel.readStringArrays("Sheet1")[0][2];
        indexPage.LognIn(username, paswd);
        waitForThePresenceOfTheElement(By.xpath("//span[@class='global-header__menu-l1-list-button-label global-header__menu-l1-list-button-utility-inner']"));
        boolean flag = homePage.UserNameDisplay.isDisplayed();
        assertTrue(flag);
    }
}
