package com.locator;

import java.security.PublicKey;

public class DocumentandSytackholders {
    public String division = "//span/span[text()='Divisions']";
    public String rowButton ="//td/div/div/button";
    public String addTeamMeber="//div/a[contains(text(),'Add team member')]";
    public String addUser ="//div[contains(text(),'User')]//following::td/div/div/input";
    public String addStartDate ="//div[contains(text(),'Start Date')]//following::td/div/div/input[@placeholder='dd/mm/yyyy' and @value='']";
    public String addendDate="//div[contains(text(),'Start Date')]//following::td/div/div/input[@placeholder='dd/mm/yyyy' and @value='']";
    public String removeBtn="//div/a/img[@aria-label='Remove']";
    public String addchangeProgram="//div/a[contains(text(),'Add Change Program')]";
    public String tabeldata ="//tr/td/div/input";
    public String APMStatusFinal="//label[contains(text(),'Finalised')]";
    public String APMApproach="//div[contains(text(),'Approach')]//following::td/div/textarea";
    public String grpriskthemYes="//span[contains(text(),'Risk Themes relevant to this Audit?')]//following::label[text()='Yes']";
    public String riskThemCoverageSummary="//label[contains(text(),'Risk Theme Coverage Summary')]//following::textarea";
    public  String PIAOverrideRationale="//label[contains(text(),'PIA Override Rationale')]//following::textarea";
    public String skillsAndPeople="//label[contains(text(),'Why we have the right budget, skills and people')]//following::textarea";
    public String concurringReview="//span[contains(text(),'Concurring Reviewer Required?')]//following::label[text()='Yes']";
    public String enagaementConcurring="//span[text()='Engagement Concurring Reviewer']//following::div/div/input";
    public String reviewerAssessmentrational="//label[contains(text(),'Engagement Concurrent Reviewer Assessment Rationale')]//following::textarea";
    public String addauditRecipient ="//div/a[contains(text(),'Add audit recipien')]";
    public String addEmp="//td/div/div/input";
    public String reterospectiveRivew="//span[contains(text(),'Is this a Retrospective Review?')]//following::label[text()='Yes']";
    public String addpriorAuditCoverage="//span[contains(text(),'Add prior audit coverage?')]//following::label[text()='Yes']";
    public String workOthers="//label[contains(text(),'Will this audit response rely on the work of others?')]//following::textarea";
    public String executiveSummary="//label[contains(text(),'Executive Summary')]//following::textarea";

    public String printButton="//input[@type='button']";
    public String OpninRating="//input//following::label[text()='C']";
    public String RemediationPeriod="//label[text()='Remediation Period']";
    public String RemediationPerioddate="//label[text()='Remediation Period']//following::input";

    public String deliveryRiskRating="//span[text()='Delivery Risk Rating']";
    public String relevanceCategory="//span/span[contains(@data-placeholder,'--- Select one or more Relevance Category ---')]";
    public String objective = "//div/label[contains(text(),'Objective')]//following::textarea";

    public String additonalEmployee="//a[contains(text(),'Add Additional Employees')]";

    public String manualRecipents="//a[contains(text(),'Add Additional Recipient')]";
    public String searchemployee="//td/div/div/input[@placeholder='Search Employees']";
    public String planYear="//label[contains(text(),'Plan Year')]//following::input";
    public String startDate="//label[contains(text(),'Start Date')]//following::input";
    public String budgetdays="//div[contains(text(),'Budget (days)')]//following::input";
    public String aletr ="//div[@role='alert']";
    public String planyearValue="//span[text()=' Details']//following::input[@placeholder and @value]";

    public String searchYear="//input[@placeholder='Search Annual Plans']";
    public String planyeardate="//span[contains(text(),'ANNUAL')]//following::td/div/p/span";

public String fileInput="//input[@type='file']";
public String  filePath=System.getProperty("user.dir") + "\\src\\test\\resources\\document\\testdoc.pdf";
public String auditReportIndex="//label[contains(text(),'Audit Report Index')]//following::input";
public String managmentResponse="//span[contains(text(),'User')]//following::input";
public String alert ="//div[@role='alert']";



}
