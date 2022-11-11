package TestFiles;

import PageLibrary.AddedNewCarPage;
import PageLibrary.InventoryPage;
import base.BasePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class InventoryTest extends BasePage {

    @Test
    public void inventorycheckingTest()
    {
        InventoryPage inventoryPage = new InventoryPage();
        AddedNewCarPage addedNewCarPage = new AddedNewCarPage();
        inventoryPage.InventoryCheckToChooseACar();
        boolean flag = isElementVisible(addedNewCarPage.ThanksForNewCustomerText);
        assertTrue(flag);
    }
}
