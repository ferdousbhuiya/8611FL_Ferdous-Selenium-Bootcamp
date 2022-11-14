package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizePage extends BasePage {

    @FindBy(xpath = "//a[@class='button-next byo-core-type label-1 theme-core']")
    public WebElement nextButton;

    @FindBy(xpath = "//div[@id='byo-studio-rail-exterior']/div/div[1]")
    public WebElement alpineWhiteColor;

    @FindBy(xpath = "//div[@id='byo-studio-rail-exterior']/div/div[1]")
    public WebElement aeroBiColor;

    @FindBy(xpath = "//div[@id='byo-studio-rail-exterior']/div/div[1]")
    public WebElement blackPerforated;

    @FindBy(xpath = "//div[@class='rail-cta-container']/a[1]")
    public WebElement getQuoteButton;



    public CustomizePage() {
        PageFactory.initElements(driver, this);

    }

    public GetYourQuotePage customizeCar() {

        clickOnElement(nextButton);;
        clickOnElement(alpineWhiteColor);
        clickOnElement(nextButton);
        clickOnElement(aeroBiColor);
        clickOnElement(getQuoteButton);
        return new GetYourQuotePage();
    }
}
