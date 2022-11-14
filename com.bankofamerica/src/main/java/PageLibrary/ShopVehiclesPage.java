package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class ShopVehiclesPage extends BasePage {
    @FindBy(id = "zipCodeField")
    public WebElement zipCodeInputField;
    @FindBy(id = "dtShopforCar")
    public WebElement shopForYourCarButton;
    @FindBy(id = "shopNowButton")
    public static WebElement shopNowButton;
    @FindBy(id = "stateSelectModal")
    public WebElement selectState;
    @FindBy(id = "stateSelectorSubmit")
    public WebElement goButton;

    public ShopVehiclesPage() {
        PageFactory.initElements(driver, this);
    }

    public CarShoppingPage shopForCar() {
        selectFromDropdownByIndex(selectState, 1);
        clickOnElement(goButton);
        sendKeysToElement(zipCodeInputField, GenerateData.zipCode());
        clickOnElement(shopForYourCarButton);
        clickOnElement(shopNowButton);
        return new CarShoppingPage();

    }

}
