package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.util.List;

public class IndexPage extends BasePage {


    @FindBy(xpath = "//div[@id='main-nav']/div")
    public static List<WebElement> NavigationBar;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement EventTitle;

    @FindBy(xpath = "//input[contains(@name,'amount')]")
    public WebElement AmountOfDeal;


    @FindBy(xpath = "//div[contains(@name,'type')]")
    public List<WebElement> TypeList;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    public WebElement saveButton;

    public IndexPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void AddingDealsToCalendar()
    {
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div"));
        hoverOverElement(NavigationBar.get(4));
        moveToElementAndClick(NavigationBar.get(4).findElement(By.tagName("button")));
        sendKeysToElement(EventTitle, GenerateData.lastName());
        sendKeysToElement(AmountOfDeal, "100000");
        clickOnElement(saveButton);

    }

    public void AddingNewTasks()
    {
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div"));
        hoverOverElement(NavigationBar.get(5));
        moveToElementAndClick(NavigationBar.get(5).findElement(By.tagName("button")));
        sendKeysToElement(EventTitle, GenerateData.lastName());
        clickOnElement(TypeList.get(0));
        clickOnElement(saveButton);

    }




}
