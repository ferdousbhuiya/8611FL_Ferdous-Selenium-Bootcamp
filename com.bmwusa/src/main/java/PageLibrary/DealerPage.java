package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;

public class DealerPage extends BasePage {
    @FindBy(xpath = "//div[@class='select-selected']")
    public WebElement chooseSeries;

    @FindBy(xpath = "//div[@class='select-wrapper']/ul/li[2]")
    public WebElement seriesList;

    @FindBy(xpath = "//button[@class='continue cta-1']")
    public WebElement continueButton;

    @FindBy(id = "leadFirstName")
    public WebElement firstName;

    @FindBy(id = "leadLastName")
    public WebElement lastName;

    @FindBy(id = "leadEmail")
    public WebElement email;

    @FindBy(id = "leadPhone")
    public WebElement phone;

    @FindBy(id = "leadDisclaimer")
    public WebElement checkBox;

    @FindBy(id = "leadDisclaimerTCPA")
    public WebElement checkBox1;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement submitButton;
    @FindBy(xpath = "//h2[contains(text(),'Thank you.')]")
    public static WebElement thankYouMessage;


    public DealerPage() {
        PageFactory.initElements(driver, this);
    }

    public DealerPage getTheDealerForm() {
        clickOnElement(chooseSeries);
        clickOnElement(seriesList);
        clickOnElement(continueButton);
        return new DealerPage();
    }

    public void fillOutDealerForm() throws SQLException {
        String query = "SELECT phoneNumber FROM locations.phonenumber where id =1;";
        clearSendKeysToElement(firstName, GenerateData.firstName());
        clearSendKeysToElement(lastName, GenerateData.lastName());
        clearSendKeysToElement(email, GenerateData.email());
        clearSendKeysToElement(phone, db.executeQueryReadOne(query).toString());
        clickOnElement(checkBox);
        clickOnElement(checkBox1);
        clickOnElement(submitButton);
    }
}
