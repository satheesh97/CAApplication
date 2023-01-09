package com.Steps.Definitions;

import com.step.steps.*;
import com.step.steps.DocumentsTab.AnnualPlan;
import com.step.steps.DocumentsTab.DocumentStakeholderComms;
import com.step.steps.DocumentsTab.Verification;
import com.step.steps.MRCCTab.MRCCManageStep;
import io.cucumber.java.en.And;

public class ValidationStepDef {

    LandPageStep landPageStep = new LandPageStep();
    WaitStep waitStep=new WaitStep();;
    ManageRiskStep manageRiskStep = new ManageRiskStep();
    AuditStep auditStep =new AuditStep();
    MyTaskStep myTaskStep = new MyTaskStep();
    MRCCManageStep mrccManageStep = new MRCCManageStep();

    AnnualPlan annualPlan =new AnnualPlan();
    DocumentStakeholderComms docstock = new DocumentStakeholderComms();
    Verification verification = new Verification();
    @And("I fill the APM Managemnt Form for validation")
    public void iFillTheAPMManagemntFormForValidation() {
        docstock.fillMPMform();
    }

    @And("I verify the {string} Radio Option Visiblity")
    public void iVerifyTheRadioOptionVisiblity(String label) {
    }

    @And("I click Radio option {string} As {string}")
    public void iClickRadioOptionAns(String label, String value) {
       verification.rasioOptionVisble(label,value);
    }

    @And("Verify the lnked text {string} visible")
    public void verifyTheLnkedTextVisible(String value) {
        verification.linkTextVisible(value);
    }

    @And("I Validate Warning visible")
    public void iValidateWarningVisible() {
        verification.verifyWarningMessage();
    }

    @And("Validate the Status as {string}")
    public void validateTheStatusAs(String status) {
   verification.vlaidateStatus(status);
    }
}
