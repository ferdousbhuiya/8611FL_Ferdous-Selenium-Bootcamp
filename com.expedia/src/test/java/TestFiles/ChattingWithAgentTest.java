package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.SupportPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ChattingWithAgentTest extends BasePage {

    @Test
    public void testChattingWithAgent(){
        HomePage homePage =new HomePage();
        homePage.chatWithVirtualAgent().startChatting();
        waitForVisibilityOfElement(SupportPage.chatMessages);
        assertTrue(SupportPage.chatMessages.isDisplayed());
    }
}
