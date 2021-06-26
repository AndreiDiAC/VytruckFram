package Vytruck.library;

import Vytruck.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryMainPage {

    public LibraryMainPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy( css = "[type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "href=\"/account\"")
    public WebElement something;
}
