package Vytruck.sprint2;

import Vytruck.methods.VehicleFleetPage;
import org.testng.annotations.Test;

public class B204_304 {

    @Test
    public void gridSetting_rightTo_ResetButton(){
        VehicleFleetPage.vehicleFleetPage();
        VehicleFleetPage.gridSetting_rightTo_ResetButton();
    }
}
