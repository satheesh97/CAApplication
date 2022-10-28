package com.Steps.Definitions;

import Managers.AllDriverManager;
import PageObjects.LoginPage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.Wait.untilElementIsVisible;

public class LoginSteps {

    /*TestContext testContext;
    LoginPage loginPage;

    public LoginSteps(TestContext context){
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }
    *//*@Given("User Enter the satheesh.kaliappan and Satheesh1")
    public void user_enter_the_satheesh_kaliappan_and_satheesh1() {
        loginPage.signPage(null, null);
    }
    @Given("User Enter the {string} and {string}")
    public void user_enter_the_and(String name, String pass) {
        loginPage.signPage(name, pass);
    }*//*



    @Given("User Enter the {string} and {string}")
    public void user_enter_the_and(String nm, String pwd) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.signPage(nm, pwd);

    }
    @Given("I click the SignIN")
    public void i_click_the_sign_in() {
        loginPage.clickSubmit();
        //untilElementIsVisible(WebDriver webdriver,)

    }

    @And("I click the Create Auidt")
    public void iClickTheCreateAuidt() {
       loginPage.createAudits();}
    *//*@Given("I click the SignIN")
    public void i_click_the_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/
}
