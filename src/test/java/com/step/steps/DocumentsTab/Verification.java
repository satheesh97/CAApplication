package com.step.steps.DocumentsTab;

import com.Steps.Definitions.AbstractStepDef;
import com.beust.ah.A;
import com.locator.*;
import com.step.steps.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Verification extends AbstractStepDef {
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
    AnnualPlan annualPlan = new AnnualPlan();
    SoftAssert softAssert =new SoftAssert();
    public void clickTableRow(){
        try{
            List<WebElement> element =driver.findElements(By.xpath(docstoc.rowCheckBox));
            for(int i=0;i<element.size();i++){
                if(element.get(i).isEnabled()){
                    documentStakeholder.click(docstoc.rowCheckBox);
                    i=element.size();
                }
            }
            waitStep.waitPageload();
        }catch (Exception e){
            logger.info("Element already checked");
        }
    }
    public void clickAccentIcon(){
        List<WebElement>elements =driver.findElements(By.xpath(docstoc.accentIcon));
        for(int i=0;i<elements.size();i++){
            documentStakeholder.click(docstoc.accentIcon);
        }
    }
    public void tableMenu(String icon, String tabel){
        String path ="//span[contains(text(),'"+tabel+"')]//following::td/div/div/button";
        documentStakeholder.menuButton(path);
        myTaskStep.clickmenuData(icon);
    }
    public void fillLinkedTable(){
        documentStakeholder.clickRadioOption("Control");
        logger.info("Control element  clicked");
        singledropdownList(docstoc.controlLink);
    }
    public void singledropdownList(String name){
        driver.findElement(By.xpath(name)).click();
        List<WebElement> data = driver.findElements(By.xpath(auditlocator.dropTableIndex));
        data.get(1).click();
    }

    public void summaryOfLinkedControl(){
        myTaskStep.click(docstoc.summaryControl);
    }
    public void summaryOfLinkedAction(){
        myTaskStep.click(docstoc.summaryAction);
        waitStep.waitPageload();
    }

    public void clickLabel(String label){
        String path="//a[contains(text(),'"+label+"')]";
        documentStakeholder.click(path);
    }
    public void inputData(String path, String value){
        String locator = "//label[contains(text(),'"+path+"')]//following::input[@placeholder='CS-2020-123' and @value='']";
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void singleClickDropdownwithValue(String path,String Type) {
        String Locator ="//span[text()='"+path+"']//following::div[contains(text(),'--- Select a Prior Report Rating ---')]";
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


    public void VerifyVerificationField(){
        issueTableVerification();
        actionTableVerification();
    }
    public void issueTableVerification(){
        landPageStep.isPresent(docstoc.micosIssueID);
        landPageStep.isPresent(docstoc.issueTittle);
        landPageStep.isPresent(docstoc.issueRating);
        landPageStep.isPresent(docstoc.headAudit);
        landPageStep.isPresent(docstoc.chiefSudit);
        landPageStep.isPresent(docstoc.issueVerification);
        landPageStep.isPresent(docstoc.verificationReward);
    }
    public void actionTableVerification(){
        landPageStep.isPresent(docstoc.actionTittle);
        landPageStep.isPresent(docstoc.audit);
        landPageStep.isPresent(docstoc.control);
        landPageStep.isPresent(docstoc.DET);
        landPageStep.isPresent(docstoc.OET);
        landPageStep.isPresent(docstoc.outComeTest);
    }
public void rasioOptionVisble(String question,String value){
        String path ="//span[contains(text(),'"+question+"')]//following::label[text()='"+value+"']";
        documentStakeholder.click(path);
        isVisibleCheck(path);
}
    public void isVisibleCheck(String label){
        try{
            WebElement element = driver.findElement(By.xpath(label));
            if(element.isDisplayed()){
                Assert.assertTrue(element.isDisplayed());
                logger.info("Element is Visible");
                waitStep.pageLoadWait();
            }
        }catch (Exception e){
            logger.info("Element not visible");
        }
    }

    public void linkTextVisible(String value){
        String label ="//a[contains(text(),'"+value+"')]";
        waitStep.driverwait2();
        try{
            WebElement element = driver.findElement(By.xpath(label));
            if(element.isDisplayed()){
                Assert.assertFalse(element.isDisplayed());
                logger.info("As per the logic Element is not Visble here");
                waitStep.pageLoadWait();
            }
        }catch (Exception e){
            logger.info("Element not visible");
        }
    }

    public void verifyWarningMessage(){
        isVisibleCheck(docstoc.warning);
    }

    public void vlaidateStatus(String Status){
        String status ="//p[contains(text(),'"+Status+"')]";
        try{
            WebElement element =driver.findElement(By.xpath(status));
            String value =element.getText();
            if(value.equalsIgnoreCase(Status)){
                softAssert.assertTrue(value.equalsIgnoreCase(Status));
                logger.info("*********Status of UI is "+value);
            }


        }catch (Exception e){
            logger.info("Status not avilabelError infomation");
        }

    }
}
