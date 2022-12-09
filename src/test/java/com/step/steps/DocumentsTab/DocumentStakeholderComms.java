package com.step.steps.DocumentsTab;

import com.Steps.Definitions.AbstractStepDef;
import com.locator.*;
import com.step.steps.*;
import org.openqa.selenium.*;
import org.openqa.selenium.print.PrintOptions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DocumentStakeholderComms extends AbstractStepDef {
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
    DocumentandSytackholders docstoc= new DocumentandSytackholders();
    public void clickLinktoPrint(String link){
        driver.findElement(By.xpath(link)).click();
    }

    public void click(String link){
        driver.findElement(By.xpath(link)).click();
    }


    public void newWindowInformation(){
        switchWindow();
        waitStep.waitPageload();
        closewindow();
    }


    String mainWindow = driver.getWindowHandle();
    public void switchWindow(){
        Set<String>childWindow =driver.getWindowHandles();
        Iterator<String> listOfChid =childWindow.iterator();
        while(listOfChid.hasNext()){
            String nextWindow = listOfChid.next();
            if(!mainWindow.equalsIgnoreCase(nextWindow)){
                driver.switchTo().window(nextWindow);
                waitStep.waitPageload();
                landPageStep.getScreenresult("Generated Print");
                logger.info("Driver focuse ond "+ nextWindow);
            }
        }
    }
    public void closewindow(){
        driver.close();
    }
    public void switchMainWindow(){
        driver.switchTo().window(mainWindow);
        logger.info("MainWindow switched");
    }
    public boolean visible(String locator){
        boolean visible = false;
        try{
            visible =driver.findElement(By.xpath(locator)).isDisplayed();
        }catch (Exception e){
            logger.info("Element  is not visible");
        }

        return visible;
    }

public void menuButton(String locator){
        driver.findElement(By.xpath(locator)).click();
        //And I click the "Update Control" menu

}

    public void rowButtonClick(String click){
        clickLinktoPrint(click);
        waitStep.buttonClickWait();
    }
public void printPDFRobot(){
       waitStep.buttonClickWait();
        click(docstoc.printButton);


}

public void printSheet(){
  //          driver.switchTo().alert().accept();
        try {
        Robot robot = new Robot();
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(3000);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }catch (Exception e){
        logger.info("enter operation is not work");
    }
}

public void verifyMRCCrating(){
    elementPresent(docstoc.OpninRating);
    elementPresent(docstoc.RemediationPeriod);
    elementPresent(docstoc.deliveryRiskRating);

}
public void elementPresent(String locator){
        try {
           boolean isPresent= driver.findElement(By.xpath(locator)).isDisplayed();
           logger.info(isPresent + "fsddgdhdfhdgfdgdfdgdfgf");
            if (isPresent) {
                logger.info("element is avialbel ******");
            }else{
                logger.info("element is not avialbel");
            }
        }catch (Exception e){

        }
}

public void clickMenu(String button,String IconData){
        String path="//p/strong/a[contains(text(),'"+button+"')]//following::div/div/button";
        menuButton(path);
        myTaskStep.clickmenuData(IconData);
}

public void FillAuitReport(){
        auditStep.enterTextarea(docstoc.executiveSummary);
        click(docstoc.OpninRating);
        auditStep.enterTextDate(docstoc.RemediationPerioddate,2);
}
    public void printScreen(String print, String parant){
        String locator="//Strong/a[contains(text(),'"+parant+"')]//following::Strong/a/span[contains(text(),'"+print+"')]";
        clickLinktoPrint(locator);
        newWindowInformation();
    }

    public void multidropValu(String path){
        String relCategory = "//div/span[contains(text(),'"+path+"')]//following::div[@class='MultipleDropdownWidget---dropdown_value']";
       myTaskStep.multiClickdown(relCategory);
    }
    public void filltextarea(String textarea){
         String objective = "//div/label[contains(text(),'"+textarea+"')]//following::textarea";
      auditStep.enterTextarea(objective);
    }
    public void filltextareabox(String textarea){
        String objective = "//div/label[text()='"+textarea+"']//following::textarea";
        auditStep.enterTextarea(objective);
    }
    public void clickRadioOption(String option){
        String Option="//label[contains(text(),'"+option+"')]";
        auditStep.clickRadioButton(Option);
    }
    public void multiDropSelect(String Question,String value){
        String path="//*[text()=' MY AUDITS']//following::span[text()='"+Question+"']//following::span[@class='MultipleDropdownWidget---value_display']";
        click(path);
        List<WebElement> droplist = driver.findElements(By.xpath(auditlocator.dropTableIndex));
        for (int i =0;i<droplist.size();i++){
            String info =droplist.get(i).getText();
            if(value.equalsIgnoreCase(info)) {
                droplist.get(i).click();
                i=droplist.size();
            }
        }


    }

    public void stausValidation(String status, String info){
        String planStaus="//strong[text()='"+status+"']";
        String planInfo="//strong[text()='"+info+"']";
        try{
            driver.findElement(By.xpath(planInfo)).isDisplayed();
            logger.info("Status is Dispalyed");
        }catch (Exception e){
            logger.info("Status is not in  ---> "+ info);
        }
    }

    public void clickLabel(String label){
        String locator ="//span[contains(text(),'Select relevant details')]//following::label[contains(text(),'"+label +"')]";
        click(locator);
    }
    public void  clickSection(String section){
        String sectionList ="//span[contains(text(),'"+section+"')]";
        click(sectionList);
    }
public void enterField(String data){
        String feildData ="//div/span[contains(text(),'"+data+"')]//following::div/input";
        auditStep.searchAndEnter(feildData);
}
public void fillTabel(){
        click(docstoc.addchangeProgram);
        List<WebElement> tablelist =driver.findElements(By.xpath(docstoc.tabeldata));
        for(int i=0;i<tablelist.size();i++){
            tablelist.get(i).sendKeys(commonLogic.readOET());
        }
}
    public void adminDivision(){
        landPageStep.click(docstoc.division);
        boolean visiblity =visible(docstoc.rowButton);
        if(visiblity){
            rowButtonClick(docstoc.rowButton);
            auditStep.clickObject(docstoc.addTeamMeber);
            auditStep.searchAndEnterWithData(docstoc.addUser,"Satheesh");
            auditStep.enterTextDate(docstoc.addStartDate,0);

            auditStep.enterTextDate(docstoc.addendDate,4);
            waitStep.clickButton("Save");
            landPageStep.getScreenresult("Division");
            rowButtonClick(docstoc.rowButton);
            clickLinktoPrint(docstoc.removeBtn);
            waitStep.clickButton("Save");
        }else {
            logger.info("element is not Visibel");
        }

    }


    //nams172
    public void fillMPMform(){
        auditStep.clickRadioButton(docstoc.APMStatusFinal);
        auditStep.enterTextarea(docstoc.APMApproach);
        auditStep.clickRadioButton(docstoc.grpriskthemYes);
        auditStep.enterTextarea(docstoc.riskThemCoverageSummary);
        auditStep.enterTextarea(docstoc.PIAOverrideRationale);
        auditStep.enterTextarea(docstoc.skillsAndPeople);
        auditStep.clickRadioButton(docstoc.concurringReview);
        auditStep.searchAndEnter(docstoc.enagaementConcurring);
        auditStep.enterTextarea(docstoc.reviewerAssessmentrational);
        click(docstoc.addauditRecipient);
        auditStep.searchAndEnter(docstoc.addEmp);
        auditStep.clickRadioButton(docstoc.reterospectiveRivew);
        auditStep.clickRadioButton(docstoc.addpriorAuditCoverage);
        List<WebElement>text = driver.findElements(By.xpath(docstoc.workOthers));
        for(int i=0;i<text.size();i++){
            text.get(i).sendKeys(commonLogic.readOET());
        }
//  waitStep.fileUpload(docstoc.fileInput,docstoc.filePath);
    }
    public void fileupload(){
        waitStep.fileUpload(docstoc.fileInput,docstoc.filePath);
    }

    public void getCapture(String path, String name){
        String locatorpath="//p/a[contains(text(),'"+path+"')]";
        click(locatorpath);
        landPageStep.getScreenresult(name);
    }
    public void fillEmployeeDetails(){
        click(docstoc.additonalEmployee);
        auditStep.searchAndEnterWithData(docstoc.searchemployee,"Satheesh");
    }


    public void clickLiveYear(String year){
        String Year ="//strong[text()='"+year+"']";
        click(Year);
    }
    public void radioGroupVisible(){
        String path ="//*[contains(@class,'CheckboxGroup')]";
        try{
            boolean visible=driver.findElement(By.xpath(path)).isDisplayed();
            if(visible){
                logger.info("Radio option Avilabel *****");
            }
        }catch (Exception e){
            logger.info("Radio Checbox not Avilbel ****");
        }
    }


}
