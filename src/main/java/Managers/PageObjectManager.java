package Managers;

import PageObjects.Auditpage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private final WebDriver webDriver;

    private LoginPage loginPage;
    private Auditpage auditpage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPage getLoginPage() {

        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }

    public Auditpage getAuditpage() {


        return auditpage;
    }
}
