package TestFiles;

import PageLibrary.ContactsPage;
import PageLibrary.HomePage;
import PageLibrary.LoginPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class ContactsPageTest extends BasePage {
    LoginPage loginPage;
    HomePage homePage;

    ContactsPage contactsPage= new ContactsPage();
    ExcelData excelData;
    String sheetName = "contacts";


    public ContactsPageTest(){
        super();

    }

    @Test(priority=1)
    public void verifyContactsPageLabel(){
        Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is missing on the page");
    }

    @Test(priority=2)
    public void selectSingleContactsTest(){
        contactsPage.selectContactsByName("Tanjina Akter");
    }

    @Test(priority=3)
    public void selectMultipleContactsTest(){
        contactsPage.selectContactsByName("Tanjina Akter");
        contactsPage.selectContactsByName("Haider Ali");

    }

    @DataProvider
    public Object[][] getCRMTestData(){
        new ExcelData("TestData/FreeCrmTestData.xlsx");
        Object data[][] = excelData.readStringArrays(sheetName);
        return data;
    }


    @Test(priority=4, dataProvider="getCRMTestData")
    public void validateCreateNewContact(String title, String firstName, String lastName, String company){
        homePage.clickOnNewContactLink();
        contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
        contactsPage.createNewContact(title, firstName, lastName, company);

    }




}
