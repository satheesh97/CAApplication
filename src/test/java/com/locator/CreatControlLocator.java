package com.locator;

public class CreatControlLocator {
    public String title ="//div/label[contains(text(),'Title')]/following::input";
    public String preventiveate ="//label[contains(text(),'Preventive')]";
    public String Detectivate="//label[contains(text(),'Detective')]";
  public String controlDescription="//div/label[contains(text(),'Control Description')]/following::textarea";

  public String Description="//div/label[contains(text(),'Description')]/following::textarea";
  public String objective="//div/label[contains(text(),'Objective')]/following::textarea";
  public String controlType="//div[contains(text(),'--- Select a Control Type ---')]";
  public String frequency="//div[contains(text(),'--- Select a Value ---')]";
   public String levelofAutomation= "//div[contains(text(),'--- Select a Value ---')]";
   public String materialLegalEntity ="//span[@data-placeholder='--- Select one or more Material Legal Entity ---']";
   public String controlSupport="//span[@data-placeholder='--- Select one or more Control Program Supported ---']";
   public String selectL2data ="(//div/div/table/tbody/tr[1])[3]";
   public String selectL3data ="(//div/div/table/tbody/tr[1])[5]";

   public String risk1Table="(//div/div/table/tbody/tr[1])[2]";

   public String level3Task ="//input[@placeholder='Search Level 3 Controls']//following::div/table/tbody/tr/td[1]/div/p/span/strong/a";
}
