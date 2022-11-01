package PageLibrary;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage extends BasePage {
public BasePage basePage;
   public ContactsPage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[contains(text(),'Contacts')]")
    WebElement contactsLabel;

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='surname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@name='client_lookup']")
    WebElement company;

    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/input[2]")
    WebElement saveBtn;


    @FindBy(name = "mainpanel")
    WebElement frameName;

    public boolean verifyContactsLabel(){
        return contactsLabel.isDisplayed();
    }


    public void selectContactsByName(String name){
        driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
                + "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
    }


    public void createNewContact(String title, String ftName, String ltName, String comp){
        Select select = new Select(driver.findElement(By.xpath("//select[@name='title']")));
        select.selectByVisibleText(title);

        firstName.sendKeys(ftName);
        lastName.sendKeys(ltName);
        company.sendKeys(comp);
        saveBtn.click();

    }

    public void switchToFrame()
    {
        basePage.switchToFrameByElement(frameName);
    }


}
