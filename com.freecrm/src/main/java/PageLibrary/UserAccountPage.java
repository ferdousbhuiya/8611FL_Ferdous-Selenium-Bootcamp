package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

import java.util.List;

public class UserAccountPage extends BasePage {



    @FindBy(xpath = "//div[@id='main-nav']/div")
    public static List<WebElement> mainNavBar;

    @FindBy(xpath = "//span[@class='user-display']")
    public static WebElement DisplayedUserName;


    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//div[@name='company']/input[@class='search']")
    public WebElement companyInput;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    public WebElement saveButton;


    @FindBy(xpath = "//table[@class='ui celled sortable striped table custom-grid']//td[@class='right aligned collapsing options-buttons-container'][1]/a[2]/button")
    public WebElement editButton;
    @FindBy(xpath = "//table[@class='ui celled sortable striped table custom-grid']//td[@class='right aligned collapsing options-buttons-container'][1]/div/button")
    public WebElement deleteContact;
    @FindBy(xpath = "//button[@class='ui button']")
    public WebElement confirmDelete;

    @FindBy(xpath = "//div[@id='ui']")
    public static WebElement displayedContactName;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement calendarTitle;
    @FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[2]/div[1]//input")
    public WebElement startCalendarDate;

    @FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[2]/div[1]//input")
    public WebElement endCalendarDate;

    @FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[3]//div[@class='ui selection dropdown']")
    public WebElement category;
    @FindBy(xpath = "//div[@class='rbc-calendar']/div[1]/span[3]/button[4]")
    public static WebElement agendaButton;

    @FindBy(xpath = "//div[@class='rbc-agenda-content']//tbody/tr[1]/td[3]")
    public static WebElement eventToEdit;

    @FindBy(xpath = "//div[@class='item view-page-toolbar']//a/button")
    public WebElement editCalendarButton;

    @FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
    public static WebElement eventNameDisplayed;

    @FindBy(xpath = "//div[@class='item view-page-toolbar']/button[3]")
    public WebElement deleteCalendarButton;

    @FindBy(xpath = "//div[@class='actions']/button[2]")
    public WebElement deleteConfirmationButton;

    @FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[3]//div[@class='visible menu transition']/div")
    public List<WebElement> visibleMenu;

    @FindBy(xpath = "//div[@class='react-datepicker__month-container']/div[2]/div[4]/div[5]")
    public WebElement days;

    @FindBy(xpath = "//div[@class='react-datepicker__time']//ul/li")
    public List<WebElement> timePicker;

    @FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[3]/div[2]//div[@class='ui left labeled input']/input")
    public WebElement addFileInput;

    @FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[1]/div[2]//input")
    public WebElement documentTitle;

    @FindBy(xpath = "//div[@class='files-wrapper']")
    public static WebElement fileWrapper;

    @FindBy(xpath = "//div[@class='ui cards']/div[1]/div[2]/div/a[2]")
    public static WebElement deleteIcon;

    @FindBy(xpath = "//div[@class='actions']/button[2]")
    public static WebElement confirmDeletion;

    @FindBy(xpath = "//div[@id='main-content']/div/div/div[1]")
    public  WebElement from;

    @FindBy(xpath = "//span[contains(text(),'Call Queue Empty')]")
    public static WebElement callQueEmpty;

    @FindBy(xpath = "//div[@id='main-content']/div/div/div[2]")
    public WebElement to;
    @FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
    public static WebElement eventName;
    @FindBy(xpath = "//div[@class='ui buttons']/div")
    public static WebElement leftMenuDropDown;
    @FindBy(xpath = "//div[@class='menu transition visible']/a[5]")
    public static WebElement logOutButton;

    public UserAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public UserAccountPage addContact()  {
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div[2]"));
        hoverOverElement(mainNavBar.get(2));
        waitForVisibilityOfElement(mainNavBar.get(2));
        clickOnElement(mainNavBar.get(2).findElement(By.tagName("button")));
        return new UserAccountPage();
    }

    public void editContact() {
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div[2]"));
        hoverOverElement(mainNavBar.get(2));
        waitForVisibilityOfElement(mainNavBar.get(2));
        clickOnElement(mainNavBar.get(2).findElement(By.tagName("a")));
        clickOnElement(editButton);
        clearSendKeysToElement(firstName, GenerateData.firstName());
        clearSendKeysToElement(lastName, GenerateData.lastName());
        clearSendKeysToElement(companyInput, GenerateData.Company());
        clickOnElement(saveButton);
    }

    public void deleteContact() {
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div[2]"));
        hoverOverElement(mainNavBar.get(2));
        waitForVisibilityOfElement(mainNavBar.get(2));
        clickOnElement(mainNavBar.get(2).findElement(By.tagName("a")));
        clickOnElement(deleteContact);
        clickOnElement(confirmDelete);
    }

    public void editEventCalendar() {
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div[2]"));
        hoverOverElement(mainNavBar.get(1));
        clickOnElement(mainNavBar.get(1).findElement(By.tagName("a")));
        clickOnElement(agendaButton);
        clickOnElement(eventToEdit);
        clickOnElement(editCalendarButton);
        sendKeysToElement(calendarTitle, GenerateData.lastName());
        //pick start date
        jsClickOnElement(startCalendarDate);
        jsClickOnElement(days);
        jsClickOnElement(timePicker.get(2));
        //pick end date
        jsClickOnElement(endCalendarDate);
        jsClickOnElement(days);
        jsClickOnElement(timePicker.get(7));
        //select category
        jsClickOnElement(category);
        jsClickOnElement(visibleMenu.get(2));
        clickOnElement(saveButton);
    }

    public void deleteCalendarEvent() {
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div[2]"));
        hoverOverElement(mainNavBar.get(1));
        clickOnElement(mainNavBar.get(1).findElement(By.tagName("a")));
        clickOnElement(agendaButton);
        clickOnElement(eventToEdit);
        clickOnElement(deleteCalendarButton);
        waitForVisibilityOfElement(deleteConfirmationButton);
        clickOnElement(deleteConfirmationButton);
    }

    public void addDocument() {
        String filePath = "/Users/ferdous/Desktop/Most-Exhaustive-XPath-Locators-Cheat-Sheet.pdf";
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div[9]"));
        hoverOverElement(mainNavBar.get(8));
        clickOnElement(mainNavBar.get(8).findElement(By.tagName("button")));
        sendKeysToElement(addFileInput, filePath);
        sendKeysToElement(documentTitle, GenerateData.Company());
        clickOnElement(saveButton);
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div[9]"));
        hoverOverElement(mainNavBar.get(8));
        clickOnElement(mainNavBar.get(8).findElement(By.tagName("a")));
    }

    public void deleteDocument() {
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div[9]"));
        hoverOverElement(mainNavBar.get(8));
        clickOnElement(mainNavBar.get(8).findElement(By.tagName("a")));
        clickOnElement(deleteIcon);
        clickOnElement(confirmDeletion);
    }
    public void dragAndDropElement(){
        waitForThePresenceOfTheElement(By.xpath("//div[@id='main-nav']/div[1]"));
        hoverOverElement(mainNavBar.get(0));
        clickOnElement(mainNavBar.get(0).findElement(By.tagName("a")));
        dragAndDrop(from,to);
    }
    public void logOut(){
        waitForVisibilityOfElement(leftMenuDropDown);
        jsClickOnElement(leftMenuDropDown);
        clickOnElement(logOutButton);


    }

}
