package TestFiles;

import PageLibrary.HomePage;
import PageLibrary.MotorsPage;
import PageLibrary.MyGaragePage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class AddVehicleTest extends BasePage {

    @Test
    public void testAddVehicle(){
        HomePage homePage = new HomePage();
        MotorsPage motorsPage = new MotorsPage();
        MyGaragePage myGaragePage = new MyGaragePage();
        homePage.addVehicle();
        motorsPage.addingVehicle();
        waitForVisibilityOfElement(myGaragePage.vehicleImage);
        assertTrue(myGaragePage.vehicleImage.isDisplayed());
    }
    @Test
    public void testDelete(){
        HomePage homePage = new HomePage();
        MyGaragePage myGaragePage = new MyGaragePage();
        MotorsPage motorsPage = new MotorsPage();
        homePage.addVehicle();
        motorsPage.addingVehicle();
        myGaragePage.deleteVehicle();
        waitForVisibilityOfElement(myGaragePage.whatDoYouDriveText);
        assertFalse(isElementVisible(myGaragePage.vehicleImage));
    }

    @Test
    public void addNewVehicle(){
        HomePage homePage = new HomePage();
        MyGaragePage myGaragePage = new MyGaragePage();
        MotorsPage motorsPage = new MotorsPage();
        homePage.addVehicle();
        motorsPage.addingVehicle();
        myGaragePage.addNewVehicle();
        waitForVisibilityOfElement(myGaragePage.vehicleImage);
        assertTrue(myGaragePage.vehicleImage.isDisplayed());

    }

    @Test
    public void testChangeVehicle(){
        HomePage homePage = new HomePage();
        MyGaragePage myGaragePage = new MyGaragePage();
        MotorsPage motorsPage = new MotorsPage();
        homePage.addVehicle();
        motorsPage.addingVehicle();
        myGaragePage.addNewVehicle();
        myGaragePage.changeVehicle();
        waitForVisibilityOfElement(myGaragePage.vehicleImage);
        assertTrue(myGaragePage.vehicleImage.isDisplayed());
    }
}
