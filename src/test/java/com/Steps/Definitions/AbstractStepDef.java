package com.Steps.Definitions;

import Managers.FileReaderManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import DataProvider.DriverType;
import DataProvider.EnvironmentType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class AbstractStepDef {
    protected static WebDriver  webDriver;

    public static Logger log = LogManager.getLogger();

    private static DriverType driverType;
    private static EnvironmentType environmentType;

public void demon(){
    WebDriver webDriver1 = new ChromeDriver();
}
    public AbstractStepDef() {
        driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
        environmentType = FileReaderManager.getInstance().getConfigFileReader().getEnvironment();
    }

    @BeforeClass
            public static void loadLog4j(){
        String log4jpath = System.getProperty("user.dir")+"\\log4j.properties";
       // PropertyConfigurator.configure(log4jpath);
    }
    long time = FileReaderManager.getInstance().getConfigFileReader().getTime();



    public static void info(String message){
        log.info(message);
    }
    protected WebDriver getDrivr(){
        if(webDriver ==null) {
            switch (driverType) {
                case CHROME:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    if(FileReaderManager.getInstance().getConfigFileReader().getHeadleassmode().equalsIgnoreCase("true")) {
                        chromeOptions.addArguments("--headless");
                        chromeOptions.addArguments("--start-maximized");
                        chromeOptions.addArguments("--window-size=1920,1080");
                    }
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
                case HTML:
                    webDriver= new HtmlUnitDriver();
            }
        }

            webDriver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
            webDriver.manage().timeouts().setScriptTimeout(time, TimeUnit.MINUTES);
            webDriver.manage().timeouts().pageLoadTimeout(time, TimeUnit.MINUTES);

        return webDriver;
    }


}
