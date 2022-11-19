package TestFiles;

import PageLibrary.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class PlayVideoTest extends BasePage {
    @Test
    public void VideoPlayingTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.VideoPlay();
        wait(5000);
        homePage.PauseVideo();
        assertTrue(isElementVisible(homePage.pauseVideo));
    }
}
