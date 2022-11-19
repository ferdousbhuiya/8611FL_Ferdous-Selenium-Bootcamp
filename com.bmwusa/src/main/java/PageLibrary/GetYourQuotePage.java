package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;

public class GetYourQuotePage extends BasePage {
    @FindBy(xpath = "//header[contains(text(),'Driver Information')]")
    public static WebElement driverInformationText;
    @FindBy(id = "leadFirstName")
    public WebElement firstNameInputField;

    @FindBy(id = "leadLastName")
    public WebElement lastNameInputField;

    @FindBy(id = "leadEmail")
    public WebElement emailInputField;

    @FindBy(id = "leadPhone")
    public WebElement phoneInputField;

//    @FindBy(id = "leadFirstName")
//    public WebElement emailInputField;


    @FindBy(id = "leadDisclaimer")
    public WebElement termCheckBox1;

    @FindBy(id = "leadDisclaimerTCPA")
    public WebElement termCheckBox2;

    @FindBy(id = "leadDisclaimerBevOptin")
    public WebElement termCheckBox3;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement submitButton;


    public GetYourQuotePage() {
        PageFactory.initElements(driver, this);
    }

    public void fillOutTheForm() throws SQLException {
        String qury="SELECT phoneNumber FROM locations.phonenumber where id =1;";
        clearSendKeysToElement(firstNameInputField, GenerateData.firstName());
        clearSendKeysToElement(lastNameInputField, GenerateData.lastName());
        clearSendKeysToElement(emailInputField, GenerateData.email());
        clearSendKeysToElement(phoneInputField, db.executeQueryReadOne(qury).toString());
        clickOnElement(termCheckBox1);
        clickOnElement(termCheckBox2);
//        clickOnElement(termCheckBox3);
        waitForVisibilityOfElement(submitButton);
        clickOnElement(submitButton);

    }
}
