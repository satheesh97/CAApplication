package com.Steps.Definitions;

import com.step.steps.*;
import com.step.steps.MRCCTab.MRCCManageStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class HomeStepDef {

    // LandingPageLocator landingPageLocator
    LoginStep loginStep =new LoginStep();

    LandPageStep landPageStep= new LandPageStep();
    WaitStep waitStep = new WaitStep();
    AuditStep auditStep =new AuditStep();

    MyTaskStep myTaskStep = new MyTaskStep();
    MRCCManageStep mrccManageStep =new MRCCManageStep();
    @And("I Search the Name")
    public void iSearchTheName() {
        auditStep.searchAudit();
    }
    @And("I Search the Name Under Audit")
    public void iSearchTheNameunderAudit() {
        auditStep.searchAuditAudit();
    }
    @Given("Launch the browser")
    public void launchTheBrowser() {
        loginStep.launcbrowserurl();
    }

    @Then("Click the button Submit")
    public void clickTheButtonSubmit() throws InterruptedException {
        waitStep.clickSubmit("name");
    }

    @And("I validate the Auditpage")
    public void iValidateTheAuditpage() throws IOException {
        landPageStep.verifyAndValidate();
    }

    @Then("Click the button {string} and Wait")
    public void clickTheButtonAndWait(String name)   {
        waitStep.clickSubmit(name);
    }

    @And("I validate the Audit")
    public void iValidateTheAudit() throws IOException {
        landPageStep.selectSearchAudit();
        landPageStep.verifyTheDetails();


    }

    @And("I validate the {string}")
    public void iVlaidateThe(String name) throws Exception {
        if(name.equalsIgnoreCase("Summary")){
            landPageStep.selectSearchAudit();
            landPageStep.validateSummary(name);
        }else if(name.equalsIgnoreCase("Audit Program")){


        }

    }


    @And("I Search the {string} with")
    public void iSearchTheNameWith(String name) {
        auditStep.searchAuditName(name);
        //landPageStep.selectSearchAudit();
    }

    @And("I click Evidenc of {string}")
    public void iClickEvidencOf(String name) {
        landPageStep.getScreenresult(name);
    }


    @And("I  fill the DET Form")
    public void iFillTheDETForm() {
        landPageStep.fillDET();
    }


    @And("I filter the intersection field {string}")
    public void iFilterTheIntersectionField(String section) {
        mrccManageStep.intersction(section);
    }

    @And("I select the Table Row")
    public void iSelectTheTableRow() {
        landPageStep.clickTableSelction();
    }

    @And("I click the Menu icon in {string}")
    public void iClickTheMenuIconIn(String data) {
        myTaskStep.manageOT(data);
        myTaskStep.completeOTException();
    }
}
