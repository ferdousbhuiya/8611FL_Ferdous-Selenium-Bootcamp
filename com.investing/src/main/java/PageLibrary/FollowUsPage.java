package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FollowUsPage extends BasePage {
    @FindBy(xpath = "//a[@title='Facebook']")
    public WebElement Facebook;

    @FindBy(xpath = "//a[@title='Twitter']")
    public WebElement Twitter;
    public FollowUsPage()
    {
        PageFactory.initElements(driver, this);
    }
    public FacebookPage moveToTheEnd()
    {
        scrollDown(Facebook);
        moveToElementAndClick(Facebook);
        return new FacebookPage();
    }

    public TwitterPage moveToTwitter()
    {
        scrollDown(Twitter);
        moveToElementAndClick(Twitter);
        return new TwitterPage();
    }


}
