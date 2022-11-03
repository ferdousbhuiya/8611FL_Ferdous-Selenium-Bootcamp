package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;


public class LoginPage extends BasePage {
	BasePage basePage = new BasePage();
	//Action action= new Action();
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="passwd")
	private WebElement password;

	@FindBy(id="SubmitLogin")
	private WebElement signInBtn;
	
	@FindBy(name="email_create")
	private WebElement emailForNewAccount;
	
	@FindBy(name="SubmitCreate")
	private WebElement createNewAccountBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname, String pswd,HomePage homePage) throws Throwable {

		basePage.sendKeysToElement(userName, uname);
		basePage.sendKeysToElement(password, pswd);
		basePage.jsClickOnElement(signInBtn);
		homePage = new HomePage();
		return homePage;

		/*action.scrollByVisibilityOfElement(driver, userName);
		action.type(userName, uname);
		action.type(password, pswd);
		action.JSClick(driver, signInBtn);
		Thread.sleep(2000);
		homePage=new HomePage();
		return homePage;*/


	}
	
	public AddressPage login(String uname, String pswd,AddressPage addressPage) throws Throwable {
		basePage.sendKeysToElement(userName, uname);
		basePage.sendKeysToElement(password, pswd);
		basePage.jsClickOnElement(signInBtn);
		addressPage = new AddressPage();
		return addressPage;


		/*action.scrollByVisibilityOfElement(driver, userName);
		action.type(userName, uname);
		action.type(password, pswd);
		action.click(driver, signInBtn);
		Thread.sleep(2000);
		addressPage=new AddressPage();
		return addressPage;*/
	}
	
	public AccountCreationPage createNewAccount() throws Throwable {

		sendKeysToElement(emailForNewAccount, GenerateData.email());
		createNewAccountBtn.click();

		//action.type(emailForNewAccount, newEmail);
		//action.click(driver, createNewAccountBtn);
		return new AccountCreationPage();
	}
	
}






