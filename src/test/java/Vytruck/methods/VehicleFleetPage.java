package Vytruck.methods;

import Vytruck.Utilities.BrowserUtil;
import Vytruck.Utilities.ConfigurationReader;
import Vytruck.Utilities.Driver;
import Vytruck.library.LibraryFleetVehiclePage;
import org.testng.Assert;

public class VehicleFleetPage {

    public static void vehicleFleetPage(){
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        LibraryFleetVehiclePage vehiclePage = new LibraryFleetVehiclePage();
        vehiclePage.username.sendKeys(ConfigurationReader.getProperties("username"));
        vehiclePage.password.sendKeys(ConfigurationReader.getProperties("password"));
        vehiclePage.loginButton.click();
        vehiclePage.fleetFunctionality.click();
        BrowserUtil.sleep(1);
        vehiclePage.vehicleFleetDropdown.click();

    }

    public static void gridSetting_rightTo_ResetButton(){
        LibraryFleetVehiclePage vehiclePage = new LibraryFleetVehiclePage();
        Assert.assertTrue(vehiclePage.GridRightToReset.isDisplayed());
    }

    public static void refresh_leftTo_Reset(){
        LibraryFleetVehiclePage vehiclePage = new LibraryFleetVehiclePage();
        Assert.assertTrue(vehiclePage.RefreshLeftToReset.isDisplayed());
    }
}
