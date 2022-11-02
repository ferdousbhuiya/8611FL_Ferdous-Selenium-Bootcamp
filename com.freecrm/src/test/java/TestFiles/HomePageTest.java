package TestFiles;

import PageLibrary.ContactsPage;
import PageLibrary.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {
    HomePage homePage= new HomePage();
    ContactsPage contactsPage= new ContactsPage();


    @Test(priority=1)
    public void verifyHomePageTitleTest(){
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "CRMPRO - CRM software for customer relationship management, sales, and support.","Home page title matched");
    }

    @Test(priority=2)
    public void verifyUserNameTest(){

        contactsPage.switchToFrame();
        Assert.assertTrue(homePage.verifyCorrectUserName());
    }

    @Test(priority=3)
    public void verifyContactsLinkTest(){
        contactsPage = homePage.clickOnContactsLink();
    }

}
