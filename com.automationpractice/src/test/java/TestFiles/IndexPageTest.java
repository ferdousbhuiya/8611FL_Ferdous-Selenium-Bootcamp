package TestFiles;

import PageLibrary.IndexPage;
import base.BasePage;
import org.openqa.selenium.devtools.v96.log.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexPageTest extends BasePage {

    private IndexPage indexPage= new IndexPage();



    @Test(groups = "Smoke")
    public void verifyLogo() throws Throwable {

        indexPage= new IndexPage();
        boolean result=indexPage.validateLogo();
        Assert.assertTrue(result);
    }

    @Test
    public void verifyTitle() {
        String actTitle=indexPage.getMyStoreTitle();
        Assert.assertEquals(actTitle, "My Store");
    }
}
