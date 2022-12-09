package com.step.steps;

import com.ExpectedData.ExpectedDataClass;
import com.Steps.Definitions.AbstractStepDef;
import com.locator.Auditlocator;
import com.locator.CommonLogic;
import com.locator.CreatControlLocator;
import com.locator.LandingPageLocator;
import io.cucumber.java.bs.A;
import lombok.extern.log4j.Log4j;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.step.steps.Log4jPrint;
@Log4j
public class LandPageStep extends AbstractStepDef {
    // Logger log = LogManager.getLogger(LandPageStep.class.getName());
    LandingPageLocator landingPageLocator= new LandingPageLocator();
    LoggerFile logger =new LoggerFile() ;
    CommonLogic commonLogic =new CommonLogic();
    WaitStep waitStep= new WaitStep();
    WebDriver driver = getDrivr();

    SoftAssert softAssert = new SoftAssert();
    ExpectedDataClass expectedDataClass=new ExpectedDataClass();
    AuditStep auditStep= new AuditStep();

    CreatControlLocator creatControlLocator =new CreatControlLocator();

    Auditlocator auditlocator=new Auditlocator();

       String OT ="Create Outcome Test";
    public void verifyAndValidate()   {

        isPresent(landingPageLocator.name,"Name");
        isPresent(landingPageLocator.sDate,"Start Date ");
        isPresent(landingPageLocator.type,"Type");
        isPresent(landingPageLocator.aphase,"Audit Phase");
        isPresent(landingPageLocator.status,"Status");
        isPresent(landingPageLocator.keyStaf,"Key Staff");
        isPresent(landingPageLocator.budget,"Budget");
        getScreenresult("My Audit");

    }



    public void selectSearchAudit(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        driver.findElement(By.xpath(landingPageLocator.testdata)).click();


    }

    public void fillDET(){
        auditStep.enterText(auditlocator.title);
        fillOET_DET();
        reminderSave();
    }
    public void fillDETException(){
        auditStep.enterText(auditlocator.title);
        //fillOET_DET();
        reminderSave();
    }

    public void fillOET_DET(){
        waitStep.clickButton("Add Test Step");
        auditStep.searchAndEnterWithData(auditlocator.DETTitle,"Satheesh");
        auditStep.enterTextarea(auditlocator.DETDescription);
        auditStep.enterTextarea(auditlocator.DETWorkPermited);
        // uploadDoc(auditlocator.DETUpload,auditlocator.DETfilePath);
    }

    public void fillOT(){
        waitStep.clickButton("Add Test Step");
        auditStep.searchAndEnterWithData(auditlocator.DETTitle,"Satheesh");
        auditStep.enterTextarea(auditlocator.OTDescription);
        auditStep.enterTextarea(auditlocator.DETWorkPermited);
        // uploadDoc(auditlocator.DETUpload,auditlocator.DETfilePath);
    }
    public void  reminderSave(){
        waitStep.clickButton("Save");
        click(auditlocator.DETReminderSave);
        waitStep.driverwait5();
    }
    /*
     *method for DET Submit Application
     */
    public void submitDET(){
        auditStep.clickRadioButton(auditlocator.DETEffective);
        auditStep.enterTextarea(auditlocator.DETAssessment);
        waitStep.clickButton("Submit for Review");
        click(auditlocator.DETRemSubmit);
        waitStep.driverwait5();
    }
    public void saveDET_OET(){
        auditStep.clickRadioButton(auditlocator.DETEffective);
        auditStep.enterTextarea(auditlocator.DETAssessment);
        waitStep.clickButton("Save");
        click(auditlocator.DETReminderSave);
        waitStep.driverwait5();
    }

    public void saveDETforException(){
        auditStep.clickRadioButton(auditlocator.DETNotEffective);
        auditStep.clickRadioButton(creatControlLocator.creatOTTESTYes);
        waitStep.waitPageload();
        auditStep.clickRadioButton(creatControlLocator.exceptionSaveNow);
        auditStep.enterTextarea(auditlocator.DETAssessment);
        waitStep.clickButton("Save");
        click(auditlocator.DETReminderSave);
        waitStep.driverwait5();
        auditStep.enterText(creatControlLocator.title);
        waitStep.clickButton("Save");
        click(auditlocator.DETReminderSave);

    }

    public void saveDETforExceptionL2(){
        auditStep.clickRadioButton(auditlocator.DETNotEffective);
        waitStep.waitPageload();
        auditStep.clickRadioButton(creatControlLocator.exceptionSaveNow);
        auditStep.enterTextarea(auditlocator.DETAssessment);
        waitStep.clickButton("Save");
        click(auditlocator.DETReminderSave);
        waitStep.driverwait5();


    }

