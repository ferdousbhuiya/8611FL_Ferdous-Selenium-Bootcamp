package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyGaragePage extends BasePage {
    @FindBy(xpath = "//button[contains(text(),'Car and truck')]")
    public WebElement carAndTruckButton;

    @FindBy(xpath = "//button[contains(text(),'Motorcycle')]")
    public WebElement motorcycleButton;

    @FindBy(xpath = "//div[@class='x-my-vehicle-action-bar']/button[3]")
    public WebElement addNewVehicleButton;

    @FindBy(xpath = "//div[@class='x-my-vehicle grid']//img")
    public static WebElement vehicleImage;

    @FindBy(xpath = "//h2[contains(text(),'What do you drive?')]")
    public static WebElement whatDoYouDriveText;

    @FindBy(xpath = "//div[@class='vert-combobox  ']/ul/li")
    public List<WebElement> listOfYearsMake;
    @FindBy(xpath = "//div[@class='vert-combobox  ']")
    public WebElement lists;

    @FindBy(xpath = "//div[@id='mainContent']//div[@role='document']/div[2]/div/div[3]//button")
    public WebElement goButton;

    @FindBy(xpath = "//h3[contains(text(),'Your vehicle info:')]")
    public WebElement vehicleInfo;
    @FindBy(xpath = "//div[@class='x-my-vehicle-action-bar']/button[1]")
    public WebElement changeVehicleButton;

    @FindBy(xpath = "//div[@class='x-my-vehicle-action-bar']/button[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='footer']/button[2]")
    public WebElement confirmDeletionButton;

    @FindBy(xpath = "//div[@class='x-motors-dialog__body']/div/div[1]//a")
    public WebElement selectAnotherCar;

    public MyGaragePage(){
        PageFactory.initElements(driver,this);
    }
    public MyGaragePage addNewVehicle(){
        waitForVisibilityOfElement(addNewVehicleButton);
        jsClickOnElement(addNewVehicleButton);
        moveToElementAndClick(carAndTruckButton);
        waitForVisibilityOfElement(lists);
        moveToElementAndClick(listOfYearsMake.get(1));
        waitForVisibilityOfElement(lists);
        moveToElementAndClick(listOfYearsMake.get(0));
        waitForVisibilityOfElement(lists);
        moveToElementAndClick(listOfYearsMake.get(1));
        waitForVisibilityOfElement(lists);
        moveToElementAndClick(listOfYearsMake.get(1));
        waitForVisibilityOfElement(goButton);
        moveToElementAndClick(goButton);
        return  new MyGaragePage();
    }

    public void changeVehicle(){
        waitForVisibilityOfElement(changeVehicleButton);
        clickOnElement(changeVehicleButton);
        waitForVisibilityOfElement(selectAnotherCar);
        clickOnElement(selectAnotherCar);
    }
    public void deleteVehicle(){
        waitForVisibilityOfElement(deleteButton);
        clickOnElement(deleteButton);
        waitForVisibilityOfElement(confirmDeletionButton);
        clickOnElement(confirmDeletionButton);
    }
}
