package com.step.steps;

import com.Steps.Definitions.AbstractStepDef;
import com.locator.LandingPageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class WaitStep extends AbstractStepDef {

    WebDriver driver = getDrivr();
    LoggerFile logger =new LoggerFile() ;
    LandingPageLocator landingPageLocator= new LandingPageLocator();

    public void waitSec(int wait){
        try{
            for(int i=0;i<=wait;i++)
            Thread.sleep(500);
        }catch( InterruptedException e){
            e.printStackTrace();
        }

    }
    public void waitPageload(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void waitPage(String wait){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void clickSubmit(String name)  {
        String path = "//button[contains(text(),'"+name+"')]";
        try{
       WebElement element= driver.findElement(By.xpath(path));
       if(element.isDisplayed()) {
          element.click();
           driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
           buttonClickWait();
           logger.info(name + " element  Clicked Sucessfully");
       }
        }catch (Exception e){
            logger.info("Element is not visible");
        }
    }

    public void clickablediv(String name)  {
        String path = "//strong[contains(text(),'"+name+"')]";
        driver.findElement(By.xpath(path)).click();
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        waitSometime();
        logger.info(name+" element  Clicked Sucessfully");


    }
    public void footerDeactivate(String name){
         String button ="//div[contains(@class,'---footer')]//following::button[contains(text(),'"+name+"')]";
        driver.findElement(By.xpath(button)).click();
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        waitSometime();
        logger.info(name+" element  Clicked Sucessfully");

    }
public void clickText(String textName){
        String text ="//span[contains(text(),'"+textName+"')]";
        driver.findElement(By.xpath(text)).click();
        waitPage("");
}

    public void waitSometime(){
        for(int i=0;i<=10;i++) {
             try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                System.out.println("Page has not loaded yet ");
            }
        }
    }

    public void clickButton(String Button){
        String path = "//button[contains(text(),'"+ Button +"')]";
        driver.findElement(By.xpath(path)).click();
        logger.info(Button +" element  Clicked Sucessfully");
        buttonClickWait();
    }
    public void close(){
        driver.close();
    }


    public void fileUpload(String path, String dir){
       WebElement file=  driver.findElement(By.xpath(path));
        file.sendKeys(dir);
    }
    public void clickMenu(String menuTab){

        String menu ="//a/div[contains(text(),'"+menuTab+"')]";
        driver.findElement(By.xpath(menu)).click();
        logger.info(menuTab+" element  Clicked Sucessfully");
        buttonClickWait();
    }

    public void clickNaviagtion(String Navigation){

        String menu ="//a[contains(text(),'"+Navigation+"')]";
        driver.findElement(By.xpath(menu)).click();
        logger.info(Navigation+" element  Clicked Sucessfully");
        buttonClickWait();
    }

    public void clickSubMenu(String subMenubutton){
        String subMenu="//p/span[contains(text(),'"+subMenubutton+"')]";
        driver.findElement(By.xpath(subMenu)).click();
        logger.info(subMenubutton+" element  Clicked Sucessfully");
        buttonClickWait();
    }
    public void clickReminderButton(String reminder, String option){
        String Confrim ="//h4[text()='"+reminder+"']//following::button[text()='"+option+"']";
      try {
          WebElement element = driver.findElement(By.xpath(Confrim));
          if(element.isDisplayed()) {
              element.click();
              logger.info(option + " element  Clicked Sucessfully");
              buttonClickWait();
          }
      }catch (Exception e){
          logger.info("Element not Vissible");
      }
    }
    public void clickIcon(String icon){

        String Confrim = null;
        if(icon.equalsIgnoreCase("cancel")){
            Confrim ="//div[@data-thumbnail='false']";
        }else if(icon.equalsIgnoreCase("dot")){
            Confrim="//button[contains(@class,'record_action_menu_icon')]";
        }
        driver.findElement(By.xpath(Confrim)).click();
        logger.info(icon+" element  Clicked Sucessfully");
        buttonClickWait();
    }

    public void clickButtonMenu(String buttonMenubutton){
        String subMenu="//div/div[contains(text(),'"+buttonMenubutton+"')]";
        driver.findElement(By.xpath(subMenu)).click();
        logger.info(buttonMenubutton+"element  Clicked Sucessfully");
        pageWait();
    }

    public void clickSubMenuButton(String name ){
        String subMenu="//div/div[contains(text(),'"+name+"')]";
        driver.findElement(By.xpath(subMenu)).click();
        logger.info(name+" element  Clicked Sucessfully");
       buttonClickWait();
    }


    public void click(){
        if( driver.findElement(By.xpath(landingPageLocator.searchButton)).isDisplayed()) {
            driver.findElement(By.xpath(landingPageLocator.searchButton)).click();
            logger.info("element  Clicked Sucessfully");
        }
    }

    public void clickYear(){
        if( driver.findElement(By.xpath(landingPageLocator.yearSearchButton)).isDisplayed()) {
            driver.findElement(By.xpath(landingPageLocator.yearSearchButton)).click();
            logger.info("element  Clicked Sucessfully");
        }
    }
    public void clickTask(){

            driver.findElement(By.xpath(landingPageLocator.TaskSearchButtion)).click();
        logger.info("element  Clicked Sucessfully");

    }


    public void clickSearch(){
        driver.findElement(By.xpath(landingPageLocator.searchButton_1)).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
    }

    public void buttonClickWait(){
        for(int i=0;i<=6;i++) {
            try {
                Thread.sleep(2500);
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
        for(int i=0;i<=8;i++) {
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
    public void pageLoadWait(){
        for(int i=0;i<=5;i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}

