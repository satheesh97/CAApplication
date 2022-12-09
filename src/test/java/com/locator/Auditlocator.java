package com.locator;

import org.apache.commons.lang3.StringEscapeUtils;

public class Auditlocator {


    public String title = "//div/label[text()='Title']//following::input[@type='text']";

   /*
   teaxtArea
    */

    public String objective = "//div/label[contains(text(),'Objective')]//following::textarea";
    /*
    Radio buttom
     */
    public String confidentialYes = "//div/span[text()='Confidential']//following::div//following::div//following::label[contains(text(),'Yes')]";

    public String confidential = "//div/span[text()='Confidential']//following::div//following::div//following::label[contains(text(),'No')]";
    public String group_Risk = "//div/span[text()='Group Risk Themes applicable?']//following::div//following::label[contains(text(),'Yes')]";
    public String dropType = "//div[contains(text(),'--- Select a Type ---')]";
    public String auditReason = "//div[contains(text(),'--- Select an Audit Reason ---')]";
    public String assureancePackage ="//div[contains(text(),'--- Select an Assurance Work Package Deliverable ---')]";
    public String addMySlef = "//label[normalize-space()='Auditor']";

    /*
    Search And Enter
     */
    public String nonAssuranceWorkPckg =".//div/span[text()='Non-Assurance Work Package']//following::input";

    /*

    multidropDwon
     */
    public String relRegion = "//div/span[contains(text(),'Relevant Regions')]//following::div[@class='MultipleDropdownWidget---dropdown_value']";


    public String dropPriority = "//div[contains(text(),'--- Select a Priority ---')]";
    public String relevantReg = "//span[contains(text(),'--- Select one or more Relevant Regions ---')]";
    public String regultors ="//div/div/div/div/div[4]/div[2]/div[1]/div[2]/div/div";

    public String noOfReport = "//div/label[contains(text(),'reports ')]//following::input[@type='text']";


    public String dropTableIndex = ".//div[contains(@id,'_tetherWrapper')]//li"; //---> need to update random no

    public String accountChiefAudit = "//div/span[contains(text(),'Accountable Chief Auditor')]//following::input";
    public String resHeadAudit = "//div/span[contains(text(),'Responsible Head of Audit / Audit Director')]//following::input";

    public String searchText = "//div/input[@class='TextInput---text TextInput---align_start' and @placeholder='Search']";

    public String addRiskThem="//div/a[text()='Add Group Risk Theme']";
    public String selectThem ="//div[text()='--- Select a Group Risk Theme ---']";
    public String budget ="//tr/td[2]/div/input";
    public String auditScope = "//p/a[text()='Add Audit Scope']";

    public String auditScopeTitle ="//div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]";
    public String DETTitle="//div/span[contains(text(),'Owner')]//following::div/input";
    public String DETfilePath=System.getProperty("user.dir")+"\\src\\test\\resources\\document\\year.text";
    public String DETUpload=".//input[@type='file']";
    public String DETAssessment="//label[contains(text(),'Assessment Conclusion')]//following::textarea";

    public String DETReminderSave="//h4[contains(text(),'Reminder')]//following::button[contains(text(),'Save')]";
    public  String DETRemSubmit="//h4[contains(text(),'Reminder')]//following::button[contains(text(),'Submit for Review')]";
    public String DETEffective ="//span[contains(text(),'Effectiveness')]//following::div/span[text()='Conclusion']//following::div/label[text()='Effective']";
    public String DETNotEffective="//span[contains(text(),'Effectiveness')]//following::div/span[text()='Conclusion']//following::div/label[text()='Not Effective']";

    public String DETDescription="//span[contains(text(),'Description')]//following::div//following::div//following::textarea";
    public String OTDescription="//label[contains(text(),'Description')]//following::textarea";

    public String OETTextArea="//span[contains(text(),'Test Steps')]//following::textarea";
    public String DETWorkPermited ="//div/label[contains(text(),'Work Performed')]//following::div/textarea";

    public String OETTile ="//label[contains(text(),'Title')]//following::div/input";
    public String OETPopulationSDate="//label[contains(text(),'Population Start Date')]//following::div/input";
    public String OETPopulationEDate ="//label[contains(text(),'Population End Date')]//following::div/input";
    public String OETSampleSelectionMethod= "//label[contains(text(),'Sample Selection Method')]//following::div/input";
    public String OETSampleSize="//label[contains(text(),'Sample Size')]//following::div/input";
    public String OETRationaleforSizeandSelection="//label[contains(text(),'Rationale for Size and Selection')]//following::div/textarea";
    public String OETPopulationsource="//label[contains(text(),'Population Source')]//following::div/input";
    public String OETPopulationSize="//label[contains(text(),'Population Size')]//following::div/input";
    public String OETProcedure="//label[contains(text(),'Procedure')]//following::div/textarea";
    public String auditScopeDescribe ="//span[contains(text(),'Audit Scope')]//following::div//following::div//following::textarea";
    public String addDivision = "//div/a[text()='Add a Division']";
    public String division = "//div[contains(text(),'--- Select a Division ---')]";
    public String subDivision = "//span/span[@data-placeholder='--- Please select a subdivision ---']";
    public String chiefAuditorLead="//div[contains(text(),'--- Select a Chief Auditor Lead Area ---')]";
    public String headOfAudit="//div[contains(text(),'--- Select a Head of Audit Lead Area ---')]";

    /*
    date input
     */
    public String scheduleStDate ="//div/label[contains(text(),'Scheduled Start Date')]//following::input";
    public String targetPlanSDate ="//div/label[contains(text(),'Target Planning Start Date')]//following::input";
    public String targetPlanEDate ="//div/label[contains(text(),'Target Planning End Date')]//following::input";
    public String actualPlnSDate ="//div/label[contains(text(),'Actual Planning Start Date')]//following::input";
    public String actualPlnEDate="//div/label[contains(text(),'Actual Planning End Date')]//following::input";
    public String targetFieldSDate ="//div/label[contains(text(),'Target Fieldwork Start Date')]//following::input";
    public String targetFieldEDate ="//div/label[contains(text(),'Target Fieldwork End Date')]//following::input";
    public String actualFieldSDate ="//div/label[contains(text(),'Target Fieldwork End Date')]//following::input";
    public String actualFieldEDate ="//div/label[contains(text(),'Actual Fieldwork End Date')]//following::input";
    public String targetDraftReportDate="//div/label[contains(text(),'Target Draft Report Date')]//following::input";
    public String targetFinalReportDate= "//div/label[contains(text(),'Target Final Report Date')]//following::input";
    public String actualDraftReportDate ="//div/label[contains(text(),'Actual Draft Report Date')]//following::input";
    public String actualFinalReportDate ="//div/label[contains(text(),'Actual Final Report Date')]//following::input";
    public String shudleEndDate= "//div/label[contains(text(),'Scheduled End Date')]//following::input";
    public String targetFinalDate= "//div/label[contains(text(),'Target Finalization Date')]//following::input";
    public String actualFuncationDate ="//div/label[contains(text(),'Actual Finalization Date')]//following::input";
 public String MRCCReviewsTitle ="//span[text()=' MRCC Reviews']//following::table/tbody/tr/td/div/input";
 public String MRCCReviesRecipt="//span[text()=' MRCC Reviews']//following::table/tbody/tr/td/div/div/input";
public String MRCCTable="//p/span/strong/a[contains(text(),'MRCC')]";

public String auditScop="//div/p/a[contains(text(),'Add Audit Scope')]";
public String auditScopeDescription="//label[contains(text(),'Description')]//following::textarea";



}
