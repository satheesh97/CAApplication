package Managers;

import DataProvider.DriverType;
import DataProvider.EnvironmentType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AllDriverManager {

    private  WebDriver webDriver;

    private static DriverType driverType;
    private static EnvironmentType environmentType;

    long time = FileReaderManager.getInstance().getConfigFileReader().getTime();
    public AllDriverManager() {
        driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
        environmentType = FileReaderManager.getInstance().getConfigFileReader().getEnvironment();
    }

    public WebDriver createLocalDriver(){
        switch (driverType){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
               //chromeOptions.addArguments("--headless", "--window-size=1644,868");
                webDriver = new ChromeDriver(chromeOptions);
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless");
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                webDriver = new EdgeDriver();
                break;
            case SAFARI:
                webDriver = new SafariDriver();
                break;
        }


        webDriver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
        webDriver.manage().timeouts().setScriptTimeout(time, TimeUnit.MINUTES);
        webDriver.manage().timeouts().pageLoadTimeout(time,TimeUnit.MINUTES);

        return webDriver;
    }

    public  void waittill(){


    }
    private WebDriver createDriver() {
        switch (environmentType) {
            case LOCAL:
                webDriver = createLocalDriver();
                break;
            case Test:
                webDriver = createLocalDriver();
                break;
            case Dev:
                webDriver = createLocalDriver();
                break;
            case PROD:
                webDriver = createLocalDriver();
                break;
        }
        return webDriver;
    }

    public WebDriver getDriver() {
        if (webDriver == null) webDriver = createDriver();
        return webDriver;
    }


    public void closeDriver() {

        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
        //webDriver.close();
      //  webDriver.quit();
    }
}


