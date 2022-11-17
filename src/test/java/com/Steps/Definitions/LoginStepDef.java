package com.Steps.Definitions;

import Managers.FileReaderManager;
import com.step.steps.AuditStep;
import com.step.steps.LoginStep;
import com.step.steps.WaitStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoginStepDef  {

    LoginStep loginStep = new LoginStep();


    WaitStep waitStep = new WaitStep();

    AuditStep auditStep= new AuditStep();

    @Given("I Enter the {string} and {string}")
    public void i_enter_the_and(String name, String password) {
        loginStep.launcbrowserurl();
        loginStep.launchUsername(name,password);
    }
    @Given("Click the SignIN")
    public void click_the_sign_in() {
        System.out.println("implemeted in  Stlunchusername");
    }
    @Given("Click the Create Auidt")
    public void click_the_create_auidt() {
        //waitStep.clickButton();

    }

    @Given("wait for {string} seconds")
    public void waitForSeconds(String time) {
        waitStep.waitSec(2);

    }

    @And("Click the Create {string}")
    public void clickTheCreate(String Button) {
        waitStep.clickButton(Button);
    }


    @And("I  click the menu {string}")
    public void iClickTheMenu(String menu) {
        waitStep.clickMenu(menu);
    }

    @And("I fill the Audit form")
    public void iFillTheAuditForm() throws InterruptedException {

        auditStep.auditFill("");
    }
    @And("I fill the Audit form Without Key Date")
    public void iFillTheAuditFormWithoutKeyDate() throws InterruptedException {
        auditStep.auditFillWithoutDate();
    }

    @And("Click the button {string}")
    public void clickTheButton(String Button) {
        waitStep.clickButton(Button);
    }

    @Then("I click submenu {string}")
    public void iClickSubmenu(String Button) {
        waitStep.clickSubMenu(Button);
    }


    @And("wait for PageLaod")
    public void waitForPageLaod() {

    }

    @And("wait for PageLaod {string}")
    public void waitForPageLaod(String Time) {
        waitStep.waitPage(Time);
    }

    @And("I fill the Audit form With {string}")
    public void iFillTheAuditFormWith(String condition) throws InterruptedException {
        auditStep.auditFill(condition);
    }



    @And("I Validate the Confidential Audit")
    public void iValidateTheConfidentialAudit() {
       auditStep.verifyconfirdential();
    }
}
