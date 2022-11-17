package com.locator;

public class MyTaskLocator {

    public String taskType= "//span[@data-placeholder='Any']";
    public String taskValue ="//input[@placeholder='Search']";
    public String title ="//div/label[contains(text(),'Title')]/following::input";
    public String Description="//div/label[contains(text(),'Description')]/following::textarea";
    public String Status ="//div[contains(text(),'--- Select a Status ---')]";
    public String risk = "//div/span[text()='Risk or Control?']//following::div//following::div//following::label[contains(text(),'Risk')]";
    public String control ="//div/span[text()='Risk or Control?']//following::div//following::div//following::label[contains(text(),'Control')]";
    public String Level3Risk="//div/span[text()='Level 2 or 3 Risk?']//following::div//following::div//following::label[contains(text(),'Level 3 Risk')]";
    public String Level2Risk="//div/span[text()='Level 2 or 3 Risk?']//following::div//following::div//following::label[contains(text(),'Level 2 Risk')]";
    public String Level2Control="//div/span[text()='Level 2 or 3 Control?']//following::div//following::div//following::label[contains(text(),'Level 2')]";
    public String Level3Control="//div/span[text()='Level 2 or 3 Control?']//following::div//following::div//following::label[contains(text(),'Level 3')]";
    public String selectRow="//span[text()='Risk or Control?']//following::tbody/tr";

    public String ActionImplemntedYes="//div/span[text()='Already Implemented?']//following::div//following::div//following::label[contains(text(),'Yes')]";
    public String ActionImplemntedNo="//div/span[text()='Already Implemented?']//following::div//following::div//following::label[contains(text(),'No')]";
    public String selectAvialbelOT ="//span[text()='Available Outcome Tests']//following::tbody/tr/td/div/p/a";
    public String selectViewOption="//span[text()='Issues']//following::tbody/tr/td/div/p/a";

    public String selectAvialbelExp ="//span[text()='Available Exceptions']//following::tbody/tr/td/div/p/a";

    public String dropTableIndex = ".//div[contains(@id,'_tetherWrapper')]//li";
    public  String dropTableIcon=".//div[contains(@id,'_tetherWrapper')]//li/div/span[contains(@class,'primary_text')]";

    public String selectRiskrate="//div[contains(text(),'--- Select a Risk Rating ---')]";
    public String Selectissue="//div[contains(text(),'--- Select an Issue Status ---')]";
    public String issueOwner=".//div/span[text()='Issue Owner(s)']//following::input";
    public String dueDate=".//div/label[text()='Due Date']//following::input";
    public String riskCategory=".//div/span[text()='Risk Category']//following::div/div/div";
    public String issueCause="//div/span[contains(text(),'Issue Cause')]//following::div[@class='MultipleDropdownWidget---dropdown_value']";
    public String groupRiskThem="//div/span[contains(text(),'Group Risk Themes')]//following::div[@class='MultipleDropdownWidget---dropdown_value']";
    public String materialEntities="//div/span[contains(text(),'Material Legal Entities')]//following::div[@class='MultipleDropdownWidget---dropdown_value']";
    public String relavantRegion="//div/span[contains(text(),'Relevant Regions')]//following::div[@class='MultipleDropdownWidget---dropdown_value']";
    public String IATaxonomy ="//span[contains(text(),'Behavioural')]//following::div[contains(text(),'Internal Audit Taxonomy')]";

    public String actionStatus="//div[contains(text(),'--- Select a Value ---')]";

    public String cTRAI="//span[contains(text(),'Control Tests')]//following::thead/tr/th/div[contains(text(),'RAI/CAI')]";
    public  String cTLevel2="//span[contains(text(),'Control Tests')]//following::thead/tr/th/div[contains(text(),'Level 2 Risk')]";

    public String ctLevel3="//span[contains(text(),'Control Tests')]//following::thead/tr/th/div[contains(text(),'Level 3 Risk')]";
    public String ctControlName="//span[contains(text(),'Control Tests')]//following::thead/tr/th/div/span[contains(text(),'Control')]";
    public String ctDET="//span[contains(text(),'Control Tests')]//following::thead/tr/th[@abbr='DET']";
    public String ctOET="//span[contains(text(),'Control Tests')]//following::thead/tr/th/div[contains(text(),'OET')]";
    public String ctExptionAndIssues="//span[contains(text(),'Control Tests')]//following::thead/tr/th/div[contains(text(),'Exceptions and Issues')]";
    public String Action="//span[contains(text(),'Control Tests')]//following::thead/tr/th/div[contains(text(),'Actions')]";
    public String menuCTIcon="//span[contains(text(),'Control Tests')]//following::tbody/tr/td/div/div/button";
   public String menuOTIcon="//span[contains(text(),'Outcome Test')]//following::tbody/tr/td/div/div/button";

   public String menuIcon="//span[contains(text(),'')]//following::tbody/tr/td/div/div/button";
   public String menuUC="//div[contains(@id,'_tetherWrapper')]//li/span[text()='Update Control']";
    public String menuDET="//div[contains(@id,'_tetherWrapper')]//li/span[text()='Manage DET']";
    public String menuOET="//div[contains(@id,'_tetherWrapper')]//li/span[text()='Manage OET']";
    public String menuOT="//div[contains(@id,'_tetherWrapper')]//li/div/span[text()='Manage OT']";
    public String menuDeactive="//div[contains(@id,'_tetherWrapper')]//li/div/span[text()='Deactivate OT']";
    public String oToutcome="//span[contains(text(),'Outcome Tests')]//following::thead/tr/th[@abbr='Outcome Test Name']";

public String deactivateOET_DET="//p/span/strong/a/span";
public String deactivateOTReason="//label[contains(text(),'Rationale for Deactivation')]//following::textarea";

public String planning="//a[contains(text(),'Planning')]";
public String fieldWork="//a[contains(text(),'Fieldwork')]";
public String report="//a[contains(text(),'Reporting')]";
}
