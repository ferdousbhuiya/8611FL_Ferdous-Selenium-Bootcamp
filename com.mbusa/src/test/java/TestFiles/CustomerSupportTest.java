package TestFiles;

import PageLibrary.ContactusPage;
import PageLibrary.CustomerSupportPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerSupportTest extends BasePage {

    @Test
    public void contactWithDealerTest()
    {
        CustomerSupportPage customerSupportPage = new CustomerSupportPage();
        ContactusPage contactusPage = new ContactusPage();
        contactusPage.NavigateToCustomerSupport();
        Assert.assertEquals(customerSupportPage.CustomerSupportHeading.getText(), "Customer Support");
    }
}
