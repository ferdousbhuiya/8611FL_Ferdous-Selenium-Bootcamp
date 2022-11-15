package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class ContactInformationPage extends BasePage {

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//div[@name='company']/input[@class='search']")
    public WebElement companyInput;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    public WebElement saveButton;


    @FindBy(xpath = "//body/div[@id='ui']/div/div/div[@id='main-content']/div/div[@id='dashboard-toolbar']/div[1]")
    public WebElement EventTitle;
    @FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
    public static WebElement contactName;

    public ContactInformationPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void fillOutContactInformation() {
        clearSendKeysToElement(firstName, GenerateData.firstName());
        clearSendKeysToElement(lastName, GenerateData.lastName());
        clearSendKeysToElement(companyInput, GenerateData.Company());
        clickOnElement(saveButton);
    }


}
