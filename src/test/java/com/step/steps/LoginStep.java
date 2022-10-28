package com.step.steps;

import Managers.FileReaderManager;
import com.Steps.Definitions.AbstractStepDef;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginStep extends AbstractStepDef {

    WebDriver driver = getDrivr();
    ElementLocator elementLocator = new ElementLocator();


    public void launcbrowserurl(){
        driver.get(FileReaderManager.getInstance().getConfigFileReader().getURL());
        driver.manage().window().maximize();
    }

    public void launchUsername(String name, String pass){

        driver.findElement(elementLocator.name).sendKeys(name);
        driver.findElement(elementLocator.password).sendKeys(pass);
        driver.findElement(elementLocator.signIN).click();
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
