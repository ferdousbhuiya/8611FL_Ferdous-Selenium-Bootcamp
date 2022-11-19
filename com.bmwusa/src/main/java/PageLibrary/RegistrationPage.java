package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.sql.SQLException;
import java.util.List;

public class RegistrationPage extends BasePage {
    @FindBy(id = "custom-select-plus-salutation")
    public WebElement salutation;

    @FindBy(xpath= "//div[@id='dropdown-container']/div")
    public List<WebElement> salutationDropDown;

    @FindBy(xpath = "//div[@id='challengeContainer']/iframe")
    public static WebElement iframe;

    @FindBy(xpath = "//div[@class='challenge-container']")
    public static WebElement challengeImages;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "definition-usage-0-combined-checkbox-660")
    public WebElement checkBox;

    @FindBy(xpath = "//button[contains(text(),'Register now')]")
    public WebElement registerNowButton;

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }
    public void fillOutRegistrationForm()  {

        clickOnElement(salutation);
        clickOnElement(salutationDropDown.get(2));
        clearSendKeysToElement(firstName, GenerateData.firstName());
        clearSendKeysToElement(lastName,GenerateData.lastName());
        clearSendKeysToElement(email,GenerateData.email());
        clearSendKeysToElement(password, " Abce34567#");

        jsClickOnElement(checkBox);
        clickOnElement(registerNowButton);
    }

}