    /*
     *method for OET Application
     */
    public void  fillOET(){
        auditStep.enterText(auditlocator.OETTile);
        auditStep.enterTextDate(auditlocator.OETPopulationSDate, 0);
        auditStep.enterTextDate(auditlocator.OETPopulationEDate,4);
        auditStep.enterNo(auditlocator.OETSampleSize);
        auditStep.enterText(auditlocator.OETSampleSelectionMethod);
        auditStep.enterTextarea(auditlocator.OETRationaleforSizeandSelection);
        auditStep.enterText(auditlocator.OETPopulationsource);
        auditStep.enterNo(auditlocator.OETPopulationSize);
        fillOET_DET();
        auditStep.enterTextarea(auditlocator.OETTextArea);
        reminderSave();
        waitStep.pageLoadWait();
    }


    public void verifyTheDetails()  {
        isPresent(landingPageLocator.summary,expectedDataClass.summary);
        isPresent(landingPageLocator.rAndControls,expectedDataClass.rAndControls);
        isPresent(landingPageLocator.bandStaff,expectedDataClass.bandStaff);
        isPresent(landingPageLocator.projectMan,expectedDataClass.projectMan);
        isPresent(landingPageLocator.fAndStrategy,expectedDataClass.fAndStrategy);
        isPresent(landingPageLocator.tollgate,expectedDataClass.tollgate);
        isPresent(landingPageLocator.audotProgram,expectedDataClass.audotProgram);
        isPresent(landingPageLocator.verification,expectedDataClass.verification);
        isPresent(landingPageLocator.expections,expectedDataClass.expections);
        isPresent(landingPageLocator.issues,expectedDataClass.issues);
        isPresent(landingPageLocator.docAndStake,expectedDataClass.docAndStake);
        isPresent(landingPageLocator.auditProgress,expectedDataClass.auditProgress);
        isPresent(landingPageLocator.activityHistory,expectedDataClass.activityHistory);
        isPresent(landingPageLocator.relatedAction,expectedDataClass.relatedAction);
        getScreenresult("Menu bar");
    }

    public  void validateIssues(){
        verifyIssues();
        click(landingPageLocator.disposedIssues);
        verifyDissposalIssue();
    }
    public void verifyIssues(){
        isPresent(landingPageLocator.issTitle);
        isPresent(landingPageLocator.issStatus);
        isPresent(landingPageLocator.issRelException);
        isPresent(landingPageLocator.issOwner);
        isPresent(landingPageLocator.issRating);
        isPresent(landingPageLocator.issDueDate);
        isPresent(landingPageLocator.issViewAction);
    }
    public void verifyDissposalIssue(){
        isPresent(landingPageLocator.issDisTitle);
        isPresent(landingPageLocator.issDisStatus);
        isPresent(landingPageLocator.issDisRelException);
        isPresent(landingPageLocator.issDisOwners);
        isPresent(landingPageLocator.issDisRating);
        isPresent(landingPageLocator.issDissDueDate);
        isPresent(landingPageLocator.issDisViewActions);
    }
    public void validateExceptions(){
        verifyExceptions();
        click(landingPageLocator.DisposedException);
        verifyDisposalException();
    }
public void verifyExceptions(){
    isPresent(landingPageLocator.ExpTitle);
    isPresent(landingPageLocator.ExpSataus);
    isPresent(landingPageLocator.ExpRewStatus);
    isPresent(landingPageLocator.ExpRaisedFrom);
    isPresent(landingPageLocator.ExpRealtedIssue);
    isPresent(landingPageLocator.ExpDesctiption);
}
public void verifyDisposalException(){
    isPresent(landingPageLocator.DisTitle);
    isPresent(landingPageLocator.DisStatus);
    isPresent(landingPageLocator.DisRevStataus);
    isPresent(landingPageLocator.DisRaisedFrom);
    isPresent(landingPageLocator.DisRelatedIssues);
    isPresent(landingPageLocator.DisDiscription);
}

    /**
     * @authour Satheesh
     * @param name
     * summaryValidation
     */
    public void validateSummary(String name){
        //driver.findElement(By.xpath(landingPageLocator.sStatus)).click();
        isPresent(landingPageLocator.sStatus,expectedDataClass.sStatus);
        isPresent(landingPageLocator.annualPlan,expectedDataClass.annualPlan);
        isPresent(landingPageLocator.SDate,expectedDataClass.sDate);
        isPresent(landingPageLocator.Rdate,expectedDataClass.Rdate);
        isPresent(landingPageLocator.sType,expectedDataClass.sType);
        isPresent(landingPageLocator.priority,expectedDataClass.priority);
        takeSnapShot(name);
    }

