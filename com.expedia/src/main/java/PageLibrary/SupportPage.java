package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class SupportPage extends BasePage {

    @FindBy(xpath = "//div[@class='banner banner-container']/div[4]/button")
    public WebElement chatButton;

    @FindBy(xpath = "//textarea[@id='mousetrap-footer-0']")
    public WebElement textArea;

    @FindBy(xpath = "//button[@aria-label='Send your Message']")
    public WebElement sendButton;

    @FindBy(xpath = "//div[@class='vac_iframes_wrapper vac_iframes_wrapper_slide-in vac_chat']/iframe")
    public WebElement iframeChat;

    @FindBy(xpath = "//div[@class='vac_iframes_wrapper vac_fab vac_iframes_wrapper_slide-in']/iframe")
    public WebElement iframe2Chat;
    @FindBy(xpath = "//div[@class='uitk-spacing message-bubble-container contains-text']")
    public static WebElement chatMessages;

    @FindBy(xpath = "//button[contains(text(),'Chat now')]")
    public static WebElement iframeChatButton;

    public SupportPage() {
        PageFactory.initElements(driver, this);
    }

    public void startChatting() {
        waitForVisibilityOfElement(chatButton);
        waitForVisibilityOfElement(iframe2Chat);
        switchToFrameByElement(iframe2Chat);
        jsClickOnElement(iframeChatButton);
        switchToParentFrame();
        waitForVisibilityOfElement(iframeChat);
        switchToFrameByElement(iframeChat);
        sendKeysToElement(textArea, GenerateData.state());
        waitForVisibilityOfElement(sendButton);
        jsClickOnElement(sendButton);
    }
}
