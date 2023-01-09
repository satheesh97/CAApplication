package com.Steps.Definitions;

import com.aventstack.extentreports.view.Ico;
import com.locator.MRCCLocator;
import com.step.steps.*;
import com.step.steps.MRCCTab.MRCCManageStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MenuSubStepDef {
    LandPageStep landPageStep = new LandPageStep();
    WaitStep waitStep=new WaitStep();;
    ManageRiskStep manageRiskStep = new ManageRiskStep();
    AuditStep auditStep =new AuditStep();
    MyTaskStep myTaskStep = new MyTaskStep();
    MRCCManageStep mrccManageStep = new MRCCManageStep();
    @And("I validate the Exceptions page")
    public void iValidateTheExceptionsPage() {

        landPageStep.validateExceptions();

    }

    @And("I validate the Issue page")
    public void iValidateTheIssuePage() {
        landPageStep.validateIssues();
    }

    @Then("I fill the create Exception Form")
    public void iFillTheCreateExceptionForm() {
        myTaskStep.filltheException();
    }
    @Then("I fill the create Exception Form for level two")
    public void iFillTheCreateExceptionFormForLevelTwo() {
        myTaskStep.filltheExceptionLevelTwo();
    }
    @Then("I fill the create Exception Form save")
    public void iFillTheCreateExceptionFormSave() {
        myTaskStep.filltheExceptionSave();
    }
    @And("I move to {string} tab")
    public void iMoveToTab(String tab) {
        waitStep.clickButtonMenu(tab);
    }

    @And("I fill the Create Issue Form")
    public void iFillTheCreateIssueForm() {
        myTaskStep.fllissueForm();
    }

    @And("I fill the Create Issue Form Save")
    public void iFillTheCreateIssueFormSave() {
        myTaskStep.fllissueFormSave();
    }

    @And("I fill the Create Issue Form verify")
    public void iFillTheCreateIssueFormVerify() {
        myTaskStep.fllissueFormVerify();
    }

    @And("I Search the Name under the My Task")
    public void iSearchTheNameUnderTheMyTask() {
        auditStep.searchTasksDashBoard();

    }

    @And("I click the view Action")
    public void iClickTheViewAction() {
        myTaskStep.viewAction();
    }

    @And("I fill the Create Action Form")
    public void iFillTheCreateActionForm() {
        myTaskStep.iFillActionForm();
    }

    @And("I verify the  Action Form")
    public void iVerifyTheActionForm() {
        myTaskStep.iValidateActionfield();
    }

    @And("I clik and capture the {string}")
    public void iClikAndCaptureThe(String name) {
        myTaskStep.ctMenuClick();
        landPageStep.getScreenresult(name);
        myTaskStep.OtMenuClick();
        landPageStep.getScreenresult(name);
    }

    @And("I verify the Audit Program")
    public void iVerifuTheAuditProgram() {
        myTaskStep.ivalidateAuditProgramPage();
    }

    @And("I  fill  the OT Form with exception")
    public void iFillTheOTFormWithException() {
        landPageStep.fillOTformwithException();
        myTaskStep.completeOTException();
    }

    @And("I  fill the DET Form with Exception")
    public void iFillTheDETFormWithException() {
        landPageStep.fillDETException();
        // landPageStep.OTsave();
    }

    @And("I fill the conclusion of DET or OET with OT save")
    public void iFillTheConclusionOfDETOrOETWithOTSave() {
        landPageStep.saveDETforException();
    }
    @And("I fill the conclusion of DET or OET with OT save in L2")
    public void iFillTheConclusionOfDETOrOETWithOTSaveinL2() {
        landPageStep.saveDETforExceptionL2();
        myTaskStep.completeOTException();
    }

    @And("I fill the conclusion of DET or OET save")
    public void iFillTheConclusionOfDETOrOETSave() {
        landPageStep.saveDET_OET();
    }

    @And("I  fill  the OT Form to save")
    public void iFillTheOTFormToSave() {
        landPageStep.fillOTformSave();
    }

    @Then("I click Table {string}")
    public void iClickTable(String Table) {
        auditStep.clickTableBody();
    }

    @And("I fill the Rating Form")
    public void iFillTheRatingForm() {
        mrccManageStep.fillTheRating();
    }

    @Then("I navigat to {string}")
    public void iNavigatTo(String Path) {
        waitStep.clickNaviagtion(Path);
    }

    @And("I fill the tollgate entry")
    public void iFillTheTollgateEntry() {
        mrccManageStep.addPlaningToll();
    }

    @And("I change the Recipients Name")
    public void iChangeTheRecipineName() {
        auditStep.changeRecipient();
    }

    @And("I click the {string} menu")
    public void iClickTheMenu(String Icon) {
        myTaskStep.exceptionMenuClick(Icon);
    }
    @And("I click drop button {string}")
    public void iClickDropButton(String path) {
        myTaskStep.manageOptionMenuClick(path);
    }
    @And("I move to {string} Page")
    public void iMoveToPage(String deactivate) {
        if(deactivate.contains(("Deactivate OT"))){
            myTaskStep.deactivateOt(deactivate);
        }
        else{
            myTaskStep.deactivateOET_DET();

        }
    }

    @And("I fill the deactivate form")
    public void iFillTheDeactivateForm() {
        myTaskStep.deactivateOTReason();
        //waitStep.clickButton("Deactivate");
    }

    @Then("button click for {string}")
    public void buttonClickFor(String name) {
        waitStep.footerDeactivate(name);
    }

    @And("I click text {string}")
    public void iClickText(String Text) {
    waitStep.clickText(Text);
    }

    @Then("I click the {string} for {string}")
    public void iClickTheFor(String stage, String button) {
        myTaskStep.addNewEntity(stage);

    }

    @And("I  validate {string}")
    public void iValidate(String form) {
        mrccManageStep.validateForm(form);
    }

    @And("I manage the GroupStratgy")
    public void iManageTheGroupStratgy() {
        mrccManageStep.manageGroup();
    }

    @And("I remove the Pillar")
    public void iRemoveThePillar() {
        mrccManageStep.removePiller();
    }

    @And("I Verify Activity History")
    public void iVerifyActivityHistory() {
        mrccManageStep.verifyHistroy();
    }



    @And("I fill the {string}")
    public void iFillThe(String name) {
        auditStep.auditScope();
        landPageStep.takeSnapShot(name);
    }

    @And("I fill the {string} Phase")
    public void iFillThePhase(String Phase) {
       mrccManageStep.manageBudget(Phase);
    }

    @And("I fill the Date Field in Audidt Page")
    public void iFillTheDateFieldInAudidtPage() {
        auditStep.fillDate();
    }

    @And("I file the audit lead")
    public void iFileTheAuditLead() {
    mrccManageStep.fillLeadAuidt();
    }

    @And("I validate the Risk is Disable")
    public void iValidateTheRiskIsDiable() {
        mrccManageStep.verifyElemetn();
    }



}
