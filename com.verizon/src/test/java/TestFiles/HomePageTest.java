package TestFiles;

import PageLibrary.ChattingPage;
import PageLibrary.HomePage;
import PageLibrary.MyVerizonDashboard;
import PageLibrary.RegistrationPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class HomePageTest extends BasePage {


    @Test
    public void SigninToService()
    {
        HomePage homePage = new HomePage();
        RegistrationPage registrationPage = new RegistrationPage();
        homePage.signintoRegistrationPage();
        String UserEmail = excel.readStringArrays("Sheet1")[0][1];
        String Password = excel.readStringArrays("Sheet1")[0][2];
        System.out.println("Username and Password : "+ UserEmail+" ,"+Password);
        registrationPage.SigninToAccount(UserEmail, Password);
        assertTrue(isElementVisible(MyVerizonDashboard.signOutButton));
    }
    @Test
    public void SignOutTest()
    {
        HomePage homePage = new HomePage();
        MyVerizonDashboard myVerizonDashboard = new MyVerizonDashboard();
        RegistrationPage registrationPage = new RegistrationPage();
        homePage.signintoRegistrationPage();
        String UserEmail = excel.readStringArrays("Sheet1")[0][1];
        String Password = excel.readStringArrays("Sheet1")[0][2];
        System.out.println("Username and Password : "+ UserEmail+" ,"+Password);
        registrationPage.SigninToAccount(UserEmail, Password);
        myVerizonDashboard.signOut();

        assertTrue(isElementVisible(registrationPage.signInButton));

    }

    @Test
    public void NavigateToFacebookPageTest()
    {
        HomePage homePage=new HomePage();
        homePage.followInFacebookPage();
        switchToTab();
        String faceb = driver.getCurrentUrl();
        Assert.assertEquals(faceb, "https://www.facebook.com/Fios/");
    }

    @Test
    public void chattingForMobileComplain() throws InterruptedException {
        ChattingPage chattingPage = new ChattingPage();
        HomePage homePage= new HomePage();
        homePage.supportForMobileService();
        waitForVisibilityOfElement(chattingPage.ChatWithUs);
        boolean flag= chattingPage.ChatWithUs.isDisplayed();
        assertTrue(flag);

    }
}
