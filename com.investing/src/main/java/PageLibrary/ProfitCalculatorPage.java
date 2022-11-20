package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfitCalculatorPage extends BasePage {

    @FindBy(xpath = "//a[normalize-space()='Tools']")
    public WebElement ToolsButton;


    @FindBy(xpath = "//a[@href='/tools/profit-calculator']")
    public WebElement ProfitCalculatorLink;

  @FindBy(xpath = "(//input[@id='forexSearchText'])[1]")
    public WebElement forexSearchinputBox;

  @FindBy(xpath = "//label[@for='forexSearchText']")
  public WebElement searchForexCurrencyButton;

  @FindBy(xpath = "//body[1]/div[5]/section[1]/div[5]/form[1]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]")
  public WebElement selectrow;


   @FindBy(xpath = "//input[@id='forex_trade_size']")
  public WebElement ForexTradeSize;


   @FindBy(xpath = "//input[@name='OTP']")
   public WebElement OpenTradePrice;

   @FindBy(xpath = "//input[@name='CTP']")
   public WebElement ClosingTradePrice;
   @FindBy(xpath = "//a[@id='forexCalculateButton']")
   public WebElement ProfitCalculatorBtton;

@FindBy(xpath = "//i[@id='msgboxtotal']")
public WebElement LossOrProfitValue;


    public ProfitCalculatorPage()
    {
        PageFactory.initElements(driver, this);
    }


    public void calculateProfit()
    {
       jsClickOnElement(ProfitCalculatorLink);
        hoverOverElement(forexSearchinputBox);
        clearSendKeysToElement(forexSearchinputBox, excel.readStringArrays("Sheet1")[1][2]);
        clickOnElement(selectrow);
        sendKeysToElement(OpenTradePrice, excel.readStringArrays("Sheet1")[2][3]);
        sendKeysToElement(ClosingTradePrice, excel.readStringArrays("Sheet1")[3][3]);
        safeClickOnElement(ProfitCalculatorBtton);

    }



}
