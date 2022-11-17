package com.Steps.Definitions;

import com.step.steps.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;

public class SummaryStepDef {
    LandPageStep landPageStep = new LandPageStep();
    WaitStep waitStep=new WaitStep();;
    ManageRiskStep manageRiskStep = new ManageRiskStep();
    AuditStep auditStep =new AuditStep();
    MyTaskStep myTaskStep = new MyTaskStep();

    @And("I take Evidence of the {string} tap")
    public void iTakeEvidenceOfTheTap(String name) {
        landPageStep.selectSearchAudit();
        waitStep.clickButtonMenu(name);
        landPageStep.getScreenresult(name);
    }

    @And("I move and file the Risk Level {string}")
    public void iMoveAndFileTheRiskLevel(String riskLevel) {
        landPageStep.selectSearchAudit();

    }

    @And("I Move to {string}")
    public void iMoveTo(String menu) {
        landPageStep.selectSearchAudit();
        waitStep.clickButtonMenu(menu);
        if(menu.contains("Risks and Controls")) {
            waitStep.clickButton("Manage Risk Assessment Intersections");
        }
    }

    @And("file the Risk level {string}")
    public void fileTheRiskLevel(String riskLevel) {
        landPageStep.riskLevel(riskLevel);
    }

    @And("I file the Level two of risk")
    public void iFileTheLevelOfRisk() {
         landPageStep.leve2RowClick();
        waitStep.clickButton("Manage Level 2 Risk");
        landPageStep.multiselect();
        waitStep.clickSubmit("Submit");
        landPageStep.leve2RowClick();
        landPageStep.leve2RiskClick();
        waitStep.clickButton("Create Control");
        landPageStep.ifileNewControlAtL2();
    }



    @And("I file the Level three of risk")
    public void iFileTheRiskthreeLevel() {
    landPageStep.Leve3Application();
    }

    @And("I can see {string}")
    public void iCanSee(String Page) {
        waitStep.driverwait5();
        waitStep.clickButtonMenu(Page);
        landPageStep.getScreenresult(Page);
    }




    @And("I Validate the image color for Risk Dashboard")
    public void iValidateTheImageColorForRiskDashboard() {
        manageRiskStep.validateTabel();
    }

    @And("I click the Tabel Level")
    public void iClickTheTabelLevel() {
        landPageStep.clickTheTable();
    }

    @And("I Move to {string} option")
    public void iMoveToOption(String menu) {
        landPageStep.selectSearchAudit();
        waitStep.clickButtonMenu(menu);
    }

    @And("I Create and Edit the DET\\/OET Form")
    public void iCreateAndEditTheDETForm() {

    }

    @Then("I click menu Button {string}")
    public void iClickMenuButton(String Buttonmenu) {
    waitStep.clickSubMenuButton(Buttonmenu);
    }

    @And("I fill the conclusion of DET or OET")
    public void iFillTheConclusionOfDET() {
         landPageStep.submitDET();
    }

    @And("I fill the OET form")
    public void iFillTheOETForm() {
        landPageStep.fillOET();
    }


    @And("I Create and Edit the DET or OET Form")
    public void iCreateAndEditTheDETOrOETForm() {
        landPageStep.fillDETForm();
    }

    @And("I  fill  the OT Form")
    public void iFillTheOTForm() {
        landPageStep.fillOTform();
    }

    @Then("I fill the Control in {string}")
    public void iFillTheControlIn(String name) {
        landPageStep.fillControl();
    }

    @And("I Search the Name under the {string}")
    public void iSearchTheNameUnderThe(String Task) {
        auditStep.searchTasks();    }

    @And("I Select the Type {string} And {string}")
    public void iSelectTheTypeAnd(String Type, String action) {
        myTaskStep.selectTaskType(Type,action);
    }

    @Then("I capture the {string}")
    public void iCaptureThe(String name) {
        landPageStep.getScreenresult(name);
    }

    @And("I Search the Name under Audits")
    public void iSearchTheNameUnderAudits() {
        auditStep.searchAuditforDasboard();
    }
}