    /**
     * @authour Satheesh
     * @param risklevel
     * risk manage methos user click the rsik value
     */
    public void riskLevel(String risklevel){
        String path ="//span[contains(text(),' Risk Assessment Units')]//following::table//following::div//following::p";
        String image ="//span[contains(text(),' Risk Assessment Units')]//following::table//following::div//following::p/a";
        String name ="//span[contains(text(),'Chief Auditors')]//following::div[@class='FieldLayout---input_below']//following::tbody/tr/td/div/p[text()[normalize-space() = '"+risklevel+"']]/a";
        List<WebElement> riskleve =driver.findElements(By.xpath(name));
        List<WebElement> riskleveimage =driver.findElements(By.xpath(image));

        for(int i=0;i<riskleve.size();i++){
            riskleve.get(i).click();
            waitStep.clickWait();
            i=riskleve.size();
        }
    }

    public void  leve2RowClick(){
        String pathL2 ="(//div/div/table/tbody/tr[1])[2]";
        driver.findElement(By.xpath(creatControlLocator.risk1Table)).click();
        waitStep.waitPage("2");
    }

    public void  leve2RiskClick(){
        driver.findElement(By.xpath(creatControlLocator.selectL2data)).click();
        waitStep.waitPage("2");
    }
    public void ifileNewControlAtL2(){
        auditStep.enterText(creatControlLocator.title);
        auditStep.clickRadioButton(creatControlLocator.preventiveate);
        auditStep.enterTextarea(creatControlLocator.controlDescription);
        fillControl();
    }

    public void fillControl(){
        auditStep.enterTextarea(creatControlLocator.objective);
        singleSelect(3,creatControlLocator.controlType);
        singleSelect(4,creatControlLocator.frequency);
        singleSelect(3,creatControlLocator.levelofAutomation);
        multiselect(7,creatControlLocator.materialLegalEntity,"Material LegalEntity");
        multiselect(7,creatControlLocator.controlSupport,"ControlProgram Support");
        waitStep.clickButton("Save");
    }
    public void clickTheTable(){
        click(creatControlLocator.risk1Table);
        waitStep.waitSec(2);
        click(creatControlLocator.selectL2data);
        waitStep.waitSec(2);
        click(creatControlLocator.selectL3data);
        waitStep.waitSec(2);
        creatcontrol1();
    }

    public void clickTableSelction(){
        click(creatControlLocator.risk1Table);
        waitStep.waitSec(2);
        click(creatControlLocator.selectL2data);
        waitStep.waitSec(2);
        click(creatControlLocator.selectL3data);
        waitStep.waitSec(2);
    }
    public void fillDETForm(){
        waitStep.pageWait();
        click(creatControlLocator.level3Task);
    }
    public void fillDETFormL2(){
        waitStep.pageWait();
        click(creatControlLocator.level2Task);
    }

    public void Leve3Application(){

        // click(creatControlLocator.selectL2data);
        waitStep.driverwait5();
        waitStep.clickButton("Create L3 Risk ");
        auditStep.enterText(creatControlLocator.title);
        auditStep.enterTextarea(creatControlLocator.Description);
        waitStep.clickButton("Save");
        waitStep.driverwait5();
        creatcontrol();

    }


    public void creatcontrol1() {
        //click(creatControlLocator.selectL3data);
        clickButton("Create Control");
        auditStep.enterText(creatControlLocator.title);
        waitStep.clickButton("Save");
        waitStep.waitPageload();
    }

    public void creatcontrol() {
       click(creatControlLocator.selectL3data);
        clickButton("Create Control");
        auditStep.enterText(creatControlLocator.title);
        waitStep.clickButton("Save");
        waitStep.waitPageload();
    }

    public void fillOTform(){
        String button="//h4[text()='Reminder']//following::button[text()='Submit for Review']";
        waitStep.waitPageload();
        waitStep.clickButton(OT);
        auditStep.enterText(creatControlLocator.title);
        fillOT();
        waitStep.clickButton("Submit for Review");
        click(button);
        waitStep.pageLoadWait();
    }
    public void fillOTformSave(){
        String button="//h4[text()='Reminder']//following::button[text()='Save']";
        waitStep.waitPageload();
        waitStep.clickButton(OT);
        auditStep.enterText(creatControlLocator.title);
        fillOT();
        getScreenresult(OT);
        waitStep.clickButton("Save");
        click(button);
        waitStep.pageLoadWait();

    }
    public void fillOTformwithException(){
        String button="//h4[text()='Reminder']//following::button[text()='Save']";
        waitStep.waitPageload();
        waitStep.clickButton(OT);
        auditStep.enterText(creatControlLocator.title);
        fillOT();
        waitStep.clickButton("Save");
        click(button);
        waitStep.waitPageload();
        click(creatControlLocator.menuOTIcon);
        click(creatControlLocator.menuOT);
        waitStep.waitPageload();
        OTsave();

    }

