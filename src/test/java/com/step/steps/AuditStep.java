package com.step.steps;

import com.ExpectedData.ExpectedDataClass;
import com.Steps.Definitions.AbstractStepDef;
import com.locator.Auditlocator;
import com.locator.CommonLogic;
import com.locator.LandingPageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class AuditStep extends AbstractStepDef {

    WebDriver driver = getDrivr();
    LoggerFile logger =new LoggerFile() ;
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

    public void belowPriority(){

    }

    public void fillDate(){
        insertDate();
       // HasMap<String, Integer> demo = new HashMap<String, Integer>();
    }

    public void auditFillWithoutDate() throws InterruptedException {
        enterText(auditlocator.title);
        commonLogic.setTitle(getTitlename);
        commonLogic.setName(driver.findElement(By.xpath(auditlocator.title)).getAttribute("value"));
        uiText=commonLogic.getName();
        commonLogic.writeFile(uiText);
        clickRadioButton(auditlocator.confidential);
        callTypeFunctionPriority();
        callPriority();
        mulClickDropdown(auditlocator.relRegion);
        mulClickDropdown(auditlocator.relRegion);
        clickRadioButton(auditlocator.group_Risk);
        clickObject(auditlocator.addRiskThem);
        fillMRCCReiview();
        singleClickdown(auditlocator.selectThem);
        enterNo(auditlocator.budget);
        enterTextarea(auditlocator.objective);
        keyPeople();
        impactedDivisions();
    }

    public void auditFillWithoutDate(String type) throws InterruptedException {
        enterText(auditlocator.title);
        commonLogic.setTitle(getTitlename);
        commonLogic.setName(driver.findElement(By.xpath(auditlocator.title)).getAttribute("value"));
        uiText=commonLogic.getName();
        commonLogic.writeFile(uiText);
        clickRadioButton(auditlocator.confidential);
        callTypeFunctionPriority(type);
        callPriority();
        mulClickDropdown(auditlocator.relRegion);
        mulClickDropdown(auditlocator.relRegion);
        clickRadioButton(auditlocator.group_Risk);
        clickObject(auditlocator.addRiskThem);
        if(type.equalsIgnoreCase("Regular Audit")||type.equalsIgnoreCase("Change Audit")){
        fillMRCCReiview();}
        singleClickdown(auditlocator.selectThem);
        enterNo(auditlocator.budget);
        enterTextarea(auditlocator.objective);
        keyPeople();
        impactedDivisions();
    }


    public void verifyconfirdential(){

        loginStep.isVisible(landingPageLocator.confidentilaIcon);
    }

public void fillMRCCReiview(){

        enterText(auditlocator.MRCCReviewsTitle);
        searchAndEnter(auditlocator.MRCCReviesRecipt);
}
    public void searchAudit(){
        driver.findElement(By.xpath(landingPageLocator.searchAudit)).sendKeys(commonLogic.readFile());
        waitStep.click();
        logger.info("Search field prescent and Value is  "+ commonLogic.readFile());
        waitStep.driverwait5();
        waitStep.pageLoadWait();
    }
    public void searchAuditAudit(){
        driver.findElement(By.xpath(landingPageLocator.searchAudit)).sendKeys(commonLogic.readFile());
        waitStep.clickSearch();
        logger.info("Search field prescent and Value is  "+ commonLogic.readFile());
        waitStep.driverwait5();

    }
    public void  clickTableBody(){
        clickObject(auditlocator.MRCCTable);
    }
    public void searchAuditforDasboard(){
        driver.findElement(By.xpath(landingPageLocator.searchAudit)).sendKeys(commonLogic.readOET());
        waitStep.click();
        logger.info("Search field prescent and Value is  "+ commonLogic.readOET());
        waitStep.driverwait5();
    }

    public void searchTasksDashBoard(){
        driver.findElement(By.xpath(landingPageLocator.searchTask)).sendKeys(commonLogic.readOET());
       // commonLogic.writeOET(driver.findElement(By.xpath(landingPageLocator.searchTask)).getAttribute("value"));
        waitStep.clickTask();
        logger.info("Search field prescent and Value is  "+ commonLogic.readOET());
        waitStep.driverwait5();
    }
    /**
     * Authour Satheesh
     * Search Task in My audit
     */

    public void searchTasks(){
        driver.findElement(By.xpath(landingPageLocator.searchTask)).sendKeys(commonLogic.readFile());
        commonLogic.writeOET(driver.findElement(By.xpath(landingPageLocator.searchTask)).getAttribute("value"));
        waitStep.clickTask();
        logger.info("Search field prescent and Value is  "+ commonLogic.readFile());
        waitStep.driverwait5();
    }


    public void searchAuditName(String name){

        driver.findElement(By.xpath(landingPageLocator.searchAudit)).sendKeys(name);
        waitStep.click();
        logger.info("Searched audit name is   "+ name);
        waitStep.driverwait5();
    }


    public void keyPeople() throws InterruptedException {
        searchAndEnterWithData(auditlocator.accountChiefAudit,expectedDataClass.chiefAudit);
        searchAndEnterWithData(auditlocator.resHeadAudit,expectedDataClass.headAudit);
        clickRadioButton(auditlocator.addMySlef);
        searchAndSelect(auditlocator.chiefAuditorLead);
        searchAndSelect(auditlocator.headOfAudit);
    }


    public void changeRecipient(){
        searchAndEnterWithData(auditlocator.MRCCReviesRecipt, "Samantha");
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
        int count =0;

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
    public void callTypeFunctionPriority()   {
        singleClickdownforPriority(auditlocator.dropType, "Regular Audit");
        callsubmethod();

    }
    public void callTypeFunctionPriority(String type)   {
        singleClickdownforPriority(auditlocator.dropType, type);
        callsubmethod();

    }
    public void callTypeFunction()   {
        singleClickdown(auditlocator.dropType);
        callsubmethod();

    }

    public void singleClickdownforPriority(String singleSelect,String Type) {
        WebElement drop = driver.findElement(By.xpath(singleSelect));
            drop.click();
            List<WebElement> droplist = driver.findElements(By.xpath(auditlocator.dropTableIndex));
        for (int i =0;i<droplist.size();i++){
            String value =droplist.get(i).getText();
            if(value.equalsIgnoreCase(Type)) {
                droplist.get(i).click();
                i=droplist.size();
            }
        }
          //  drop.sendKeys(Keys.ENTER);
            logger.info("DropDwon Value Selected");


    }
    public void callsubmethod() {
        String text = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span")).getText();
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
        element.sendKeys(Data); element.sendKeys(" ");
        waitStep.driverwait2();
        WebElement element1 =  driver.findElement(By.xpath(".//div/ul[contains(@id,'_suggestions')]/li[1]"));
        waitStep.driverwait2();
        element1.click();
    }

    public void searchAndEnter(String path)  {
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
        try{
            WebElement element=driver.findElement(By.xpath(path));
         if(element.isDisplayed()) {
            WebElement textArea = driver.findElement(By.xpath(path));
            textArea.sendKeys(commonLogic.readFile());
            logger.info("textarea Information "+ commonLogic.readFile());
        }
        }catch(Exception e){
            logger.info("UI Element not dispalyed");
        }

    }

    public void enterText(String title) {
        if(driver.findElement(By.xpath(title)).isDisplayed()) {
            WebElement enterText = driver.findElement(By.xpath(title));
                enterText.sendKeys(titleName);
           getTitlename=enterText.getAttribute("value");
            logger.info("Enter informtion in n " + titleName);
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
            logger.info("Enter informtion in  " + data);
        }

    }

    public void clickRadioButton(String singleSelect){
        try{
            WebElement element =driver.findElement(By.xpath(singleSelect));
        if(element.isDisplayed()&&element.isEnabled()){
            WebElement drop= driver.findElement(By.xpath(singleSelect));
            drop.click();
            logger.info("Radio button Clicked");
        }
        }catch (Exception e){
            logger.info("element is not active in UI");
        }
    }


    public void singleClickdownType(String singleSelect) {
        WebElement drop = null;
        String text =null;
        if (driver.findElement(By.xpath(singleSelect)).isDisplayed()) {
            drop = driver.findElement(By.xpath(singleSelect));
            drop.click();
         List<WebElement> list=driver.findElements(By.xpath(auditlocator.dropTableIndex));
            for (int i = 1; i <= index9; i++) {
                drop.sendKeys(Keys.ARROW_DOWN);
               // text=list.get(index9).getText();
            }
            drop.sendKeys(Keys.ENTER);
            logger.info("Enter informtion in n " + text+ "and  Information Selected");
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
            logger.info("DropDwon Value Selected");
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
            logger.info("Information Selected");
        }

    }



    public void mulClickDropdown(String multiSelect){
        if( driver.findElement(By.xpath(multiSelect)).isDisplayed()){
            WebElement drop= driver.findElement(By.xpath(multiSelect));
            //if(drop.isDisplayed()) {
            drop.click();
            for (int i = 1; i <= index4; i++) {
                drop.sendKeys(Keys.ARROW_DOWN);
                drop.sendKeys(Keys.ENTER);
            }
            logger.info("Multi dropDown Value Selected");
        }
    }

    public void clickObject(String path){
        WebElement clickObject = driver.findElement(By.xpath(path));
        clickObject.click();
        waitStep.waitPageload();
        logger.info("Element is Clickable");

    }

}
