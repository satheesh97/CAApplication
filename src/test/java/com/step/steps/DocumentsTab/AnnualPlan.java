package com.step.steps.DocumentsTab;

import com.Steps.Definitions.AbstractStepDef;
import com.locator.*;
import com.step.steps.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AnnualPlan extends AbstractStepDef {
    WebDriver driver = getDrivr();
    LoggerFile logger =new LoggerFile() ;
    AuditStep auditStep =new AuditStep();
    CommonLogic commonLogic = new CommonLogic();
    LandPageStep landPageStep =new LandPageStep();
    WaitStep waitStep= new WaitStep();
    ElementLocator elementLocator = new ElementLocator();
    MyTaskLocator myTaskLocator =new MyTaskLocator();
    MyTaskStep myTaskStep =new MyTaskStep();
    MRCCLocator mrccLocator =new MRCCLocator();
    Auditlocator auditlocator = new Auditlocator();
    DocumentStakeholderComms documentStakeholder= new DocumentStakeholderComms();
    DocumentandSytackholders docstoc= new DocumentandSytackholders();

    public String getCurrentYear(int count){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime localDateTime = LocalDateTime.now().plusYears(count);
        String date = dateTimeFormatter.format(localDateTime);
        return  date;
    }

    public void fillelemetn(int count){
        WebElement planYear= driver.findElement(By.xpath(docstoc.planYear));
        planYear.sendKeys(getCurrentYear(count));
        documentStakeholder.click(docstoc.startDate);
        waitStep.waitPageload();
        WebElement element =driver.findElement(By.xpath(docstoc.aletr));

        try {
            if (element.isDisplayed()) {
                count++;
                planYear.clear();
                fillelemetn(count);
            }
        }catch(Exception e){
            logger.info("Element  not present");
        }
        commonLogic.writeYear(planYear.getAttribute("value"));
    }

    public void fillBudgetDay(){

        List<WebElement> date=driver.findElements(By.xpath(docstoc.budgetdays));
        for(int i =0;i<date.size();i++){
            String days = String.valueOf(commonLogic.randomNumber(date.size()));
            date.get(i).sendKeys(days);
        }

    }
    public void fillAnualPaln(){
        int count =0;
        fillelemetn(count);
        fillBudgetDay();
    }

    public void searchYear(){
        driver.findElement(By.xpath(docstoc.searchYear)).sendKeys(commonLogic.readYear());
        waitStep.clickYear();
        logger.info("Search field prescent and Value is  "+ commonLogic.readYear());
        waitStep.driverwait5();
        documentStakeholder.click(docstoc.planyeardate);
        waitStep.buttonClickWait();
    }
    public void singleClickdownwithValue(String Type,String singleSelect) {
        String Locator ="//span[text()='"+singleSelect+"']//following::div[contains(@class,'placeholder')]";
        WebElement drop = driver.findElement(By.xpath(Locator));
        drop.click();
        List<WebElement> droplist = driver.findElements(By.xpath(auditlocator.dropTableIndex));
        for (int i =0;i<droplist.size();i++){
            String value =droplist.get(i).getText();
            if(value.equalsIgnoreCase(Type)) {
                droplist.get(i).click();
                i=droplist.size();
            }
        }
        logger.info("DropDwon Value Selected");
    }
    public void moveLevelUpDowun(String upDown){
        String levelUPDown="//strong[text()='"+upDown+"']";
        documentStakeholder.click(levelUPDown);
        waitStep.buttonClickWait();
    }

    public void clickAndUploadDocument(String message){
        String elips="//button[contains(@class,'record_action_menu_icon')]";
        List<WebElement> docButton=driver.findElements(By.xpath(elips));
        for(int  i =0;i<docButton.size();i++){
            docButton.get(i).click();
            myTaskStep.clickmenuData(message);
            waitStep.fileUpload(docstoc.fileInput,docstoc.filePath);
            waitStep.clickButton("Submit");
            waitStep.clickReminderButton("Reminder","Submit");
            waitStep.buttonClickWait();
        }
    }

    public void fillpublshReport(){
        documentStakeholder.clickRadioOption("Final");
        documentStakeholder.clickRadioOption("Finalised");
        //auditStep.enterNo(docstoc.auditReportIndex);
       SendKeys(docstoc.auditReportIndex,"450");
        documentStakeholder.filltextarea("Executive Summary");
        documentStakeholder.clickRadioOption("B");
        documentStakeholder.clickRadioOption("Medium-Low");
        documentStakeholder.filltextareabox("Summary");
        auditStep.searchAndEnter(docstoc.managmentResponse);
        documentStakeholder.filltextarea("Response");
        waitStep.clickSubmit("Submit");
        alertVisible();
        waitStep.clickSubmit("Confirm");
        documentStakeholder.fileupload();
        waitStep.waitPageload();
        documentStakeholder.fileupload();
        waitStep.waitPageload();
        waitStep.clickSubmit("Proceed to publish");
        waitStep.clickSubmit("Email distribution list");
    }
    public void alertVisible(){
        try{
            int count= Integer.parseInt(driver.findElement(By.xpath(docstoc.auditReportIndex)).getAttribute("value"));
            WebElement element = driver.findElement(By.xpath(docstoc.aletr));
            if(element.isDisplayed()){
                count++;
                SendKeys(docstoc.auditReportIndex, String.valueOf(count));
               //waitStep.waitSometime();
                waitStep.clickSubmit("Submit");
                alertVisible( );
            }
        }catch (Exception e){
            logger.info("Element not Visible");
        }

    }

    public void SendKeys(String auditReportIndex,String count) {
       WebElement element =driver.findElement(By.xpath(auditReportIndex));
       element.clear();
       element.sendKeys(count);
    }

    public void clickForFocus(){
        String path ="//input[@placeholder='Search Audits']";
        documentStakeholder.click(path);
    }

    public void validateAuditName(){
   String name =driver.findElement(By.xpath("//h1")).getText();
   if(name.contains("AU-")){
       Assert.assertTrue(name.contains("AU-"));
       logger.info("****Audit Reference Number Done and Expected ******" );
   }else{
       logger.info("****Audit Reference Number is not Expected ******" );
   }
       }

public void  checkTable(){
        documentStakeholder.click(docstoc.tableCheckBox);
        waitStep.pageLoadWait();
}

}
