package com.step.steps;

import Managers.FileReaderManager;
import com.Steps.Definitions.AbstractStepDef;
import com.Steps.Definitions.LoginStepDef;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.time.*;


public class LoginStep extends AbstractStepDef {

    WebDriver driver = getDrivr();
    LoggerFile logger =new LoggerFile() ;
    ElementLocator elementLocator = new ElementLocator();
    private static final Logger LOGGER= LogManager.getLogger(LoginStepDef.class);

    public void launcbrowserurl(){
        driver.get(FileReaderManager.getInstance().getConfigFileReader().getURL());
        driver.manage().window().maximize();
    }

    public void launchUsername(String name, String pass){
        boolean present =driver.findElement(elementLocator.name).isDisplayed();
        boolean present1 =driver.findElement(elementLocator.name).isEnabled();

        driver.findElement(elementLocator.name).sendKeys(name);
        logger.info("Launch the User name" + name);
        driver.findElement(elementLocator.password).sendKeys(pass);
        logger.info("Launch the Password  " + pass);
        driver.findElement(elementLocator.signIN).click();
        logger.info("Click the application");
    }

public void  clikableButton(String butName){
        String btnm=""+butName +"";

}

public void isVisible(String element){

        if(driver.findElement(By.xpath(element)).isDisplayed()){
            Assert.assertTrue(driver.findElement(By.xpath(element)).isDisplayed());
        }else {

        }
}

public String getValue(String name){
      return  driver.findElement(By.xpath(name)).getAttribute("value");
}
@After
    public void close(){
       // driver.close();
}



}
