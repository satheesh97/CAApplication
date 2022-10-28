package com.step.steps;

import com.Steps.Definitions.AbstractStepDef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserCall extends AbstractStepDef {

    WebDriver driver = getDrivr();

    public void driverElemet(String name){
        driver.findElement(By.xpath(name));
    }


}
