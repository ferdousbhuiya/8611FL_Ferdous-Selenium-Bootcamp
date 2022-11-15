package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.util.List;

public class EventAddingToCalendarPage extends BasePage {


    @FindBy(xpath = "//div[@id='main-nav']/div")
    public static List<WebElement> NavigationBar;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement EventTitle;

    @FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[2]/div[1]//input")
    public WebElement StartCalendarDate;

    @FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[2]/div[1]//input")
    public WebElement EndCalendarDate;

    @FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[3]//div[@class='ui selection dropdown']")
    public WebElement category;

    @FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[3]//div[@class='visible menu transition']/div")
    public List<WebElement> visibleMenu;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    public WebElement saveButton;

    public EventAddingToCalendarPage()

    {
        PageFactory.initElements(driver, this);
    }


    public void AddingEventToCalendar()
    {
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div"));
        hoverOverElement(NavigationBar.get(1));
        moveToElementAndClick(NavigationBar.get(1).findElement(By.tagName("button")));
        sendKeysToElement(EventTitle, GenerateData.lastName());
        clearSendKeysToElement(StartCalendarDate, excel.readStringArrays("Sheet1")[1][0]);
        clearSendKeysToElement(EndCalendarDate,excel.readStringArrays("Sheet1")[1][1]);
        jsClickOnElement(category);
        jsClickOnElement(visibleMenu.get(2));
        clickOnElement(saveButton);

    }
}
