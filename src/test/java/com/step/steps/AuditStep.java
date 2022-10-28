package com.step.steps;

import com.ExpectedData.ExpectedDataClass;
import com.Steps.Definitions.AbstractStepDef;
import com.locator.Auditlocator;
import com.locator.CommonLogic;
import com.locator.LandingPageLocator;
import io.cucumber.java.bs.A;
import org.apache.commons.logging.Log;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class AuditStep extends AbstractStepDef {

    WebDriver driver = getDrivr();
    Auditlocator auditlocator = new Auditlocator();
    ExpectedDataClass expectedDataClass =new ExpectedDataClass();
    CommonLogic commonLogic = new CommonLogic();
    WaitStep waitStep = new WaitStep();

    LoginStep loginStep = new LoginStep();
    int index9 = commonLogic.randomNumber9();
    int index4 = commonLogic.randomNumber4();

    LandingPageLocator landingPageLocator =new LandingPageLocator();

   //  LandPageStep landPageStep =new LandPageStep();

    public String uiText ;

    // commonLogic.setTitle(titleName);
   public String titleName = commonLogic.gettingTitle();

   public String getTitlename;



    public void auditFill(String confiedntial) throws InterruptedException {

       //commonLogic.setTitle(commonLogic.getTitle());

        enterText(auditlocator.title);
        commonLogic.setTitle(getTitlename);
        commonLogic.setName(driver.findElement(By.xpath(auditlocator.title)).getAttribute("value"));
        uiText=commonLogic.getName();
        commonLogic.writeFile(uiText);
        if(confiedntial.isEmpty()){
        clickRadioButton(auditlocator.confidential);}else {clickRadioButton(auditlocator.confidentialYes);}
        callTypeFunction();
        callPriority();
        mulClickDropdown(auditlocator.relRegion);
        mulClickDropdown(auditlocator.relRegion);
        clickRadioButton(auditlocator.group_Risk);
        clickObject(auditlocator.addRiskThem);
        singleClickdown(auditlocator.selectThem);
        enterNo(auditlocator.budget);
        enterTextarea(auditlocator.objective);
        keyPeople();
      //  auditScope();
        impactedDivisions();
        insertDate();

    }

    public void verifyconfirdential(){

        loginStep.isVisible(landingPageLocator.confidentilaIcon);
    }


    public void searchAudit(){
        driver.findElement(By.xpath(landingPageLocator.searchAudit)).sendKeys(commonLogic.readFile());
        waitStep.click();
        waitStep.driverwait5();
    }

    public void searchAuditName(String name){

        driver.findElement(By.xpath(landingPageLocator.searchAudit)).sendKeys(name);
        waitStep.click();
        waitStep.driverwait5();
    }


    public void keyPeople() throws InterruptedException {
        searchAndEnterWithData(auditlocator.accountChiefAudit,expectedDataClass.chiefAudit);
        searchAndEnterWithData(auditlocator.resHeadAudit,expectedDataClass.headAudit);
        clickRadioButton(auditlocator.addMySlef);
        searchAndSelect(auditlocator.chiefAuditorLead);
        searchAndSelect(auditlocator.headOfAudit);
    }
    public void auditScope(){
        clickObject(auditlocator.auditScope);
        enterText(auditlocator.auditScopeTitle);
        enterTextarea(auditlocator.auditScopeDescribe);
    }
    public void impactedDivisions(){
        clickObject(auditlocator.addDivision);
        searchAndSelect(auditlocator.division);
        //  mulClickDropdown(auditlocator.subDivision);
    }
    public void insertDate(){
        List<WebElement> elementDate =driver.findElements(By.xpath(auditlocator.scheduleStDate));
        int count =2;

        for(int i=0;i<elementDate.size()-3;i++) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime localDateTime = LocalDateTime.now().plusDays(count);
            String date = dateTimeFormatter.format(localDateTime);//.toString();
            elementDate.get(i).sendKeys(date);
            count +=2;


        }
    }
    public void callPriority(){
        singleClickdownLessdata(auditlocator.dropPriority);
        priortyType(uiText);
    }
    public void priortyType(String getText){
        String text =driver.findElement(By.xpath("(//span[contains(@id,\"_selectedChoice\")])[5]")).getText();
        System.out.println(text);
        if(text.contains("Regulatory")){
            searchAndSelect(auditlocator.regultors);
        }else{
            enterNo(auditlocator.noOfReport);
        }
    }
    public void callTypeFunction() throws InterruptedException {
        singleClickdown(auditlocator.dropType);
        callsubmethod(index9);

    }
    public void callsubmethod(int count) throws InterruptedException {
        String text = driver.findElement(By.xpath("(//div[contains(@id,\"_value\") and @role='listbox']//child::span)[13]")).getText();
        System.out.println(text);
        if(text.contains("Standalone Action Verification")){
            searchAndEnter(auditlocator.nonAssuranceWorkPckg);
        } else if (text.contains("Assurance Work Package")) {
            singleClickdownLessdata(auditlocator.assureancePackage);
        } else if (text.contains("Continuous Risk Monitoring")) {
            searchAndEnter(auditlocator.nonAssuranceWorkPckg);
        } else if (text.contains("Special Review")) {
            singleClickdownLessdata(auditlocator.auditReason);
        }

    }
    public void searchAndEnterWithData(String path, String Data)  {
        if(driver.findElement(By.xpath(path)).isDisplayed()){
            WebElement searchAndEnter = driver.findElement(By.xpath(path));
            passData(searchAndEnter,Data);
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        }
    }

    public void passData(WebElement element ,String Data )  {
        char[] dataArray = new char[Data.length()];
        for (int i = 0; i < Data.length(); i++) {
            dataArray[i] = Data.charAt(i);
        }
        for (char c : dataArray) {
            element.sendKeys(Character.toString(c));
            waitStep.driverwait2();
        }
        waitStep.driverwait2();
        WebElement element1 =  driver.findElement(By.xpath(".//div/ul[contains(@id,'_suggestions')]/li[1]"));
        waitStep.driverwait2();
        element1.click();
    }

    public void searchAndEnter(String path) throws InterruptedException {
        if(driver.findElement(By.xpath(path)).isDisplayed()){
            WebElement searchAndEnter = driver.findElement(By.xpath(path));
            passData(searchAndEnter, "a");
        }
    }

    public void searchAndSelect(String path){
        if(driver.findElement(By.xpath(path)).isDisplayed()) {
            WebElement searchAndSelcect = driver.findElement(By.xpath(path));
            searchAndSelcect.click();
            for(int i =0;i<=index9;i++){
                searchAndSelcect.sendKeys(Keys.ARROW_DOWN);
            }
            searchAndSelcect.sendKeys(Keys.ENTER);
        }
    }


    public void enterTextarea(String path){
        if(driver.findElement(By.xpath(path)).isDisplayed()) {
            WebElement textArea = driver.findElement(By.xpath(path));
            textArea.sendKeys(commonLogic.readFile());
        }
    }

    public void enterText(String title) {
        if(driver.findElement(By.xpath(title)).isDisplayed()) {
            WebElement enterText = driver.findElement(By.xpath(title));
                enterText.sendKeys(titleName);
           getTitlename=enterText.getAttribute("value");

        }

    }

    public void enterTextDate(String date ,int count){
driver.findElement(By.xpath(date)).sendKeys(commonLogic.getCurrentDate(count));
    }
    public void enterNo(String title) {
        if(driver.findElement(By.xpath(title)).isDisplayed()){
            WebElement enterText= driver.findElement(By.xpath(title));
            String data = Integer.toString(index9);
           enterText.sendKeys(data);
        }

    }

    public void clickRadioButton(String singleSelect){
        if(driver.findElement(By.xpath(singleSelect)).isDisplayed()){
            WebElement drop= driver.findElement(By.xpath(singleSelect));
            drop.click();
        }
    }
    public void singleClickdown(String singleSelect) {
        WebElement drop = null;
        if (driver.findElement(By.xpath(singleSelect)).isDisplayed()) {
            drop = driver.findElement(By.xpath(singleSelect));
            drop.click();
            for (int i = 1; i <= index9; i++) {
                drop.sendKeys(Keys.ARROW_DOWN);
            }
            drop.sendKeys(Keys.ENTER);
        }

    }

    public void singleClickdownLessdata(String singleSelect){
        if(driver.findElement(By.xpath(singleSelect)).isDisplayed()){
            WebElement drop= driver.findElement(By.xpath(singleSelect));

            drop.click();
            for (int i = 1; i <= index4; i++) {
                drop.sendKeys(Keys.ARROW_DOWN);
            }
            drop.sendKeys(Keys.ENTER);
            uiText = drop.getText();
        }

    }



    public void mulClickDropdown(String multiSelect){
        if( driver.findElement(By.xpath(multiSelect)).isDisplayed()){
            WebElement drop= driver.findElement(By.xpath(multiSelect));
            //if(drop.isDisplayed()) {
            drop.click();
            for (int i = 1; i <= index4; i++) {
                drop.sendKeys(Keys.ARROW_DOWN);
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                drop.sendKeys(Keys.ENTER);
            }
        }
    }

    public void clickObject(String path){
        WebElement clickObject = driver.findElement(By.xpath(path));
        clickObject.click();

    }

}
