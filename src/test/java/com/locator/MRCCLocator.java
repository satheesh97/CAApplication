package com.locator;

public class MRCCLocator {
    public String NonMandatory ="//span[contains(text(),' MRCC Indicators')]//following::table/tbody/tr/td/div/p/span[@class='IconWidget---color_secondary']";
    public String tableTextArea="//span[contains(text(),' MRCC Indicators')]//following::table/tbody/tr/td/div/textarea";
    public String tableCheckBox ="//span[contains(text(),' MRCC Indicators')]//following::table/tbody/tr/td/div[contains(@class,'CheckboxGroup')]";

    public  String buttonDisabel="(//button[@type='button'])[19]";

    public String indicativeRating ="//span[contains(text(),' Individual Ratings')]//following::div/span[contains(text(),'Indicative Rating')]//following::div/div/div[contains(@class,'---placeholder')]";

    public String supportRationale="//span[contains(text(),' Individual Ratings')]//following::div/label[contains(text(),'Supporting Rationale')]//following::div/textarea";

    //span[contains(text(),' Individual Ratings')]//following::div/span[contains(text(),'Indicative Rating')]//following::div/div/div[contains(text(),'')]

    public  String exStakeholder="//span[contains(text(),'External Stakeholders')]//following::table/tbody/tr/td/div/textarea";
    public String tollgateDate="//label[contains(text(),'Tollgate Date')]//following::div/div/input";
    public String tasklogDescription="//span[contains(text(),'Decision and Tasks Log')]//following::table/tbody/tr/td/div/textarea";
    public String tasklogtitle= "//span[contains(text(),'Decision and Tasks Log')]//following::table/tbody/tr/td/div/input";
    public String tasklogOwner="//span[contains(text(),'Decision and Tasks Log')]//following::table/tbody/tr/td/div/div/input";

    public String auditlead ="//span[contains(text(),'Lead Audit Manager')]//following::input";
    public String tasklogDate="//span[contains(text(),'Decision and Tasks Log')]//following::table/tbody/tr/td/div/div/input[@placeholder='dd/mm/yyyy']";
    public String addExternalStake="//a[contains(text(),'Add External Stakeholder')]";
    public String addDecision="//a[contains(text(),'Add Decision')]";

    public String taskcheckbox="//span[contains(text(),' Decision and Tasks Log')]//following::table/tbody/tr/td/div/div/div/label";
    public String Owner="Automation Account 1";
    public String auditOwner="Satheesh";

public String MRCCParagraph="//label[contains(text(),'MRCC Para')]//following::textarea";
    public String userRating="//span[contains(text(),'User Rating')]//following::div[contains(text(),'--- Select an User Rating ---')]";
public String userRatingGood="//span[contains(text(),'User Rating')]//following::div/span[contains(text(),'Good')]";
    //span[contains(text(),'User Rating')]//following::div[contains(text(),'--- Select an User Rating ---')]"
    public String userRatingRational="//label[contains(text(),'User Rating Rationale')]//following::textarea";
    public String addGroupStratagy="//div/p/a[contains(text(),'Add Group Strategy Pillar')]";
    public  String groupPiller="//span[contains(text(),'Group Strategy Pillar')]//following::div[contains(@class,'---placeholder')]";
    public String keyInitiatives="//span[contains(text(),'Management Key Initiatives')]//following::div[contains(@class,'---dropdown_value')]";
    public String auditHypothesis ="//label[contains(text(),'Strategic Audit Hypothesis')]//following::textarea";
    public String IAKeyconsiderations="//label[contains(text(),'IA Key Considerations')]//following::textarea";
    public String removeGrop ="//span/a[contains(text(),'Remove')]";
    public String concultion="//label[contains(text(),'Conclusion')]//following::textarea";

public String activityHistoryActivity="//span[contains(text(),'Activity History')]//following::table/thead/tr/th[@abbr='Activity']";
public String activityHistroyDiscription="//span[contains(text(),'Activity History')]//following::table/thead/tr/th[@abbr='Description']";
public String activityHistoryCompleteBy="//span[contains(text(),'Activity History')]//following::table/thead/tr/th[@abbr='Completed By']";
public String activityHistoryCompletOn="//span[contains(text(),'Activity History')]//following::table/thead/tr/th[@abbr='Completed On']";

    public String MRCCIndicator="//table/tbody/tr/td/div/p/span[contains(@class,'---color_positive')]";
    public String MRCCRow="//table/tbody/tr";
    public String MRCCIndiCheck="//table/tbody/tr/td/div[contains(@class,'CheckboxGroup')]";
public String addBudget="//a[contains(text(),'Add Budget')]";
public String phase ="//div[contains(text(),'Select a Phase')]";
public String country ="//div[contains(text(),'Select a Country')]";
public String skill ="//div[contains(text(),'Select a Skill')]";
public String headAudit ="//div[contains(text(),'Select a SME Head of Audit')]";
public String allocatedBudget="//td/div/input[@value='']";
public  String interSection ="//span[contains(text(),'Level 1 Risks')]//following::span/span[@data-placeholder]";

public String preplan ="//p/span[contains(text(),'Pre-planning')]";
public String palnning ="//p/span[contains(text(),'Planning')]";
public String fieldwork ="//p/span[contains(text(),'Fieldwork')]";
public  String clearance ="//p/span[contains(text(),'Clearance and Reporting')]";
public String Total="//p/span[contains(text(),'Total')]";
public String teamMember="//table/thead/tr/th/div/span[contains(text(),'Team Member')]";
public String reviewer ="//table/thead/tr/th/div/span[contains(text(),'Reviewer')]";
public String schedular="//table/thead/tr/th/div/span[contains(text(),'Scheduler')]";
public String addedon="//table/thead/tr/th/div/span[contains(text(),'Added On')]";

public  String Bpahse="//span/span[contains(text(),'Budget Phase')]";
public String location ="//span/span[contains(text(),'Location')]";
public String Bskill="//span/span[contains(text(),'Skill')]";

public String level2Rsik ="//div/label[contains(text(),'Level 2 Risks')]//preceding-sibling::input";
public String level3Risk ="//div/label[contains(text(),'Level 3 Risks')]//preceding-sibling::input";




}
