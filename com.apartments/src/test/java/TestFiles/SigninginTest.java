package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class SigninginTest extends BasePage {

    @Test
    public void SignInUsingExistentAccount() throws SQLException, SQLException {
        HomePage homePage= new HomePage();
        homePage.signInUsingExistentAccount();


    }

}
