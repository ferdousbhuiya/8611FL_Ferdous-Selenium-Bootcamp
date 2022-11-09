package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChattingPage extends BasePage {

    @FindBy(xpath = "//span[@class='support_header_title'][normalize-space()='Chat with us']")
    public WebElement ChatWithUs;

    public ChattingPage()
    {
        PageFactory.initElements(driver, this);
    }




}
