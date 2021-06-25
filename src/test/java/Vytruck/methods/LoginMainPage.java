package Vytruck.methods;

import Vytruck.Utilities.ConfigurationReader;
import Vytruck.Utilities.Driver;
import Vytruck.library.LibraryMainPage;

public class LoginMainPage {

    public static void loginMainPage(){
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        LibraryMainPage mainPage = new LibraryMainPage();
        mainPage.username.sendKeys(ConfigurationReader.getProperties("username"));
        mainPage.password.sendKeys(ConfigurationReader.getProperties("password"));
        mainPage.loginButton.click();

    }
}
