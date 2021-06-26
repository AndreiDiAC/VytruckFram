package Vytruck.library;


import Vytruck.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryFleetVehiclePage {

    public LibraryFleetVehiclePage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy( css = "[type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetFunctionality;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicleFleetDropdown;

    @FindBy(xpath = "//div[@class='actions-panel pull-right form-horizontal']//a[@title='Grid Settings']")
    public WebElement gridSettings;

    @FindBy(xpath = "//div[@class='actions-panel pull-right form-horizontal']//div[@class='column-manager dropdown']/preceding-sibling::a[1]")
    public WebElement GridRightToReset;

    @FindBy(xpath = "//div[@class='actions-panel pull-right form-horizontal']//a[@title='Refresh']/following-sibling::a[1]")
    public WebElement RefreshLeftToReset;
}
