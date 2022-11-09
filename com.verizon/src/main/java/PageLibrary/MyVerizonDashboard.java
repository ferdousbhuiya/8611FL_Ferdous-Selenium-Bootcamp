package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyVerizonDashboard extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Sign out')]")
    public static WebElement signOutButton;


    public MyVerizonDashboard(){
        PageFactory.initElements(driver,this);
    }


    public void signOut(){
        clickOnElement(signOutButton);
    }
}


