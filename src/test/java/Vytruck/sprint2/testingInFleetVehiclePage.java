package Vytruck.sprint2;

import Vytruck.methods.LoginMainPage;
import Vytruck.methods.VehicleFleetPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testingInFleetVehiclePage {

    @BeforeClass
    public void setUp(){
        VehicleFleetPage.vehicleFleetPage();
    }

    @Test
    public void test1(){
        VehicleFleetPage.refresh_leftTo_Reset();
    }

    @Test void test2(){
        VehicleFleetPage.gridSetting_rightTo_ResetButton();
    }
}
