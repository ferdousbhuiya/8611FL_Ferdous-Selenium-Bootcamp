package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.PlayStorePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class DownloadEspnAppTest extends BasePage {
    @Test
    public void testDownLoadEspnApp(){
        HomePage homePage = new HomePage();
        homePage.downloadEspnApp().downloadAndroidApp();
        switchToTab();
        assertTrue(isElementVisible(PlayStorePage.installButton));

    }

}
