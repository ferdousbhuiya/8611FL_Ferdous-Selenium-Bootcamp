
package PageLibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShippingPage extends BasePage {
	
	//Action action= new Action();
	
	@FindBy(id="cgv")
	private WebElement terms;
	
	@FindBy(xpath="//button/span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedToCheckOutBtn;
	
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkTheTerms() throws Throwable {
		terms.click();
		//action.click(driver, terms);
	}
	
	public PaymentPage clickOnProceedToCheckOut() throws Throwable {

		proceedToCheckOutBtn.click();
		//action.click(driver, proceedToCheckOutBtn);
		return new PaymentPage();
	}

}
