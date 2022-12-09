package com.step.steps.MRCCTab;

import com.Steps.Definitions.AbstractStepDef;
import com.locator.Auditlocator;
import com.locator.CommonLogic;
import com.locator.MRCCLocator;
import com.locator.MyTaskLocator;
import com.step.steps.*;
import org.apache.pdfbox.pdmodel.font.encoding.MacExpertEncoding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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
    Auditlocator auditlocator = new Auditlocator();

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


        callRateing();
        String text =driver.findElement(By.xpath("//span/span/Strong[contains(text(),'')]")).getText();
        logger.info("@@@@@@@@@@@@@@@@@@@@@2"+text);
        singleClickdownRating(mrccLocator.userRating,text);
        auditStep.enterTextarea(mrccLocator.MRCCParagraph);

    }
    public boolean visible(String path){
        if(driver.findElement(By.xpath(path)).isDisplayed()){
            logger.info("Element Visibel");
            return true;
        }else{
            logger.info("Element not Visibel");
            return false;

        }

    }


    public void callRateing(){
        fillRate();
        filltheParagraph(mrccLocator.supportRationale);
        //  pageNavigation();
        waitStep.clickWait();
    }

    public void fillRate(){
        List<WebElement> SelectRating =driver.findElements(By.xpath(mrccLocator.indicativeRating));
        for(int i= 0;i< SelectRating.size();i++){
            waitStep.pageLoadWait();
            SelectRating.get(i).click();
            selectTableSugesstion();
            logger.info("I fille the info for Rating ");}
    }

    public void filltheParagraph(String info){
        List<WebElement> supportRational =driver.findElements(By.xpath(info));
        for(int i= 0;i< supportRational.size();i++){
            supportRational.get(i).sendKeys(commonLogic.readFile());
            logger.info("Text area Filed");
            //  auditStep.enterText(mrccLocator.supportRationale);
        }
    }


    public void selectTableSugesstion(){
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


    public void selectTableSugesstion(String name ){
        List<WebElement> tableindex = driver.findElements(By.xpath(myTaskLocator.dropTableIndex));
        for(int i=0;i<tableindex.size();i++) {
            if (tableindex.get(i).getText().equalsIgnoreCase(name)) {
                tableindex.get(i).click();
                i = tableindex.size();
            }

        }
    }
    public void singleClickdownRating (String singleSelect,String Data) {
        WebElement drop = driver.findElement(By.xpath(singleSelect));
        if (drop.isDisplayed()) {
            drop.click();
            List<WebElement> tableindex = driver.findElements(By.xpath(myTaskLocator.dropTableIndex));
            for(int i=0;i<tableindex.size();i++) {
                if (tableindex.get(i).getText().equalsIgnoreCase(Data)) {
                    tableindex.get(i).click();
                    i = tableindex.size();
                }
            }
        }

    }
    public void intersction(String data){
        click(mrccLocator.interSection);
        selectTableSugesstion(data);
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

    public void fillLeadAuidt(){
        auditStep.searchAndEnterWithData(mrccLocator.auditlead,mrccLocator.auditOwner);
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

    public void validatetolgate() {
        landPageStep.isPresent(myTaskLocator.planning);
        landPageStep.isPresent(myTaskLocator.fieldWork);
        landPageStep.isPresent(myTaskLocator.report);
    }
    public void manageGroup(){
        auditStep.clickObject(mrccLocator.addGroupStratagy);
        addPiller();
        keyInitiative();
        auditStep.enterTextarea(mrccLocator.auditHypothesis);
        auditStep.enterTextarea(mrccLocator.IAKeyconsiderations);
        auditStep.enterTextarea(mrccLocator.concultion);
        waitStep.waitPageload();

    }
    public void addPiller(){
        click(mrccLocator.groupPiller);
        selectTableSugesstion();
    }
    public void keyInitiative(){
        click(mrccLocator.keyInitiatives);
        selectTableSugesstion();
    }

    public void removePiller(){
        click(mrccLocator.removeGrop);
    }
    public void verifyHistroy(){
        landPageStep.isPresent(mrccLocator.activityHistoryActivity);
        landPageStep.isPresent(mrccLocator.activityHistroyDiscription);
        landPageStep.isPresent(mrccLocator.activityHistoryCompleteBy);
        landPageStep.isPresent(mrccLocator.activityHistoryCompletOn);
    }
    public void manageBudget(String phase){
        addBudget();
        selectPhase(phase);
        click(mrccLocator.country);
        selectTableSugesstion();
        click(mrccLocator.skill);
        selectTableSugesstion();
        click(mrccLocator.headAudit);
        selectTableSugesstion();
        auditStep.enterNo(mrccLocator.allocatedBudget);
    }
    public void addBudget(){
        click(mrccLocator.addBudget);
    }
    public void selectPhase(String phase){
        click(mrccLocator.phase);
        selectTableSugesstion(phase) ;
    }

    public void mrccRatingFill(){
        String selectRow ="//tbody/tr";
        String uncheckBox="//tbody/tr/td/div/p/span[@class='IconWidget---color_secondary']//preceding::td[1]/div[contains(@class,'Check')]";
        String uncheckBox1="//tbody/tr/td[1]/div[contains(@class,'Checkbox')]";
        String textbox="//tbody/tr/td/div/textarea";

//List<WebElement> selectrow =driver.findElements(By.xpath(selectMatory));
        List<WebElement>checkbox = driver.findElements(By.xpath(uncheckBox));
        List<WebElement>text = driver.findElements(By.xpath(textbox));

        for(int i=0;i<checkbox.size();i++){
            checkbox.get(i).click();
            waitStep.clickWait();
            //text.get(i).sendKeys(commonLogic.readFile());
            logger.info("Chech box unchecked for this click");
        }
        for (int i=0;i<text.size();i++) {
            if (text.get(i).isEnabled()) {
                text.get(i).sendKeys(commonLogic.readFile());
            }
        }
/*
for(int i=0;i<selectrow.size();i++){
    selectrow.get(i).click();
//tbody/tr/td/div/p/span[@class='IconWidget---color_positive']//preceding::td[1]/div[contains(@class,'Check')]";
    waitStep.clickWait();
    logger.info("Chech box checked for mantory");
}
*/
    }


    public void verifyStaffPage(){
      // budgetTotal();
        staffing();
        //budgetDetails();
    }

    public void budgetTotal(){
        landPageStep.isPresent(mrccLocator.preplan);
        landPageStep.isPresent(mrccLocator.palnning);
        landPageStep.isPresent(mrccLocator.fieldwork);
        landPageStep.isPresent(mrccLocator.clearance);
        landPageStep.isPresent(mrccLocator.Total);
    }
    public void staffing(){
        landPageStep.isPresent(mrccLocator.addedon);
        landPageStep.isPresent(mrccLocator.teamMember);
        landPageStep.isPresent(mrccLocator.reviewer);
        landPageStep.isPresent(mrccLocator.schedular);

    }
    public void budgetDetails(){
        landPageStep.isPresent(mrccLocator.Bpahse);
        landPageStep.isPresent(mrccLocator.Bskill);
        landPageStep.isPresent(mrccLocator.location);
    }

    public void verifyElemetn(){
        disable(mrccLocator.level2Rsik);
        disable(mrccLocator.level3Risk);
    }
    public void disable(String locator){
WebElement unEnable = driver.findElement(By.xpath(locator));
try{
    Assert.assertFalse(unEnable.isEnabled());
    logger.info("Element is Diasble");
}catch (Exception e){
    logger.info("Element is Enable");
}
    }


}
