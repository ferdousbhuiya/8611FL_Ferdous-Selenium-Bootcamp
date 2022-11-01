package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.LoginPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static config.BaseConfig.properties;

public class LoginPageTest extends BasePage {

    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest()
    {
        super();
    }


    @Test(priority=1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
    }

    @Test(priority=2)
    public void crmLogoImageTest(){
        boolean flag = loginPage.validateCRMImage();
        Assert.assertTrue(flag);
    }

    @Test(priority=3)
    public void loginTest(){
        homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
    }



}
