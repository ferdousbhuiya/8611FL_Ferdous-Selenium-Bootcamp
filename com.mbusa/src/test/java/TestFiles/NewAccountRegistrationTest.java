package TestFiles;

import PageLibrary.RegistrationPage;
import base.BasePage;
import org.testng.annotations.Test;
import utils.GenerateData;

import static org.testng.AssertJUnit.assertTrue;

public class NewAccountRegistrationTest extends BasePage {

    @Test
    public void newAccountRegistrationTest()
    {
        RegistrationPage registrationPage= new RegistrationPage();
        String Ema = GenerateData.email(), Fname = GenerateData.firstName(),
                lname = GenerateData.password(), pswd= GenerateData.password();
        Boolean flag = registrationPage.RegisterNewAccount(Ema, Fname, lname,pswd)
                .CpnfirmationTitlebar.isDisplayed();
        assertTrue(flag);
    }
}
