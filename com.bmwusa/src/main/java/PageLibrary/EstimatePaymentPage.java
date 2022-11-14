package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class EstimatePaymentPage extends BasePage {

    @FindBy(xpath = "//select[@id='series']")
    public WebElement selectSeries;

    @FindBy(xpath = "//select[@name='model']")
    public WebElement selectModel;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//div[@class='payment-estimator__adjustments']/div[2]/button")
    public WebElement estimatePaymentButton;

    @FindBy(xpath = "//div[@class='payment-estimator__vehicle-display active']")
    public static WebElement vehicleDisplay;


    public EstimatePaymentPage() {
        PageFactory.initElements(driver, this);
    }

    public void paymentEstimationForm() {
        clickOnElement(selectSeries);
        selectFromDropdownByIndex(selectSeries, 2);
        selectFromDropdownByIndex(selectModel, 1);
        clearSendKeysToElement(zipCode, GenerateData.zipCode());
        clickOnElement(estimatePaymentButton);
    }
}