    public void OTsave(){
        String button="//h4[text()='Reminder']//following::button[text()='Save']";
        auditStep.clickRadioButton(creatControlLocator.creatExceFrmeOTYes);
        waitStep.waitPageload();
        auditStep.clickRadioButton(creatControlLocator.exceptionSaveNow);
        waitStep.clickButton("Save");
        click(button);
        waitStep.buttonClickWait();
    }

    public void clickButton(String Button){
        String path = "(//button[contains(text(),'Create Control')])[2]";
        driver.findElement(By.xpath(path)).click();
        driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
        waitStep.buttonClickWait();
    }

    public void click(String row){
        driver.findElement(By.xpath(row)).click();
        waitStep.pageWait();
    }

    public void singleSelect(int N ,String path){
        WebElement drop  = driver.findElement(By.xpath(path));
        drop.click();
        for (int i = 1; i <= N; i++) {
            drop.sendKeys(Keys.ARROW_DOWN);
        }
        drop.sendKeys(Keys.ENTER);
    }

    public void multiselect(){
        String multiSelect="//span[@data-placeholder='--- Select one or more Level 2 Risk ---']";

        driver.findElement(By.xpath(multiSelect)).click();
        dropdownList();


    }
    public void dropdownList(){
        List<WebElement> data = driver.findElements(By.xpath(auditlocator.dropTableIndex));
       // WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        WebElement elemetClick =driver.findElement(By.xpath("//div/div/table/tbody/tr/td[2]/div/p"));
        int size = data.size()/2;
        if(size>1){
            for(int i =0;i<=size;i++){

            }
           data.get(commonLogic.randomNumber(size)).click();
            elemetClick.click();

        }else{
            data.get(1).click();
        }

    }

    public void dropdownListMulti(int n) {
        List<WebElement> data = driver.findElements(By.xpath(auditlocator.dropTableIndex));
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        //  WebElement elemetClick = driver.findElement(By.xpath("//div/div/table/tbody/tr/td[2]/div/p"));
        int size = data.size() / 2;
        if (size > 1) {
            for (int i = 0; i <= n; i++) {
                element.sendKeys(Keys.ARROW_DOWN);

                data.get(i).click();
            }
        } else {
            element.sendKeys(Keys.ARROW_DOWN);
            data.get(1).click();

        }
    }
    public void multiselect(int N,String data,String information){
        String multiSelect="";
        if( driver.findElement(By.xpath(data)).isDisplayed()){
            WebElement drop= driver.findElement(By.xpath(data));
            drop.click();
            takeSnapShot(information);
            dropdownListMulti(N);

        }

    }


    public void validateAuditProgram(String name){
        takeSnapShot(name);
    }

    public void isPresent(String Locator){
        WebElement element = driver.findElement(By.xpath(Locator));
        try {
            Assert.assertTrue(element.isDisplayed());
            logger.error("Element is  Available in UI");
            waitStep.clickWait();
        }catch (Exception e){
            e.printStackTrace();
            logger.error("Element is Not  Available in UI");
            //System.out.println("not assert ture");
        }
    }
    public void isPresent(String Locator, String expected){
        String actual =driver.findElement(By.xpath(Locator)).getText();
        if(actual.equalsIgnoreCase(expected)) {
            Assert.assertEquals(actual,expected);
logger.info(expected+"UI is Availabel in Page");
        }else{
logger.error(expected+ "UI is not availabel ");
        }

    }

    public  void takeSnapShot(String name) {
        try {
            String fileWithPath = System.getProperty("user.dir") + "\\src\\test\\resources\\Section\\" + name + ".jpg";
            TakesScreenshot scrShot = ((TakesScreenshot) webDriver);
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile = new File(fileWithPath);
            FileUtils.copyFile(SrcFile, DestFile);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getScreenresult(String name)  {
        try {
            String path =System.getProperty("user.dir") + "\\src\\test\\resources\\OutPutImage\\" + name + ".jpg";
            Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(), "jpg", new File(System.getProperty("user.dir") + "\\src\\test\\resources\\OutPutImage\\" + name + ".jpg"));
logger.info("Image  Stored in Path");
        }catch(IOException e){
            e.printStackTrace();

        }
    }


}
