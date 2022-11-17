package com.step.steps;

import com.Steps.Definitions.AbstractStepDef;
import com.locator.CommonLogic;
import com.locator.LandingPageLocator;
import com.locator.MyTaskLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MyTaskStep extends AbstractStepDef {

    WebDriver driver = getDrivr();
    LoggerFile logger =new LoggerFile() ;
    AuditStep auditStep =new AuditStep();
    LandPageStep landPageStep =new LandPageStep();
    WaitStep waitStep= new WaitStep();
    ElementLocator elementLocator = new ElementLocator();
    MyTaskLocator myTaskLocator = new MyTaskLocator();
    CommonLogic commonLogic = new CommonLogic();
    public String windHandleBefore=driver.getWindowHandle();

    public void click(String path){
        driver.findElement(By.xpath(path)).click();
        waitStep.waitPageload();
    }

    public void  SendkeysSingleValue(String data, String action){
        String path ="//p/strong/a[contains(text(),'"+data+"')]";
        click(path);
        waitStep.clickSubmit(action);

    }



    public void selectTaskType(String data, String action){
        //click(myTaskLocator.taskType);
        SendkeysSingleValue(data,action);
        waitStep.driverwait5();
    }

    public void filltheException(){
        auditStep.enterText(myTaskLocator.title);
        auditStep.enterTextarea(myTaskLocator.Description);
        singleClickdown(myTaskLocator.Status);
        auditStep.clickRadioButton(myTaskLocator.risk);
        auditStep.clickRadioButton(myTaskLocator.Level3Risk);
        click(myTaskLocator.selectRow);
        click(myTaskLocator.selectAvialbelOT);
        waitStep.waitPageload();
        waitStep.clickButton("Submit for Review");
    }

    public void completeOTException(){
        auditStep.enterTextarea(myTaskLocator.title);
        singleClickdown(myTaskLocator.Status);
        waitStep.clickButton("Save");

    }

    public void viewAction(){
        click(myTaskLocator.selectViewOption);
        waitStep.waitPageload();
    }

    public void fllissueForm(){
        click(myTaskLocator.selectAvialbelExp);
        waitStep.waitPageload();
        auditStep.enterText(myTaskLocator.title);
        auditStep.enterTextarea(myTaskLocator.Description);
        singleClickdown(myTaskLocator.selectRiskrate);
        singleClickdown(myTaskLocator.Selectissue);
        auditStep.searchAndEnter(myTaskLocator.issueOwner);
        auditStep.enterTextDate(myTaskLocator.dueDate,0);
        singleClickdown(myTaskLocator.riskCategory);
        singleClickdown(myTaskLocator.IATaxonomy);
        auditStep.mulClickDropdown(myTaskLocator.issueCause);
        auditStep.mulClickDropdown(myTaskLocator.groupRiskThem);
        auditStep.mulClickDropdown(myTaskLocator.materialEntities);
        auditStep.mulClickDropdown(myTaskLocator.relavantRegion);
        waitStep.clickButton("Submit for Review");
        viewAction();
    }

    public void iFillActionForm(){
        auditStep.enterText(myTaskLocator.title);
        auditStep.enterTextarea(myTaskLocator.Description);
        auditStep.clickRadioButton(myTaskLocator.ActionImplemntedYes);
        singleClickdown(myTaskLocator.actionStatus);
        waitStep.clickButton("Save");
    }
    public void iValidateActionfield(){
        landPageStep.isPresent(myTaskLocator.title);
        landPageStep.isPresent(myTaskLocator.Description);
        landPageStep.isPresent(myTaskLocator.ActionImplemntedYes);
        landPageStep.isPresent(myTaskLocator.ActionImplemntedNo);
        auditStep.clickRadioButton(myTaskLocator.ActionImplemntedYes);
        landPageStep.isPresent(myTaskLocator.actionStatus);
    }

    public void ivalidateAuditProgramPage(){
        landPageStep.isPresent(myTaskLocator.cTRAI);
        landPageStep.isPresent(myTaskLocator.cTLevel2);
        landPageStep.isPresent(myTaskLocator.ctLevel3);
        landPageStep.isPresent(myTaskLocator.ctControlName);
        landPageStep.isPresent(myTaskLocator.ctDET);
        landPageStep.isPresent(myTaskLocator.ctOET);
        landPageStep.isPresent(myTaskLocator.ctExptionAndIssues);
        landPageStep.isPresent(myTaskLocator.Action);
        landPageStep.isPresent(myTaskLocator.oToutcome);
        verifyMenu();
    }

    public  void verifyMenu(){
        click(myTaskLocator.menuCTIcon);
        landPageStep.isPresent(myTaskLocator.menuUC);
        landPageStep.isPresent(myTaskLocator.menuDET);
        landPageStep.isPresent(myTaskLocator.menuOET);
        click(myTaskLocator.menuOTIcon);
        landPageStep.isPresent(myTaskLocator.menuDeactive);
        landPageStep.isPresent(myTaskLocator.menuOT);

    }

    public void exceptionMenuClick(String IconData){
        click(myTaskLocator.menuIcon);
        clickmenuData(IconData);
    }
    public void clickmenuData(String IconData ){


        List<WebElement> menu = driver.findElements(By.xpath(myTaskLocator.dropTableIcon));
        for(int i=0;i<menu.size();i++){
            if(menu.get(i).getText().equalsIgnoreCase(IconData)){
                //   logger.info(menu.get(i).getText()+" *****************");
                logger.info(menu.get(i).getText()+" Menu Clicked *****************");
                menu.get(i).click();

                i= menu.size();

            }
        }
    }


    public void singleClickdown(String singleSelect) {
        WebElement drop = driver.findElement(By.xpath(singleSelect));
        if (drop.isDisplayed()) {
            drop.click();
            List <WebElement>body=driver.findElements(By.xpath(myTaskLocator.dropTableIndex));
            body.get(commonLogic.randomNumber(body.size())).click();

        }

    }

    public void ctMenuClick() {
        click(myTaskLocator.menuCTIcon);
    }



    public void OtMenuClick() {
        click(myTaskLocator.menuOTIcon);
    }

    public void deactivateOET_DET(){
        List<WebElement> DET_OET=driver.findElements(By.xpath(myTaskLocator.deactivateOET_DET));
        for(int i=0;i<DET_OET.size();i++){
            if (i== DET_OET.size()-1){
                DET_OET.get(i).click();
            }
        }
    }

    public void deactivateOt(String deactivate){
        OtMenuClick();
        clickmenuData(deactivate);
        waitStep.pageLoadWait();
        deactivateOTReason();
    }
    public void deactivateOTReason(){
        auditStep.enterTextarea(myTaskLocator.deactivateOTReason);
    }


    public void newWindowFocusse(){
        for(String window:driver.getWindowHandles()){
            driver.switchTo().window(window);
        }
    }
    public void closeDriver(){
        driver.close();
    }
    public void switchMainWindow(){
        driver.switchTo().window(windHandleBefore);
    }

    public void addNewEntity(String stage){
        String Button="//a[contains(text(),'"+stage+"')]//following::button";
        click(Button);
        waitStep.waitPageload();
    }




}
