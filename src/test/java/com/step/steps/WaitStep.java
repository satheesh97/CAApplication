package com.step.steps;

import com.Steps.Definitions.AbstractStepDef;
import com.locator.LandingPageLocator;
import io.cucumber.java.en.But;
import javafx.scene.web.WebErrorEvent;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
@Log4j
public class WaitStep extends AbstractStepDef {

    WebDriver driver = getDrivr();
    LandingPageLocator landingPageLocator= new LandingPageLocator();

    public void waitSec(int wait){
        try{
            for(int i=0;i<=wait;i++)
            Thread.sleep(500);
        }catch( InterruptedException e){
            e.printStackTrace();
        }

    }
    public void waitPage(String wait){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        log.info("Waiting page for the locatoe");
    }

    public void clickSubmit(String name)  {
        String path = "//button[contains(text(),'"+name+"')]";
        driver.findElement(By.xpath(path)).click();
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        waitSometime();


    }
    public void waitSometime(){
        for(int i=0;i<=10;i++) {
             try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Page has not loaded yet ");
            }
        }
    }

    public void clickButton(String Button){
        String path = "//button[contains(text(),'"+ Button +"')]";
        driver.findElement(By.xpath(path)).click();
        driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
        buttonClickWait();
    }

    public void fileUpload(String path, String dir){
       WebElement file=  driver.findElement(By.xpath(path));
file.sendKeys(dir);
    }
    public void clickMenu(String menuTab){

        String menu ="//a/div[contains(text(),'"+menuTab+"')]";
        driver.findElement(By.xpath(menu)).click();
        buttonClickWait();
    }

    public void clickSubMenu(String subMenubutton){
        String subMenu="//p/span[contains(text(),'"+subMenubutton+"')]";
        driver.findElement(By.xpath(subMenu)).click();
        buttonClickWait();
    }

    public void clickButtonMenu(String buttonMenubutton){
        String subMenu="//div/div[contains(text(),'"+buttonMenubutton+"')]";
        driver.findElement(By.xpath(subMenu)).click();
        pageWait();
    }

    public void clickSubMenuButton(String name ){
        String subMenu="//div/div[contains(text(),'"+name+"')]";
        driver.findElement(By.xpath(subMenu)).click();
        pageWait();
    }


    public void click(){
        driver.findElement(By.xpath(landingPageLocator.searchButton)).click();
    }


    public void clickSearch(){
        driver.findElement(By.xpath(landingPageLocator.searchButton_1)).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
    }

    public void buttonClickWait(){
        for(int i=0;i<=5;i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void clickWait(){
        for(int i=0;i<=5;i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void driverwait5(){
        for(int i=0;i<=5;i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void driverwait2(){
        for(int i=0;i<=5;i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void pageWait(){
        for(int i=0;i<=5;i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}

