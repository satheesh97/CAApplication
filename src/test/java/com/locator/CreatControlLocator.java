package com.locator;

public class CreatControlLocator {
    public String title ="//div/label[contains(text(),'Title')]/following::input";
    public String Status ="//div[contains(text(),'--- Select a Status ---')]";
    public String preventiveate ="//label[contains(text(),'Preventive')]";
    public String Detectivate="//label[contains(text(),'Detective')]";
    public String dropTableIndex = ".//div[contains(@id,'_tetherWrapper')]//li";
    public String controlDescription="//div/label[contains(text(),'Control Description')]/following::textarea";

    public String Description="//div/label[contains(text(),'Description')]/following::textarea";
    public String objective="//div/label[contains(text(),'Objective')]/following::textarea";
    public String controlType="//div[contains(text(),'--- Select a Control Type ---')]";
    public String frequency="//div[contains(text(),'--- Select a Value ---')]";
    public String levelofAutomation= "//div[contains(text(),'--- Select a Value ---')]";
    public String materialLegalEntity ="//span[@data-placeholder='--- Select one or more Material Legal Entity ---']";
    public String controlSupport="//span[@data-placeholder='--- Select one or more Control Program Supported ---']";
    public String selectL2data ="//input[@placeholder='Search Level 2 Risks']//following::tbody/tr";
    public String selectL3data ="(//div/div/table)[5]";

    public String risk1Table="//input[@placeholder='Search Level 1 Risks']//following::tbody/tr";

    public String level3Task ="//input[@placeholder='Search Level 3 Controls']//following::div/table/tbody/tr/td[1]/div/p/span/strong/a";

    public String level2Task ="//button[contains(text(),'Remove Level 2 Risk ')]//following::table/tbody/tr/td/div/p/span/strong/a";
    public String menuOTIcon="//span[contains(text(),'Outcome Test')]//following::tbody/tr/td/div/div/button";
    public String menuOT="//div[contains(@id,'_tetherWrapper')]//li/div/span[text()='Manage OT']";
    public String creatExceFrmeOTYes="//div/span[text()='Create Exception from Outcome Test?']//following::div//following::div//following::label[contains(text(),'Yes')]";
    public String creatExceFrmeOTNo="//div/span[text()='Create Exception from Outcome Test?']//following::div//following::div//following::label[contains(text(),'No')]";
    public String exceptionSaveNow="//div/span[text()='Create Exception On Save?']//following::label[contains(text(),'Now')]";
    public String exceptionSaveLater = "//div/span[text()='Create Exception On Save?']//following::label[contains(text(),'Later')]";
public String creatOTTESTYes="//div/span[text()='Create Outcome Test On Save?']//following::div//following::div//following::label[contains(text(),'Yes')]";
public String creatOTTESTNo ="//div/span[text()='Create Outcome Test On Save?']//following::div//following::div//following::label[contains(text(),'No')]";

}

