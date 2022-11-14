package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class AutoLoanCalculator extends BasePage {

    @FindBy(id = "totalLoanAmountField")
    public WebElement loanAmountField;

    @FindBy(id = "term")
    public WebElement termField;

    @FindBy(id = "interestRateField")
    public WebElement interestRateField;

    @FindBy(id = "calculateButton")
    public WebElement calculateButton;

    @FindBy(xpath = "//div[@class='results']")
    public static WebElement result;

    @FindBy(id = "stateSelectModal")
    public WebElement selectState;

    @FindBy(id = "stateSelectorSubmit")
    public WebElement goButton;


    public AutoLoanCalculator() {
        PageFactory.initElements(driver, this);
    }

    public void calculatePayment()  {
        selectFromDropdownByIndex(selectState,5);
        clickOnElement(goButton);
        clearSendKeysToElement(loanAmountField, excel.readStringArrays("Sheet2")[0][0]);
        clearSendKeysToElement(termField, excel.readStringArrays("Sheet2")[0][1]);
        clearSendKeysToElement(interestRateField, excel.readStringArrays("Sheet2")[0][2]);
        clickOnElement(calculateButton);
    }
}
