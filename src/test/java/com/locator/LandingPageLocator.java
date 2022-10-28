package com.locator;

public class LandingPageLocator {

    public String searchButton ="//span[contains(text(),'MY AUDITS')]//following::button[contains(text(),'Search')]";
   public String TaskSearchButtion="//span[contains(text(),'MY TASKS')]//following::button[contains(text(),'Search')]";
    public String searchButton_1 ="//button[contains(text(),'Search')]";
    public  String homeTab ="//a/div[contains(text(),'Home')]";
    public String searchAudit="//input[@placeholder='Search Audits']";
    public String confidentilaIcon="//span[contains(text(),' MY AUDITS')]//following::span[@class='IconWidget---color_secondary']";
    public String name="//span[contains(text(),'MY AUDITS')]//following::th[@abbr='Name']";
    public String sDate ="//span[contains(text(),'MY AUDITS')]//following::th[@abbr='Start Date']";
    public String type="//span[contains(text(),'MY AUDITS')]//following::th[@abbr='Type']";
    public String status ="//span[contains(text(),'MY AUDITS')]//following::th[@abbr='Status']";
    public String aphase="//span[contains(text(),'MY AUDITS')]//following::th[@abbr='Audit Phase']";
    public String keyStaf ="//span[contains(text(),'MY AUDITS')]//following::th[@abbr='Key Staff']";
    public String budget= "//span[contains(text(),'MY AUDITS')]//following::th[@abbr='Budget']";

    public String searchAudits ="//input[@placeholder='Search Audits']";

public String testdata ="//span[contains(text(),'MY AUDITS')]//following::table//following::tr/td/div/p/strong/a";
    public String summary ="//div[contains(text(),'Summary')]";
    public String rAndControls="//div[contains(text(),'Risks and Controls')]";
    public String bandStaff ="//div[contains(text(),'Budget and Staffing')]";
    public String projectMan ="//div[contains(text(),'Project Management')]";
    public String fAndStrategy="//div[contains(text(),'Further Details and Group Strategy')]";
    public String tollgate="//div[contains(text(),'Tollgates')]";
    public String audotProgram ="//div[contains(text(),'Audit Program')]";
    public String verification ="//div[contains(text(),'Verifications')]";
    public String expections ="//div[contains(text(),'Exceptions')]";
    public String issues="//div[contains(text(),'Issues')]";
    public String docAndStake="//div[contains(text(),'Document & Stakeholder Comms')]";
    public String auditProgress ="//div[contains(text(),'Audit Progress')]";
    public String activityHistory="//div[contains(text(),'Activity History')]";
    public String relatedAction ="//div[contains(text(),'Related Actions')]";


    public String sStatus ="//span/strong[contains(text(),'STATUS')]";
    public String annualPlan="//span/strong[contains(text(),'ANNUAL PLAN')]";
    public String SDate ="//span/strong[contains(text(),'START DATE')]";
    public String Rdate="//span/strong[contains(text(),'REPORT DATE')]";
    public String sType ="//span/strong[contains(text(),'TYPE')]";
    public String priority="//span/strong[contains(text(),'PRIORITY')]";



}
