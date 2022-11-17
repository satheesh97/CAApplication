package com.step.steps.MRCCTab;

import com.Steps.Definitions.AbstractStepDef;
import com.locator.CommonLogic;
import com.locator.MRCCLocator;
import com.locator.MyTaskLocator;
import com.step.steps.*;
import org.apache.pdfbox.pdmodel.font.encoding.MacExpertEncoding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MRCCManageStep extends AbstractStepDef {

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

    public void unCheckMRRCIndicator(){

        List<WebElement> mandatory =driver.findElements(By.xpath(mrccLocator.NonMandatory));
        List<WebElement>checkBox= driver.findElements(By.xpath(mrccLocator.tableCheckBox));
        List<WebElement>tableText=driver.findElements(By.xpath(mrccLocator.tableTextArea));

        WebElement list = driver.findElement(By.className("hrmoruan"));
    }

    public void pageNavigation(){
        WebElement nextButton =driver.findElement(By.xpath(mrccLocator.buttonDisabel));
        if(nextButton.isEnabled()) {
            nextButton.click();
            waitStep.pageWait();
        }else{
            logger.info("Buttton disabel");
        }
    }

    public void fillTheRating(){
        WebElement nextButton =driver.findElement(By.xpath(mrccLocator.buttonDisabel));
          callRateing();
            callRateing();
                    callRateing();
            callRateing();

        myTaskStep.singleClickdown(mrccLocator.userRating);

        }
        public void callRateing(){
            fillRate();
            filltheParagraph(mrccLocator.supportRationale);
            pageNavigation();
            waitStep.clickWait();
        }

public void fillRate(){
    List<WebElement> SelectRating =driver.findElements(By.xpath(mrccLocator.indicativeRating));
    for(int i= 0;i< SelectRating.size();i++){
        waitStep.pageLoadWait();
        SelectRating.get(i).click();
        slectTableSugesstion();
        logger.info("I fille the info for Rating ");}
}

        public void filltheParagraph(String info){
            List<WebElement> supportRational =driver.findElements(By.xpath(info));
            for(int i= 0;i< supportRational.size();i++){
                supportRational.get(i).sendKeys(commonLogic.readFile());
                //  auditStep.enterText(mrccLocator.supportRationale);
                }
        }


public void slectTableSugesstion(){
        List<WebElement> tableindex = driver.findElements(By.xpath(myTaskLocator.dropTableIndex));
        for(int i=0;i<tableindex.size();i++){
            int count =commonLogic.randomNumber(tableindex.size());
            logger.info(count+" ");
            if(count==tableindex.size()){
                count--;
            }
            tableindex.get(count).click();
            logger.info(count+" ");
            i=tableindex.size();

        }
}

    public String getUIInfo(String UI){
        String info=driver.findElement(By.xpath(UI)).getText();
    return info;
    }


    public void addPlaningToll(){
        auditStep.enterTextDate(mrccLocator.tollgateDate,0);
        click(mrccLocator.addExternalStake);
        auditStep.enterTextarea(mrccLocator.exStakeholder);
        click(mrccLocator.addDecision);
        auditStep.enterText(mrccLocator.tasklogtitle);
        auditStep.searchAndEnterWithData(mrccLocator.tasklogOwner,mrccLocator.Owner);
        //auditStep.enterTextDate(mrccLocator.tasklogDate,0);
        auditStep.enterTextarea(mrccLocator.tasklogDescription);
        click(mrccLocator.taskcheckbox);

    }

    public void click(String locator){
        driver.findElement(By.xpath(locator)).click();
        waitStep.pageLoadWait();
    }


    public void validateForm(String form){
        if(form.equalsIgnoreCase("tollgates")){
            validatetolgate();
        }else {
            landPageStep.isPresent(mrccLocator.tollgateDate);
        }
    }

    void validatetolgate() {
        landPageStep.isPresent(myTaskLocator.planning);
        landPageStep.isPresent(myTaskLocator.fieldWork);
        landPageStep.isPresent(myTaskLocator.report);
    }
}
