package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AddToFavoriteTest extends BasePage {

    @Test
    public void testAddingFavorite(){
        HomePage homePage =new HomePage();
        homePage.addFavorite();
        assertEquals(6,HomePage.myLeaguesTable.size());
    }
}
