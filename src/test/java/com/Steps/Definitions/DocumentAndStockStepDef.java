package com.Steps.Definitions;

import com.step.steps.*;
import com.step.steps.DocumentsTab.AnnualPlan;
import com.step.steps.DocumentsTab.DocumentStakeholderComms;
import com.step.steps.DocumentsTab.Verification;
import com.step.steps.MRCCTab.MRCCManageStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DocumentAndStockStepDef {
    LandPageStep landPageStep = new LandPageStep();
    WaitStep waitStep=new WaitStep();;
    ManageRiskStep manageRiskStep = new ManageRiskStep();
    AuditStep auditStep =new AuditStep();
    MyTaskStep myTaskStep = new MyTaskStep();
    MRCCManageStep mrccManageStep = new MRCCManageStep();

    AnnualPlan annualPlan =new AnnualPlan();
    DocumentStakeholderComms docstock = new DocumentStakeholderComms();
    Verification verification = new Verification();

    @And("I click {string} on {string}")
    public void iClickOn(String print, String path) {
        docstock.printScreen(print,path);
        waitStep.waitPageload();

    }

    @And("I click the admin division information Only COO account")
    public void iClickTheAdminDivisionInformationOnlyCOOAccount() {
        docstock.adminDivision();
    }

    @And("I click the label {string}")
    public void iClickTheLabel(String label) {
        docstock.clickLabel(label);
    }

    @And("I fill the {string} section")
    public void iFillTheSection(String section) {
        docstock.clickSection(section);
    }

    @And("I enter the Data on field {string}")
    public void iEnterTheDataOnField(String field) {
        docstock.enterField(field);
    }

    @And("I fill the {string} table")
    public void iFillTheTable(String table) {
        docstock.fillTabel();
    }

    @And("I click the {string} and {string} menu")
    public void iClickTheAndMenu(String path, String menu) {
        docstock.clickMenu(path, menu);

    }
    @And("I fill expand the Exception")
    public void iFillExpandTheException() {
        myTaskStep.expand();
    }
    @And("I fill the APM Managemnt Form")
    public void iFillTheAPMManagemntForm() {
        docstock.fillMPMform();
        landPageStep.reminderSave();
    }


    @And("I fill the APM Managemnt Form with Audit coverage")
    public void iFillTheAPMManagemntFormWithAuditCoverage() {
        docstock.fillMPMform();
    }
    @And("print the APM Page")
    public void printTheAPMPage() {
        docstock.printPDFRobot();
    }

    @And("I click Print button")
    public void iClickPrintButton() {
        docstock.printSheet();
    }

    @And("I  verify MRCC rating")
    public void iVerifyMRCCRating() {
        docstock.verifyMRCCrating();
    }

    @And("I update the Report Form")
    public void iUpdateTheReportForm() {
        docstock.FillAuitReport();

    }

    @Then("I populate Multidropdown {string} Field")
    public void iPopulateMultidropdownField(String component) {
        docstock.multidropValu(component);
    }

    @Then("I fill TextArea {string}")
    public void iFillTextArea(String textarea) {
        docstock.filltextarea(textarea);

    }
    @Then("I fill Textinput {string}")
    public void iFillTextinput(String type) {
        docstock.fillTextInput(type);
    }
    @And("I Click {string} and capture the {string}")
    public void iClikAndCaptureThe(String locator, String name) {
        docstock.getCapture(locator,name);
    }

    @And("I fill the employee Details")
    public void iFillTheEmployeeDetails() {
        docstock.fillEmployeeDetails();
    }

    @And("i fill the cerate annual Plan")
    public void iFillTheCerateAnnualPlan() {
        annualPlan.fillAnualPaln();
    }

    @And("I search Annual Plan year")
    public void iSearchAnnualPlanYear() {
        annualPlan.searchYear();
    }



    @Then("I click the Radio {string}")
    public void iClickTheRadio(String value) {
        docstock.clickRadioOption(value);
    }

    @And("I verify {string} As {string}")
    public void iVerifyAs(String staus, String info) {
        docstock.stausValidation(staus, info);
    }

    @And("I click  the Live Year {string}")
    public void iClickTheLiveYear(String year) {
        docstock.clickLiveYear(year);
    }

    @And("Drop the Value {string} at {string}")
    public void dropTheValueAt(String Value, String label) {
        annualPlan.singleClickdownwithValue(Value,label);
    }

    @Then("I click function {string}")
    public void iClickFunction(String information) {
        annualPlan.moveLevelUpDowun(information);
    }

    @And("I validate CheckBoxGroup Visiblity")
    public void iValidateCheckBoxVisiblity() {
        docstock.radioGroupVisible();
    }

    @And("I upload the File")
    public void iUploadTheFile() {
        docstock.fileupload();
    }

    @And("I upload the {string} in Indicators")
    public void iUploadTheInIndicators(String message) {
        annualPlan.clickAndUploadDocument(message);
    }

    @And("I select {string} with value {string}")
    public void iSelectWithValue(String question, String value) {
        docstock.multiDropSelect(question,value);
        waitStep.waitPageload();
    }

    @And("I select {string} with single value {string}")
    public void iSelectWithSingleValue(String question, String value) {
        docstock.singleDropSelect(question,value);
        waitStep.waitPageload();
    }

    @And("I fill the publish Audit Form")
    public void iFillThePublishAuditForm() {
        annualPlan.fillpublshReport();
    }

    @And("focuse out the field")
    public void focuseOutTheField() {
        annualPlan.clickForFocus();
    }

    @And("I click the Radio on user label")
    public void iClickTheRadioOnUserLabel() {
        docstock.clickRadioOptionlabel();
    }


    @And("I Validate the Audit Name")
    public void iValidateTheAuditName() {
        annualPlan.validateAuditName();
    }

    @And("I Upload the Doc under the {string}")
    public void iUploadTheDocUnderThe(String name) {
        docstock.fileuploadUnder(name);
    }


    @And("I  click Radio Tabel")
    public void iClickRadioTabel() {
        annualPlan.checkTable();
    }

    @And("clcik the Radio from table")
    public void clcikTheRadioFromTable() {
        verification.clickTableRow();
    }

    @And("I click the icon on Table")
    public void iClickTheIconOnTable() {
        verification.clickAccentIcon();
    }

    @And("I click the menu {string} under {string}")
    public void iClickTheMenuUnder(String MenuOption, String Table) {
        verification.tableMenu(MenuOption,Table);

    }

    @And("I fill the link Test form")
    public void iFillTheLinkTestForm() {
        verification.fillLinkedTable();
    }

    @And("naviagate the to linked Contorl")
    public void naviagateTheToLinkedContorl() {
        verification.summaryOfLinkedControl();
    }


    @And("I  click label {string}")
    public void iClickLabel(String label) {
        verification.clickLabel(label);
    }

    @And("I give input to {string} value {string}")
    public void iGiveInputToValue(String path, String value) {
        verification.inputData(path,value);
    }

    @And("dropdown the question {string} value {string}")
    public void dropdownTheValueAt(String path, String value) {
        verification.singleClickDropdownwithValue(path,value);
    }

    @And("Validate the Verification table")
    public void validateTheVerificationTable() {
        verification.VerifyVerificationField();
    }

    @And("naviagate the to linked Action")
    public void naviagateTheToLinkedAction() {
        verification.summaryOfLinkedAction();
    }

    @And("I select {string} As {string}")
    public void iSelectAs(String question, String value) {
        docstock.clickRadioOption(question,value);
    }

    @And("I select {string} table row")
    public void iSelectTableRow(String table) {
        docstock.selectRow(table);
    }

    @And("I select {string} availabel data")
    public void iSelectAvailabelData(String value) {
        docstock.clickAvilabelvalue(value);
    }


}
