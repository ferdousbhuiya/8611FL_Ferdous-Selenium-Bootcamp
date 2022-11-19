package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class AccountCreationPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Create an account']")
    private WebElement formTitle;

    @FindBy(id = "uniform-id_gender1")
    private WebElement mr;

    @FindBy(id = "id_gender2")
    private WebElement mrs;

    @FindBy(name = "customer_firstname")
    private WebElement firstName;

    @FindBy(name = "customer_lastname")
    private WebElement lastName;

    @FindBy(name = "passwd")
    private WebElement passWord;

    @FindBy(name = "days")
    private WebElement days;

    @FindBy(name = "months")
    private WebElement months;

    @FindBy(name = "years")
    private WebElement years;

    @FindBy(name = "firstname")
    private WebElement customerNirstName;

    @FindBy(name = "lastname")
    private WebElement customerLastName;

    @FindBy(name = "company")
    private WebElement companyName;

    @FindBy(name = "address1")
    private WebElement address;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "id_state")
    private WebElement state;

    @FindBy(name = "postcode")
    private WebElement postCode;

    @FindBy(name = "id_country")
    private WebElement country;

    @FindBy(name = "phone")
    private WebElement phone;

    @FindBy(name = "phone_mobile")
    private WebElement mobile;

    @FindBy(name = "alias")
    private WebElement ref;

    @FindBy(name = "submitAccount")
    private WebElement registerBtn;

    public AccountCreationPage() {
        PageFactory.initElements(driver, this);
    }

    public void createAccount(String gender,String fName,
                              String lName,
                              String pswd,
                              String day,
                              String month,
                              String year,
                              String comPany,
                              String addr,
                              String cityString,
                              String stateName,
                              String zip,
                              String countryName,
                              String mobilePhone) throws Throwable {

        if(gender.equalsIgnoreCase("Mr")) {
            mr.click();
            // action.click(getDriver(), mr);
        } else {
            mrs.click();
            // action.click(getDriver(), mrs);
        }
        sendKeysToElement(firstName, GenerateData.firstName());
        sendKeysToElement(lastName, GenerateData.lastName());
        sendKeysToElement(passWord, GenerateData.password());
        selectFromDropdownByVisibleText(days,day);
        selectFromDropdownByVisibleText(months,month);
        selectFromDropdownByVisibleText(years,year);
        sendKeysToElement(companyName, comPany);
        sendKeysToElement(address, addr);
        sendKeysToElement(city, cityString);
        selectFromDropdownByVisibleText(state, stateName);
        sendKeysToElement(postCode, zip);
        selectFromDropdownByVisibleText(country,countryName);
        sendKeysToElement(mobile,mobilePhone);

    }

    public HomePage validateRegistration() throws Throwable {
        registerBtn.click();
        return new HomePage();
    }

    public boolean validateAcountCreatePage() throws Throwable {
        return formTitle.isDisplayed();
        // return action.isDisplayed(getDriver(), formTitle);
    }
}
