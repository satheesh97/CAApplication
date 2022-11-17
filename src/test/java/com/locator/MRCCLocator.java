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
    public String tasklogDescription="//span[contains(text(),' Decision and Tasks Log')]//following::table/tbody/tr/td/div/textarea";
    public String tasklogtitle= "//span[contains(text(),' Decision and Tasks Log')]//following::table/tbody/tr/td/div/input";
    public String tasklogOwner="//span[contains(text(),' Decision and Tasks Log')]//following::table/tbody/tr/td/div/div/input";
    public String tasklogDate="//span[contains(text(),' Decision and Tasks Log')]//following::table/tbody/tr/td/div/div/input[@placeholder='dd/mm/yyyy']";
    public String addExternalStake="//a[contains(text(),'Add External Stakeholder')]";
    public String addDecision="//a[contains(text(),'Add Decision')]";

    public String taskcheckbox="//span[contains(text(),' Decision and Tasks Log')]//following::table/tbody/tr/td/div/div/div/label";
    public String Owner="Automation";

    public String userRating="//span[contains(text(),'User Rating')]//following::div[contains(text(),'--- Select an User Rating ---')]";






}
