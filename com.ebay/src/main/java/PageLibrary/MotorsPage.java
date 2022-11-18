package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MotorsPage extends BasePage {

    @FindBy(id = "s0-28_1-9-0-1[0]-0-0[1]-9[0]")
    public WebElement addVehicleButton;

    @FindBy(xpath = "//button[contains(text(),'Car and truck')]")
    public WebElement carAndTruckButton;

    @FindBy(xpath = "//button[contains(text(),'Motorcycle')]")
    public WebElement motorcycleButton;

    @FindBy(xpath = "//div[@class='vert-combobox  ']/ul/li")
    public List<WebElement> listOfYearsMake;
    @FindBy(xpath = "//div[@class='vert-combobox  ']")
    public WebElement lists;

    @FindBy(xpath = "//div[@id='mainContent']//div[@role='document']/div[2]/div/div[3]//button")
    public WebElement goButton;






    public MotorsPage() {
        PageFactory.initElements(driver, this);
    }

    public MyGaragePage addingVehicle() {
        waitForVisibilityOfElement(addVehicleButton);
        jsClickOnElement(addVehicleButton);
        moveToElementAndClick(carAndTruckButton);
        waitForVisibilityOfElement(lists);
        moveToElementAndClick(listOfYearsMake.get(3));
        waitForVisibilityOfElement(lists);
        moveToElementAndClick(listOfYearsMake.get(0));
        waitForVisibilityOfElement(lists);
        moveToElementAndClick(listOfYearsMake.get(0));
        waitForVisibilityOfElement(lists);
        moveToElementAndClick(listOfYearsMake.get(0));
        waitForVisibilityOfElement(goButton);
        moveToElementAndClick(goButton);
        return new MyGaragePage();
    }

}
