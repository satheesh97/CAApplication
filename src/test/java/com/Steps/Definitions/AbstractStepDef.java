package com.Steps.Definitions;

import Managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import DataProvider.DriverType;
import DataProvider.EnvironmentType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;
@Log4j
public class AbstractStepDef {
    protected static WebDriver  webDriver;
    private static DriverType driverType;
    private static EnvironmentType environmentType;
//private static final org.apache.log4j.Logger log= Logger.getLogger(AbstractStepDef.class);
    public AbstractStepDef() {
        driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
        environmentType = FileReaderManager.getInstance().getConfigFileReader().getEnvironment();
    }

    long time = FileReaderManager.getInstance().getConfigFileReader().getTime();
    protected WebDriver getDrivr(){
        if(webDriver ==null) {
            switch (driverType) {
                case CHROME:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    // chromeOptions.addArguments("--headless", "--window-size=1644,868");
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
        }

            webDriver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
            webDriver.manage().timeouts().setScriptTimeout(time, TimeUnit.MINUTES);
            webDriver.manage().timeouts().pageLoadTimeout(time, TimeUnit.MINUTES);

        return webDriver;
    }


}
