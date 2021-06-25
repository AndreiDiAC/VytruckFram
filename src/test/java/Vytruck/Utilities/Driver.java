package Vytruck.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){};

    static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            String browserUsed = ConfigurationReader.getProperties("browser");
            switch (browserUsed){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
                    break;
            }
        }
        return driver;
    }

    public static void close(){
        if(driver!=null){
            driver.quit();
            driver = null;
        }
    }


}
